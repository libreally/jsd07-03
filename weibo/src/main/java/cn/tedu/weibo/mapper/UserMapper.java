package cn.tedu.weibo.mapper;

import cn.tedu.weibo.pojo.dto.UserDTO;
import cn.tedu.weibo.pojo.vo.UserVO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 注册
     * @param userDTO
     */
    void insert(UserDTO userDTO);
    UserVO selectByUsername(String username);
    /**
     * 登录
     */

}
