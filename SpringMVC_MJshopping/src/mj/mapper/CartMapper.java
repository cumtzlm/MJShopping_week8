package mj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import mj.domain.Cart;


public interface CartMapper {

	@Select("insert into tb_cart values(#{user_id},#{good_name},#{good_number})")
	Cart insertcart(@Param("user_id")String user_id,@Param("good_name")String good_name,@Param("good_number")int good_number);
	
	@Select("select * from tb_cart where cart_id=#{user_id}")
	List<Cart> readcart(@Param("user_id")String user_id);

	@Select("update tb_cart set cart_id=#{user_id},cart_name=#{good_name},cart_number=#{good_number} where cart_id=#{user_id} and cart_name=#{good_name}")
	Cart updatecart(@Param("user_id")String user_id,@Param("good_name")String good_name,@Param("good_number")int good_number);
	
	@Select("select * from tb_cart where cart_id=#{user_id} and cart_name=#{good_name}")
	Cart getAll(@Param("user_id")String user_id,@Param("good_name")String good_name);
	
}
