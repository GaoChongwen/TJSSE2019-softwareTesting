package tongji.sse.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import tongji.sse.student.domain.Semester;
import tongji.sse.student.domain.SemesterExample;

public interface SemesterMapper extends Mapper<Semester> {
    @Select("select s.* "+
            "from semester s "+
            "where s.season=#{season} and s.year = #{year}")
    Semester getSemester(@Param("year") Integer year, @Param("season") String season);


    @Select("select max(id) "+
            "from semester")
    Integer getMaxId();
}