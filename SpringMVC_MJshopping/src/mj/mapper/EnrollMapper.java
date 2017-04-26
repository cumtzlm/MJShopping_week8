package mj.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.User;

public interface EnrollMapper {
	
	@Select("insert into tb_user values(#{id},#{name},#{pwd})")
	User insertuser(@Param("name")String name,@Param("id")String id,
			@Param("pwd") String pwd);
}
