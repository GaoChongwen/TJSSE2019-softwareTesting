package tongji.sse.student.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import tongji.sse.student.domain.Course;
import tongji.sse.student.domain.Teacher;
import tongji.sse.student.domain.TeacherExample;
import tongji.sse.student.domain.User;

public interface TeacherMapper extends Mapper<Teacher> {

    @Select({"SELECT "
            + " u.* "
            + " FROM "
            + " teacher t, user u"
            + " WHERE "
            + " t.teacher_number = #{id} and t.user_id = u.id"})
    User selectUserById(@Param("id") String id);


}