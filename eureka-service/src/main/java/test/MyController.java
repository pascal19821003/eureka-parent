package test;

import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author David Turanski
 **/
@RestController
@RefreshScope
public class MyController {

	private static Logger logger = LoggerFactory.getLogger(MyController.class);




	@RequestMapping("/hello")
	public String respond() {
		 return "hello, world!";
	}
}