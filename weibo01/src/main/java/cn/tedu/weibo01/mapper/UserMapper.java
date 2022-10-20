package cn.tedu.weibo01.mapper;

import cn.tedu.weibo01.pojo.dto.UserDTO;
import cn.tedu.weibo01.pojo.vo.UserVO;

public interface UserMapper {
    UserVO selectSelectByUsername(String username);
    void insert(UserDTO user);
}
