package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
    	System.out.println("Life Cycle");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    MessageBean bean = (MessageBean) context.getBean("messageBean2");
		bean.helloCall();
    }
}
