package com.ir.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InboxResearchApplicationTests {

	@Test
	public void contextLoads() {
	}

	private Logger logger = LoggerFactory.getLogger(this.getClass());

/*	@Autowired
	private OfferService offerservice;

	@Test
	public void invokeAOPStuff() {
		logger.info(offerCntl.getResources().toString());
	}*/

}
