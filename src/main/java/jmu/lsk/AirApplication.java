package jmu.lsk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "jmu.lsk.mapper")
@SpringBootApplication
public class AirApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirApplication.class, args);
    }

}
