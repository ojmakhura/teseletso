package bw.co.roguesystems.teseletso;


import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class TeseletsoWebApplicationConfig {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames(
                "classpath:/custom_messages",
                "classpath:/messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
