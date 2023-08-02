package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.util.Pair;

@SpringBootTest
class RedisTemplateServiceTest {

	private RedisTemplateService redisTemplateService;

	@Autowired
	public RedisTemplateServiceTest(RedisTemplateService redisTemplateService) {
		super();
		this.redisTemplateService = redisTemplateService;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		// do nothing.
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		// do nothing.
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		// do nothing.
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		// do nothing.
	}

	@Test
	void testSetToRedis() {
		Pair<String, String> actual = redisTemplateService.setToRedis("hoge", "foo");
		assertThat(actual.getFirst()).isEqualTo("hoge");
		assertThat(actual.getSecond()).isEqualTo("foo");
	}

}
