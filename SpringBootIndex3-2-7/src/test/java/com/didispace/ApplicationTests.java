package com.didispace;

import com.didispace.domain.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
//@Transactional
public class ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	@Rollback
	public void findByName() throws Exception {
		int ccccc = userMapper.insert("33333", 20);
//		System.out.println(ccccc);
//		User u = userMapper.findByName("ccccc");
//		Assert.assertEquals(20, u.getAge().intValue());
	}

}