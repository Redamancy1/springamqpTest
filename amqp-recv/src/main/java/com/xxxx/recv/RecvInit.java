package com.xxxx.recv;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author cjhao
 * @since 1.0.0
 */
@Component
//监听队列
@RabbitListener(queues = "amqp_queue")
public class RecvInit {

	//监听之后获取消息的处理方法
	@RabbitHandler
	public void testRecv(String message) {
		System.out.println("接收到消息：" + message);
	}
}