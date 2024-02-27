package quintor.bioinf.catalog.springtesterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringTesterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTesterAppApplication.class, args);
	}

}
