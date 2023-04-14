package one.digitalinovation.desafiofinaldio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
/**
 * @author WellRL
 */

@EnableFeignClients
@SpringBootApplication
@ComponentScan("one.digitalinovation.desafiofinaldio.service.ClienteService")
public class DesafioFinalDioApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesafioFinalDioApplication.class, args);
	}

}
