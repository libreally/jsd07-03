package cn.tedu.boot10.mapper;

import cn.tedu.boot10.pojo.entity.Player;
import cn.tedu.boot10.pojo.vo.PlayerVO;
import org.springframework.stereotype.Repository;


public interface PlayerMapper {
    PlayerVO selectById(int id);
}
