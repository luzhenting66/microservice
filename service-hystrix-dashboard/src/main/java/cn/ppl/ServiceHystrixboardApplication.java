package cn.ppl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
//@EnableEurekaClient
@SpringBootApplication
public class ServiceHystrixboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHystrixboardApplication.class, args);
	}

}
