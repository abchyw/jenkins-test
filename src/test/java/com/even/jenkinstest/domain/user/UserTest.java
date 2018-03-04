package com.even.jenkinstest.domain.user;

import static org.junit.Assert.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserTest {
	private static final Logger logger = LoggerFactory.getLogger(UserTest.class);
	@Test
	public void testUser(){
		User user = new User();
		logger.info("this is a test");
		assertTrue(user.test());
	}
}
