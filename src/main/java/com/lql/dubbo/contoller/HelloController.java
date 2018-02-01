package com.lql.dubbo.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lql.dubbo.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {
	//dubbo远程调用注解 
	@Reference
	private HelloService helloService;

	@RequestMapping("/test")
	public String hello() {

		return helloService.sayHello("dubbo");
	}
}
