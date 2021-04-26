package mysampleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class SomeRandomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SomeRandomServiceApplication.class, args);
	}

}


@Configuration
@EnableWebMvc
class AppConfig extends WebMvcConfigurerAdapter {
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new ApiLogger()).addPathPatterns("/*");
  }
}