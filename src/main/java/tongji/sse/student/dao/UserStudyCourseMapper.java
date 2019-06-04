package tongji.sse.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;
import tongji.sse.student.domain.UserStudyCourse;
import tongji.sse.student.domain.UserStudyCourseExample;

public interface UserStudyCourseMapper extends Mapper<UserStudyCourse> {

    @Select("select u.* from user_study_course u " +
            " where  u.user_id=#{userId} and u.course_id=#{courseId}")
    UserStudyCourse selectOneById(@Param("userId") Integer userId, @Param("courseId") Integer courseId);



    @Update(
            "update user_study_course u set u.score  = #{score} where u.user_id = #{userId}  and u.course_id=#{courseId} ")
    void updateScore(@Param("courseId") Integer courseId, @Param("userId") Integer userId,@Param("score") Double score);

}

