package tongji.sse.student.service;
import org.bcos.web3j.abi.datatypes.Bool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.bcos.web3j.protocol.Web3j;
import org.bcos.web3j.protocol.channel.ChannelEthereumService;
import org.bcos.web3j.abi.datatypes.Utf8String;
import org.bcos.web3j.abi.datatypes.generated.Uint256;
import org.bcos.web3j.crypto.Credentials;
import org.bcos.web3j.crypto.ECKeyPair;
import org.bcos.web3j.crypto.Keys;
import org.bcos.web3j.protocol.core.methods.response.EthBlockNumber;
import org.bcos.web3j.protocol.core.methods.response.Log;
import org.bcos.web3j.protocol.core.methods.response.TransactionReceipt;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tongji.sse.student.StuManager;
import tongji.sse.student.StudentApplication;
import tongji.sse.student.domain.Semester;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


@Service
@Component
public class BCService {
    static Logger logger = LoggerFactory.getLogger(StudentApplication.class);
    public static Web3j web3j;
    // ????????????
    public static java.math.BigInteger gasPrice = new BigInteger("1");
    public static java.math.BigInteger gasLimit = new BigInteger("30000000");
    public static java.math.BigInteger initialWeiValue = new BigInteger("0");
    public static ECKeyPair keyPair;
    public static Credentials credentials;
    public static String contractAddress = "0xd737698189603da16ab0212521f6ef46c03b007b";
    /*deploy the contract,get address from blockchain*/
//    private ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    public static boolean inited = false;

    public static Integer initServer() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        org.bcos.channel.client.Service service = context.getBean(org.bcos.channel.client.Service.class);
        service.run(); // run the daemon service
        // init the client keys
        keyPair = Keys.createEcKeyPair();
        credentials = Credentials.create(keyPair);

        logger.info("-----> start connect !");
        logger.info("init AOMP ChannelEthereumService");
        ChannelEthereumService channelEthereumService = new ChannelEthereumService();
        channelEthereumService.setChannelService(service);

        // init webj client base on channelEthereumService
        web3j = Web3j.build(channelEthereumService);
        /*------------------init done start test--------------------------------*/


        //test get blocknumber,just optional steps

        EthBlockNumber ethBlockNumber = web3j.ethBlockNumber().sendAsync().get();
        int startBlockNumber  =ethBlockNumber.getBlockNumber().intValue();
        logger.info("-->Got ethBlockNumber:{}", startBlockNumber);


//		deployCounter(); //if test deploy,uncomment this line
//		testCounter();
        /*print block number after some transactions*/
        ethBlockNumber = web3j.ethBlockNumber().sendAsync().get();
        int finishBlockNumber  =ethBlockNumber.getBlockNumber().intValue();
        logger.info("<--start blockNumber = "+startBlockNumber+",finish blocknmber="+finishBlockNumber);
        inited = true;
        return finishBlockNumber;
    }

    public static void addRecord(Integer studentId, String fileHash, String name, String year, String month ) throws Exception, ExecutionException, InterruptedException {
        BCService.initServer();
        StuManager stuManager = StuManager.load(contractAddress,web3j,credentials,gasPrice,gasLimit);
        Uint256 id = new Uint256(studentId);
        Utf8String utf8Type= new Utf8String("[PartCV]");
        Utf8String utf8Name = new Utf8String(name);
        Utf8String hash = new Utf8String(fileHash);
        stuManager.activeStu(id);
        stuManager.addCert(id,utf8Type,utf8Name,hash);
        EthBlockNumber ethBlockNumber = web3j.ethBlockNumber().sendAsync().get();
        int finishBlockNumber  =ethBlockNumber.getBlockNumber().intValue();
        logger.info("finish blocknmber="+finishBlockNumber);

    }

    public static void addGrade(Integer studentId, String year, String name, String grade, String semester) {
        StuManager stuManager = StuManager.load(contractAddress,web3j,credentials,gasPrice,gasLimit);
        Uint256 id = new Uint256(studentId);
        Utf8String utf8Year = new Utf8String(year);
        Utf8String utf8Name = new Utf8String(name);
        Utf8String utf8Grade = new Utf8String(grade);
        Utf8String utf8Semester = new Utf8String(semester);
        stuManager.addSubGrade(id,utf8Year,utf8Semester,utf8Name,utf8Grade);
    }


    public static Bool verify(Integer id, String hash) throws Exception {

        StuManager stuManager = StuManager.load(contractAddress, web3j, credentials, gasPrice, gasLimit);
        Uint256 stuId = new Uint256(id);
        Utf8String utf8Hash = new Utf8String(hash);
        Future<Bool> result = stuManager.verifyCert(stuId,utf8Hash);
        return result.get();
    }


}
