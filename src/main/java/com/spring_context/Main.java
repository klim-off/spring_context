package com.spring_context;


import com.spring_context.model.User;
import com.spring_context.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import javax.sql.DataSource;

public class Main {
    //1 create context
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationContext.class);


    //2 get the settings from Context
    DataSource dataSource = applicationContext.getBean(DataSource.class);
    UserRepository userRepository = applicationContext.getBean(UserRepository.class);


    User user1 = userRepository.findByFirstName("Ivan");
    User user2 = userRepository.findByFirstName("Sasha");

}
