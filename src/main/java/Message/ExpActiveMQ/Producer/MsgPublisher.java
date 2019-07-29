package Message.ExpActiveMQ.Producer;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RestPublish")
public class MsgPublisher {

	@Autowired
	private JmsTemplate jmstemplate;
	
	@Autowired
	private Queue queue;
	
	@RequestMapping("/{message}")
	public String publishMessage(@PathVariable("message") String message) {
		jmstemplate.convertAndSend(queue, message); 
		return "Published Succesfully";
	}

}
