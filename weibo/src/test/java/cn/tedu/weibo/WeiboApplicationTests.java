package cn.tedu.weibo;

import cn.tedu.weibo.mapper.UserMapper;
import cn.tedu.weibo.mapper.WeiboMapper;
import cn.tedu.weibo.pojo.dto.UserDTO;
import cn.tedu.weibo.pojo.entity.Weibo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.util.Date;

@SpringBootTest
class WeiboApplicationTests {
@Autowired(required = false)
	UserMapper userMapper;
	@Test
	void contextLoads() {
		UserDTO userDTO = new UserDTO("tom","123","汤姆");
		userMapper.insert(userDTO);
	}
	@Test
	void t1(){
		System.out.println(userMapper.selectByUsername("tom"));
	}

	@Autowired(required = false)
	WeiboMapper mapper;
	@Test
	void t2(){
		Weibo weibo = new Weibo();
		weibo.setContent("dfsf");
		weibo.setUrl("efadaa1f-77ed-4f5d-be20-e25b2f4a78e2");
		weibo.setCreated(new Date());
		weibo.setUserId(1);
		mapper.insert(weibo);
	}
}
