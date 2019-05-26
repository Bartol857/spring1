package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad3 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        Person person1 = (Person) context.getBean("person1");
        System.out.println(person1.getAddress().getCity());

    }
}
