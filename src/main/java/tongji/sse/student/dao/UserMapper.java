package tongji.sse.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tongji.sse.student.domain.User;
import tongji.sse.student.domain.UserExample;

public interface UserMapper extends Mapper<User>, MySqlMapper<User> {

    @Select({"SELECT "
            + " u.* "
            + " FROM "
            + " user u"
            + " WHERE "
            + " u.phone = #{phone}"})
    User selectUserByPhone(String phone);


    @Select({"SELECT "
            + " u.* "
            + " FROM "
            + " user u"
            + " WHERE "
            + " u.id = #{id}"})
    User selectUserById(Integer id);


    @Select({"SELECT "
            + " u.* "
            + " FROM "
            + " user u"
            + " WHERE "
            + " u.email = #{email}"})
    User selectUserByEmail(String email);

    @Select({"SELECT "
            + " u.password "
            + " FROM "
            + " user u"
            + " WHERE "
            + " u.phone = #{phone}"})
    User selectUserPasswordByPhone(String phone);



    @Select({"SELECT "
            + " u.password "
            + " FROM "
            + " user u"
            + " WHERE "
            + " u.email = #{email}"})
    User selectUserPasswordByEmail(String email);

    @Select({"SELECT "
            + " max(id) "
            + " FROM "
            + " user u"})
    Integer getMaxId();


    @Select({"select u.institute_id "+
            "from user u "+
            "where u.id=#{userId}"})
    Integer getInstituteId(@Param("userId") Integer userId);


    @Select({"select count(*)" +
            "from student "})
    Integer getStudentNumber();

    @Select({"select count(*)" +
            "from teacher "})
    Integer getTeacherNumber();

    @Select({"select count(*)" +
            "from company "})
    Integer getCompanyNumber();

    @Select({"select count(*)" +
            "from user_study_course "})
    Integer getGradeNumber();

    @Select({"select count(*)" +
            "from course "})
    Integer getCourseNumber();

    @Select({"select count(*)" +
            "from experience "})
    Integer getFileNumber();

}