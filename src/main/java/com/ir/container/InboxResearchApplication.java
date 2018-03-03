package com.ir.container;


import com.ir.dao.ApplicationUserRepository;
import com.ir.dao.impl.ApplicationUserRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("com.ir")
public class InboxResearchApplication {

    private Logger logger = LoggerFactory.getLogger("InboxResearchApplication");
    //private static Logger logger = LogManager.getLogger(InboxResearchApplication.class);

    @Bean
    public ApplicationUserRepository applicationUserRepository() {
        return new ApplicationUserRepositoryImpl();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

	public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(InboxResearchApplication.class, args);
        //todo: remove the below code
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
      //      logger.info("Info log");
        }

        InboxResearchApplication researchApplication = new InboxResearchApplication();
        researchApplication.doNothingMethod();
	}


	/*
	*
	*  <Pattern>
                %d{yyyy-MM-dd HH:mm:ss} - %msg%n
            </Pattern>*/

	private void doNothingMethod(){
        logger.info("Starting Spring Boot application..");
    }

}
