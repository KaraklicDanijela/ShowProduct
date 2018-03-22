package webapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = {CoreComponents.class})
@EnableJpaRepositories(basePackageClasses = CoreComponents.class)
@EntityScan(basePackageClasses = CoreComponents.class)
public class ShowProductApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(ShowProductApplication.class, args);
    }
}

