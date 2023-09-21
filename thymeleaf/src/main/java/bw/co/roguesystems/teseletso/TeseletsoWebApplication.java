package bw.co.roguesystems.teseletso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SharedAutoConfiguration.class)
public class TeseletsoWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeseletsoWebApplication.class, args);
    }
}