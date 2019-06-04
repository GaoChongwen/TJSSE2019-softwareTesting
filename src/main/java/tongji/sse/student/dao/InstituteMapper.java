package tongji.sse.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tongji.sse.student.domain.Institute;
import tongji.sse.student.domain.InstituteExample;

public interface InstituteMapper extends Mapper<Institute>, MySqlMapper<Institute> {

    @Select("select max(id) "+
            "from institute ")
    Integer getMaxId();
}