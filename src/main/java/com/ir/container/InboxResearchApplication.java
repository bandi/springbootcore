package com.ir.container;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("com.ir")
@ImportResource("classpath:log4j2.xml")
public class InboxResearchApplication {

    //private static  Logger logger = LoggerFactory.getLogger("Main-App");

	public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(InboxResearchApplication.class, args);
        //todo: remove the below code
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
      //      logger.info("Info log");
        }

	}
}
