package tongji.sse.student.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import tongji.sse.student.domain.Course;
import tongji.sse.student.domain.CourseExample;
import tongji.sse.student.domain.Student;

public interface CourseMapper extends Mapper<Course> {
    @Select("select u.* "+
            "from student u, user_study_course uc "+
            "where u.user_id = uc.user_id and uc.course_id= #{courseId}")
    ArrayList<Student> getStudentList(@Param("courseId") Integer courseId);

    @Select("select max(id) "+
            "from course ")
    Integer getMaxId();

    @Select("select c.* "+
            "from course c, user_study_course uc "+
            "where c.id = uc.course_id and uc.user_id= #{userId} limit 5")
    ArrayList<Course> getStudentCourseList(@Param("userId") Integer userId);



    @Select("select * " +
            "from course " +
            "where teacher_user_id=#{id}")
    ArrayList<Course> selectMyCourse(@Param("id") Integer id);


    @Select("select c.* " +
            "from course c, user_study_course u " +
            "where u.user_id=#{id} and c.id=u.course_id")
    ArrayList<Course> selectStudentCourse(@Param("id") Integer id);






}