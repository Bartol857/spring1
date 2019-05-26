package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");



//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanName : beanDefinitionNames) {
//            System.out.println(beanName);
//        }

//        Message message = (Message) context.getBean("message");
//        System.out.println(message.getText());
//
//        message.setText("Nowa wartość");
//        Message message2 = (Message) context.getBean("message");
//
//        System.out.println(message2.getText());

//        ExtraMessage extramessage = (ExtraMessage) context.getBean("extramessage");
//        Message message2 = (Message) context.getBean("message2");
//        Message message3 = (Message) context.getBean("message3");


//        System.out.println(extramessage.getTextlombok());
//        System.out.println(message2.getText());
//        System.out.println(message3.getText());
//
//        ((ClassPathXmlApplicationContext) context).close();

        Book book = (Book) context.getBean("book");
        System.out.println(book.getAuthor().getFirstName()+" "+book.getAuthor().getLastName()+" - "+book.getTitle());


//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        ((ClassPathXmlApplicationContext) context).close();

    }
}
