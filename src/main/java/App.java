import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldbean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorldbean.getMessage());
        HelloWorld helloWorld1bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld1bean1.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat1 = (Cat) applicationContext.getBean("cat");

        System.out.println(helloWorldbean == helloWorld1bean1);
        System.out.println(cat == cat1);
    }
}