package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GatewayApplication.class)
@WebAppConfiguration
public class GatewayApplicationTests {

	@Test
	public void contextLoads() {
	}

}
