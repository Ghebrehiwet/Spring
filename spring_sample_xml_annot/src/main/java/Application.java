import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ghebre.service.CustomerService;
import com.ghebre.service.CustomerServiceImpl;

/**
 * Created by ghebremg on 7/15/17.
 */
public class Application {

    public static void main(String[] args){
//        CustomerService service = new CustomerServiceImpl();

//        ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//
//        CustomerService service = appContext.getBean("customerService", CustomerService.class);


        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        System.out.println(service);

        CustomerService service2 = appContext.getBean("customerService", CustomerService.class);

        System.out.println(service2);

        System.out.println(service.findAll().get(0).getFirstname() + " " + service.findAll().get(0).getLastname());
    }

}
