package com.xxxx.send.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cjhao
 * @since 1.0.0
 */
@Configuration
public class RabbitMQConfig {

	//申明队列
	@Bean
	public Queue queue(){
		return new Queue("amqp_queue");
	}


	//申明交换机
	@Bean
	public TopicExchange topicExchange(){
		return new TopicExchange("amqp_exchange");
	}


	//绑定交换机和队列
	@Bean
	public Binding binding(){
		return BindingBuilder.bind(queue()).to(topicExchange()).with("*.amqp.#");
	}



}