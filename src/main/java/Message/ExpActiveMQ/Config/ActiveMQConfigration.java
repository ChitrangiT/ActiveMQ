package Message.ExpActiveMQ.Config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@Configuration
public class ActiveMQConfigration {
	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("First.Queue");
	}
}
