package com.example.virtualthread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatProtocolHandlerCustomizer;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.Executors;

@SpringBootApplication
public class VirtualthreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualthreadApplication.class, args);
	}

//	@Bean
//	public TomcatProtocolHandlerCustomizer<?> tomcatProtocolHandlerCustomizer() {
//		return protocolHandler -> {
//			protocolHandler.setExecutor(Executors.newVirtualThreadPerTaskExecutor());
//		};
//	}

}
