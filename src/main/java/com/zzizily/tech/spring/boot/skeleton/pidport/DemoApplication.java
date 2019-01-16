package com.zzizily.tech.spring.boot.skeleton.pidport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerPortFileWriter;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(DemoApplication.class);
		application.addListeners(new ApplicationPidFileWriter()); //application.pid
		application.addListeners(new WebServerPortFileWriter()); //application.port
		application.run(args);
	}

}

