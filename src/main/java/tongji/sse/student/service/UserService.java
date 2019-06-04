package tongji.sse.student.service;

import jnr.ffi.annotations.In;
import org.bcos.web3j.abi.datatypes.Int;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tongji.sse.student.dao.*;
import tongji.sse.student.domain.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
@Component

// interface UserServiceInterface {
//    String createUser(String name, String password, String phone, String email);
//    public User userExited(User user);
//    public boolean varifyUser(User user);
//    public User findUser(User user);
//    public String registerUser(User user);
//    public Integer generateId();
//    public String createUserInfo(Object user) throws Exception;
//}




public class UserService  {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private InstituteMapper instituteMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private CompanyMapper companyMapper;


    public String createUser(String name, String password, String phone, String email) {
        User user = new User(0, phone, name, password, email, 1, "001", 123);
        userMapper.insert(user);
        return "ok";
    }



    public User getUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    // Get a user by phone or email

    public User userExited(User user) {
        User targetUser = null;
        if (user.getPhone() != null) {
            targetUser = userMapper.selectUserByPhone(user.getPhone());
        } else {
            targetUser = userMapper.selectUserByEmail(user.getEmail());
        }

        // Check if the user exist
        if (targetUser == null) {
            return null;
        }
        return targetUser;
    }

    public boolean varifyUser(User user1, User user2) {
        if (user1 == null
        ||user2 == null
        ||user2.getPassword() == null
        || user1.getPassword() == null
        || !user1.getPassword().equals(user2.getPassword())) {
            System.out.println(user1);
            System.out.println(user2);
            return false;
        } else {
            return true;
        }

    }

    // Get a user by email or phone

    public User findUser(User user) {
        User targetUser = null;
        if (user.getPhone() != null) {
            targetUser = userMapper.selectUserByPhone(user.getPhone());
        } else if (user.getEmail() != null) {
            targetUser = userMapper.selectUserByEmail(user.getEmail());
        }
        return targetUser;
    }

    public User getUserByType(User user) {
        User targetUser = null;
        if (user.getId() == null || user.getUserType() == null) {
            return targetUser;
        }
        switch (user.getUserType()) {
            case 0:
                targetUser = studentMapper.selectUserByStuId(user.getId().toString());
                break;
            case 1:
                targetUser = teacherMapper.selectUserById(user.getId().toString());
                break;
            case 2:
                targetUser = userMapper.selectUserById(user.getId());
                break;
            case 3:
                targetUser = companyMapper.selectCompanyByComId(user.getId());
                break;
                default:
                    break;

        }
        return targetUser;
    }

    public Integer getStudentUid(String stuId) {
        return studentMapper.selectUidByStuId(stuId);
    }


    public String registerUser(User user) {
        // Validate the id
        if (userMapper.existsWithPrimaryKey(user.getId())) {
            return "ID " + user.getId() + " already registered";
        }
        // Validate the Email address
//        if (userMapper.selectUserByEmail(user.getEmail()) != null) {
//            return "Email " + user.getEmail() + " already registered";
//        }
        // Validate the Phone number
        if (userMapper.selectUserByPhone(user.getPhone()) != null) {
            return "Phone number " + user.getPhone() + " already registered";
        }

        // Start Registering
        userMapper.insert(user);
        return "Registered Successfully!";
    }

    public Integer generateId() {
        Integer id = userMapper.getMaxId();
        if (id == null) {
            return 1;
        } else {
            return id + 1;
        }
    }



    // Create information for student user
    public String createUserInfo(Object user) throws Exception {
        try {
            if (user instanceof Student) {
                studentMapper.insert((Student)user);
            } else if (user instanceof Teacher) {
                teacherMapper.insert((Teacher)user);
            } else if (user instanceof Company) {
                companyMapper.insert((Company)user);
            }

        } catch (Exception e) {
            throw e;
        }
        return "OK";
    }



 public Integer getInstituteId(Integer id) {
        return userMapper.getInstituteId(id);
 }

 public Integer registerStudent(Student student) throws Exception {
        try {
            studentMapper.insert(student);
        } catch (Exception e) {
            throw e;
        }
        return 0;
 }


private Integer generateInstituteId() {
        Integer maxId = instituteMapper.getMaxId();
        if (maxId == null) {
            return 1;
     } else {
            return maxId + 1;
        }
 }


 public Integer createInstitude(Institute institute) throws Exception {
        institute.setId(generateInstituteId());
        try {
            instituteMapper.insert(institute);
        } catch (Exception e) {
            throw e;
        }
        return institute.getId();
 }

 public void registerCompany(Company company) throws Exception {
        try {
            companyMapper.insert(company);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
 }

 public void registerTeacher(Teacher teacher) throws Exception {
        try {
            teacherMapper.insert(teacher);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
 }


 public Map<String,Object> getIndexNumber() {
        Map<String, Object> nums = new HashMap<String, Object>();
        nums.put("stuNum", userMapper.getStudentNumber());
        nums.put("teaNum", userMapper.getTeacherNumber());
        nums.put("comNum", userMapper.getCompanyNumber());
        nums.put("subNum", userMapper.getCourseNumber());
        nums.put("gradeNum", userMapper.getGradeNumber());
        nums.put("recordNum", userMapper.getFileNumber()+10);
        nums.put("cerNum", userMapper.getFileNumber());
//        nums.put("")
        return nums;
 }











}

