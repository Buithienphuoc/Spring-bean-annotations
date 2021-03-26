package rmit.springtut.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import rmit.springtut.MyConfiguration;
import rmit.springtut.ioc.coach.Coach;

import java.util.concurrent.TimeUnit;

@Component
public class IocDemoRunner {
    public void run() throws InterruptedException{
        System.out.println("----------------------Inversion of control demo------------------------------");
        // Step 1: Load configuration file
        System.out.println("Step 1: Loading configuration file...\n");
        TimeUnit.SECONDS.sleep(3);
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfiguration.class);
        // Step 2: Retrieve bean from spring container
        System.out.println("Step 2: Retrieving bean from Spring container...\n");
        TimeUnit.SECONDS.sleep(3);
        Coach cppCoach = context.getBean("cppCoach", Coach.class);
        Coach javaCoach = context.getBean("javaCoach", Coach.class);
        // Step 3: Call methods on the bean
        System.out.println("Step 3: Call methods on bean... \n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("C++ coach says:" + cppCoach.getDailyWorkout());
        System.out.println("Java coach says:" + javaCoach.getDailyWorkout());
        // Step 4: Close the context
        context.close();
    }
}
