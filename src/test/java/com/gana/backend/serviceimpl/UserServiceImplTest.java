package com.gana.backend.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gana.backend.model.User;
import com.gana.backend.service.UserService;

@SpringBootTest
class UserServiceImplTest {

	@Autowired
	private UserService userService;

	@Test
	void testFindByUserName() {
		assertNotNull(userService.findByUserName("tomi"));
	}

	@Test
	void testFindByUserName1() {
		assertNull(userService.findByUserName("prabha"));
	}

	@Test
	void testSaveUser() {
		User user = new User(0, "Ponraj", "Raj", "pon", "ponraj123@gmail.com", "Ponraj@1234");
		equals(userService.saveUser(user));
	}

//	@Test
//	void testLogin() {
//		webDriver.get("http://localhost:3000");
//		webDriver.findElement(By.linkText("Login"));
//		webDriver.findElement(By.name("username")).sendKeys("tomi");
//		webDriver.findElement(By.name("password")).sendKeys("Tom@12345");
//		webDriver.findElement(By.name("submit")).submit();
//		webDriver.navigate().to("http://localhost:3000/frontpage");
//	}
}
