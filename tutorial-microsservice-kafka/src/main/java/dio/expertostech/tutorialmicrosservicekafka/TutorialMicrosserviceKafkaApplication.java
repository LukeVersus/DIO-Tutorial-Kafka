package dio.expertostech.tutorialmicrosservicekafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TutorialMicrosserviceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialMicrosserviceKafkaApplication.class, args);
	}

}
