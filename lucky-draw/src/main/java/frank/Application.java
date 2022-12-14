package frank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("frank.mapper")
public class Application {
    //http://localhost:8080/lucky-draw/index.html

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
