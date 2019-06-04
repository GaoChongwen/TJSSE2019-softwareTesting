package tongji.sse.student.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;
import tongji.sse.student.domain.Experience;
import tongji.sse.student.domain.ExperienceExample;

public interface ExperienceMapper extends Mapper<Experience> {
    @Select("select e.* "+
            "from experience e "+
            "where e.user_id=#{userId}")
    ArrayList<Experience> getUserExpList(@Param("userId")Integer userId);


    @Select("select max(id) "+
            "from experience ")
    Integer getMaxId();

    @Select("select e.* "+
            "from experience e "+
            "where e.id=#{fileId}")
    Experience getOne(@Param("fileId")Integer fileId);

    @Update("update experience set status = #{status} where id=#{id}")
    void updateStatus(@Param("status") Integer status, @Param("id") Integer id);




}