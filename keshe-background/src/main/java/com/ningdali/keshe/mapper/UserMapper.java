package com.ningdali.keshe.mapper;

import com.ningdali.keshe.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id} and password=#{password}")
    public User getUserByIdAndPassword(String id,String password);

    @Insert("insert into user(id,password) values (#{user.id},#{user.password}) ")
    public int insertUser(User user);

    @Delete("delete from user where id=#{user.id} and password=#{user.password}")
    public int delectUserByIdAndPassword(User user);

    @Update("update user set password = #{user.password} where id = #{user.id}")
    public int updateUserByUser(User user);
}
