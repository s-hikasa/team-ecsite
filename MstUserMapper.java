package jp.co.internous.wasabi.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import jp.co.internous.wasabi.model.domain.MstUser;


@Mapper
public interface MstUserMapper {
	
	//* ユーザー名重複確認
	@Select("SELECT * FROM mst_user WHERE user_name = #{userName}")
	MstUser findByUserName(
			@Param("userName") String userName);
	
	//* ユーザー情報呼び出し 
	@Select("SELECT * FROM mst_user WHERE user_name = #{userName} AND password = #{password}")
	MstUser findByUserNameAndPassword(
			@Param("userName") String userName,
			@Param("password") String password);
	
	//* ユーザー情報新規登録
	@Insert("INSERT INTO mst_user (user_name, password, family_name, first_name, family_name_kana, first_name_kana, gender)" +
			"VALUES (#{userName},#{password},#{familyName},#{firstName},#{familyNameKana},#{firstNameKana}, #{gender})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	int insert(MstUser mstUser);
	
	//* パスワード再設定用
	@Update("UPDATE mst_user SET password = #{password} WHERE user_name = #{userName}")
	int update(MstUser mstUser);
	
}
