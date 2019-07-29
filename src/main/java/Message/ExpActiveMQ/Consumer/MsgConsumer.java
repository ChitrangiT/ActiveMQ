package Message.ExpActiveMQ.Consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MsgConsumer {
	
	@JmsListener(destination="First.Queue")
	public void consumeMessage(String message) {
		System.out.println("Received message :"+message);
	}

}
