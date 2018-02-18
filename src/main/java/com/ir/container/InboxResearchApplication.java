package com.ir.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InboxResearchApplication {

	public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(InboxResearchApplication.class, args);
        //todo: remove the below code
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }

	}
}
