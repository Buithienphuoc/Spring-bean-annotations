package rmit.springtut.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import rmit.springtut.di.mentor.Mentor;

import java.util.concurrent.TimeUnit;

@Component("dependencyInjectionDemoRunner")
public class DependencyInjectionDemoRunner {
    public void run() throws InterruptedException{
        System.out.println("-----------------------Dependency injection demo------------------------------");
        // Step 1: Load configuration file
        System.out.println("Step 1: Loading configuration file...\n");
        TimeUnit.SECONDS.sleep(3);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Step 2: Retrieve bean from spring container
        System.out.println("Step 2: Retrieving bean from Spring container...\n");
        TimeUnit.SECONDS.sleep(3);
        Mentor pythonMentor = context.getBean("pythonMentor", Mentor.class);
        // Step 3: Call methods on the bean
        System.out.println("Step 3: Call methods on bean... \n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Python mentor says:" + pythonMentor.getDailyFortune() +
                " " + pythonMentor.getDailyWorkout());
        // Step 4: Close the context
        context.close();
    }
}
