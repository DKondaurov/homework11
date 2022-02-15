package pro.sky.java.course2.homework11.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.homework11.data.Order;

@Configuration
public class OrderConfiguration {

    @Bean
    @SessionScope
    public Order order() {
        return new Order();
    }
}
