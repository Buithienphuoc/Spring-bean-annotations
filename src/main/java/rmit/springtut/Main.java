package rmit.springtut;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import rmit.springtut.di.DependencyInjectionDemoRunner;
import rmit.springtut.ioc.IocDemoRunner;

import java.util.Scanner;

public class Main {

    private static final ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) throws InterruptedException {
        System.out.println("""
                Which demo do you want?\s
                Press 1 to run Inversion of Control.\s
                Press 2 to run Dependency Injection.\s
                Your choice:""");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1 -> runInversionOfControlDemo();
            case 2 -> runDependencyInjectionDemo();
            default -> System.out.println("Wrong input or not existed choice");
        }
        context.close();
    }
    public static void runInversionOfControlDemo() throws InterruptedException {
        IocDemoRunner iocDemoRunner = context.getBean("iocDemoRunner", IocDemoRunner.class);
        iocDemoRunner.run();
    }
    public static void runDependencyInjectionDemo() throws InterruptedException {
        DependencyInjectionDemoRunner dependencyInjectionDemoRunner
                = context.getBean("dependencyInjectionDemoRunner", DependencyInjectionDemoRunner.class);
        dependencyInjectionDemoRunner.run();
    }
}
