package notification.service.project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;


import lombok.extern.slf4j.Slf4j;
import notification.Dto.TestDto;

@SpringBootApplication
@Slf4j
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}
	
	
	
	

	@KafkaListener(topics = "testTopic16", groupId = "notificationId")
	public void handleNotification(TestDto value) {
		log.info("Received notification for order "+ value);
	
	}
	
	

}
