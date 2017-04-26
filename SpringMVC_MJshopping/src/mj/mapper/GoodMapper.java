package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import mj.domain.Good;

public interface GoodMapper {

	@Select("select * from tb_good")
	List<Good> findAll();

}
