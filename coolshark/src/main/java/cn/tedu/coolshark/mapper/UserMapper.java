package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.pojo.vo.UserVO;
import org.springframework.stereotype.Repository;


public interface UserMapper {
    UserVO selectByUsername(String username);
}
