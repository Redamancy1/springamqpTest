package com.xxxx.send;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author cjhao
 * @since 1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RabbitMQTest {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Test
	public void testSend() {
		String message = "Hello";
		System.out.println("发送消息：" + message);
		//发送消息
		rabbitTemplate.convertAndSend("amqp_exchange", "test.amqp", message);
	}


}