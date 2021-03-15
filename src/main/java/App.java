import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat1 = (Cat) applicationContext2.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext2.getBean("cat");

        System.out.println(beanHW1==beanHW2);
        System.out.println(beanCat1==beanCat2);



    }
}