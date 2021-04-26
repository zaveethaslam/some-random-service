package mysampleservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@Value("${some.dummy.value}")
	String value;
	
	@GetMapping("/hello")
	public String helloTest() {
		return value;
	}
	
}
