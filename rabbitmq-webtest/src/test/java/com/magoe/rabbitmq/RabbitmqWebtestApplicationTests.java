package com.magoe.rabbitmq;

import com.magoe.rabbitmq.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqWebtestApplicationTests {

	@Autowired
	RabbitTemplate tem;

	@Autowired
	AmqpAdmin admin;

	@Test
	public void contextLoads() {

		Map<String,Object> map=new HashMap<String,Object>();
		map.put("msg","nidayede ");
		map.put("ms",Arrays.asList("zhongguoren"));
		tem.convertAndSend("maogeEX.direct","maoge", "successed");
	}

	@Test
	public  void recieived(){
		Object o = tem.receiveAndConvert("atguigu.news");
		System.out.println(o.getClass());
		System.out.println(o);
	}

//    @Test
//    public void testListener() {
//
//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("msg","nidayede ");
//        map.put("ms",Arrays.asList("zhongguoren"));
//        tem.convertAndSend("exchange.fanout","", new Book());
//    }

	@Test
	public void addexchange() {

		admin.declareExchange(new DirectExchange("maogeEX.direct"));
		admin.declareQueue(new Queue("maoge.queue"));
		System.out.println("创建一个");

	}


	@Test
	public void addbind() {
//	Map<String,String> map=new HashMap();
//	map.put("msg","这个");
		admin.declareBinding(new Binding("maoge.queue", Binding.DestinationType.QUEUE,"maogeEX.direct","maoge",null));
//		amqpAdmin.declareBinding(new Binding("amqpadmin.queue", Binding.DestinationType.QUEUE,"amqpadmin.exchange","amqp.haha",null));

	}
}
