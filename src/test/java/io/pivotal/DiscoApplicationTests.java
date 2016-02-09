package io.pivotal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DiscoApplication.class)
@WebIntegrationTest("server.port=0")
public class DiscoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
