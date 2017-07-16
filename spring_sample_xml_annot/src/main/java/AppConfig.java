import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.ghebre.repository.CustomerRepository;
import com.ghebre.repository.CustomerRepositoryImpl;
import com.ghebre.service.CustomerService;
import com.ghebre.service.CustomerServiceImpl;

/**
 * Created by ghebremg on 7/15/17.
 */
@Configuration
@ComponentScan({"com.ghebre"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean(name = "customerService")
//    public CustomerService getCustomerService(){
////        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        CustomerServiceImpl service = new CustomerServiceImpl();
////        service.setCustomerRepository(getCustomerRepository());
//        return service;
//    }

//    @Bean(name="customerRespository")
//    public CustomerRepository getCustomerRepository(){
//        return new CustomerRepositoryImpl();
//    }
}
