package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Branch;
import com.example.demo.repository.BranchRepository;

@SpringBootTest
class SpringJpaServiceTest {

	private final SpringJpaService springJpaService;

	@Autowired
	public SpringJpaServiceTest(SpringJpaService springJpaService) {
		super();
		this.springJpaService = springJpaService;
	}

	@BeforeAll
	static void setUpBeforeClass(@Autowired BranchRepository branchRepository) throws Exception {
		branchRepository.deleteAll();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		Branch value = new Branch();
		value.setId(3L);
		value.setBranchNo(15);
		value.setName("東京");

		Branch actual = this.springJpaService.saveBranch(value);
		assertThat(actual).isEqualTo(value);
	}

}
