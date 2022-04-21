package com.Haven;

import com.Haven.service.UserYouthDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class MyWebsiteApplicationTests {

	@Autowired
	private UserYouthDataService userYouthDataService;

	@Test
	void contextLoads() {
		userYouthDataService.addUserYouthData("20010307", "N0014000210051021");
	}

}
