package tongji.sse.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;
import tongji.sse.student.domain.Company;
import tongji.sse.student.domain.CompanyExample;
import tongji.sse.student.domain.User;

public interface CompanyMapper extends Mapper<Company> {

    @Select({"SELECT "
            + " u.* "
            + " FROM "
            + " user u"
            + " WHERE "
            + " u.id = #{id}"})
    User selectCompanyByComId(@Param("id") Integer id);
}