package casestudy2_25thfeb;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotification implements NotificationService{

	@Override
	public void sendNotification(String message) {
		// TODO Auto-generated method stub
		System.out.println("Email sent: " + message);
		
	}
	
}