import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tz.go.bot.AppConfig;
import tz.go.bot.service.CustomerService;
import tz.go.bot.service.CustomerServiceListImpl;
import tz.go.bot.ui.CustomerUI;

public class Main {
	public static void main(String[] args) {
		
//		CustomerUI ui=new CustomerUI();
//		ui.intiateApp();
		
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service=appContext.getBean("customerService",CustomerService.class);
		System.out.println(service.getCustomerById(1000));
		
		System.out.println(service);
		
		CustomerService service2=appContext.getBean("customerService", CustomerService.class);
		System.out.println(service2);
	}
}
