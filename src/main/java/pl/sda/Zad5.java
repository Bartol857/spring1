package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad5 {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        Message message = (Message) context.getBean("messageproperties");
        System.out.println(message.getText());
    }
}
