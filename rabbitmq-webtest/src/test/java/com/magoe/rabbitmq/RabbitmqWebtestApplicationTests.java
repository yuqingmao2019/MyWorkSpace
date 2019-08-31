package com.magoe.rabbitmq;

import com.magoe.rabbitmq.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
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

	@Test
	public void contextLoads() {

		Map<String,Object> map=new HashMap<String,Object>();
		map.put("msg","nidayede ");
		map.put("ms",Arrays.asList("zhongguoren"));
		tem.convertAndSend("exchange.direct","atguigu.news", new Book());
	}

	@Test
	public  void recieived(){
		Object o = tem.receiveAndConvert("atguigu.news");
		System.out.println(o.getClass());
		System.out.println(o);
	}
}
