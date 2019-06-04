package tongji.sse.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import tongji.sse.student.domain.Student;
import tongji.sse.student.domain.StudentExample;
import tongji.sse.student.domain.User;

public interface StudentMapper extends Mapper<Student> {

    // Select a student object from the database
    @Select({"SELECT "
            + " u.* "
            + " FROM "
            + " student s, user u"
            + " WHERE "
            + " s.user_id = #{id}"})
    User selectStudentById(@Param("id") Integer id);


    @Select({"SELECT "
            + " u.* "
            + " FROM "
            + " student s, user u"
            + " WHERE "
            + " s.student_number = #{id} and s.user_id=u.id"})
    User selectUserByStuId(@Param("id") String id);

    @Select({"SELECT "
            + " u.id "
            + " FROM "
            + " student s, user u"
            + " WHERE "
            + " s.student_number = #{id} and s.user_id=u.id"})
    Integer selectUidByStuId(@Param("id") String id);



}