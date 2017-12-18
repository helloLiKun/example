package com.jingao.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@SpringBootApplication
@EnableTransactionManagement
public class SpringbootGradleIdeaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootGradleIdeaApplication.class, args);
	}
}

