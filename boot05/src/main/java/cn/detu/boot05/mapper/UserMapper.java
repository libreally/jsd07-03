package cn.detu.boot05.mapper;

import cn.detu.boot05.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select password from user where username=#{usename}")
    User selectByUsername(String username);

    @Insert("insert into user values (null,#{username},#{password},#{nickname},#{age})")
    void insert(User user);
}
