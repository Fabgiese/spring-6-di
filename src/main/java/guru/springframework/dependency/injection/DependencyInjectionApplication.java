package guru.springframework.dependency.injection;

import guru.springframework.dependency.injection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        MyController myController = ctx.getBean(MyController.class);
        System.out.println("Inner main method");
        System.out.println(myController.sayHello());
    }

}
