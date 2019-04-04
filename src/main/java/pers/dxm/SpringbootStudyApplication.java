package pers.dxm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 该注解可以开启组件扫描和自动配置
@SpringBootApplication
public class SpringbootStudyApplication {

	public static void main(String[] args) {
		// 项目的启动运行方法
		SpringApplication.run(SpringbootStudyApplication.class, args);
	}
}
