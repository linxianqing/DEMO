package com.lingbang;

import com.LingbangApplication;
import com.lingbang.mapper.User;
import com.lingbang.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LingbangApplication.class)
public class LingbangApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void insert() throws Exception {
//        User user = new User();
//        user.setUsername("111");
//        user.setOid("111");
//        user.setPassword("1111");
//        userMapper.insert(user);
		User user = userMapper.selectByPrimaryKey("1");
		System.out.println(user.toString());
	}

}
