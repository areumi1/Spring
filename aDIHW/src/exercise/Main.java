package exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exercise.order.domain.Customer;
import exercise.order.service.CustomerService;

public class Main {

	public static void main(String[] args) {

		  // ##### 2. ������ ���� ������ ���� �ڵ带 �ۼ��ϰ� �Ʒ� �ڵ��� �ּ��� ����
	      
		  ApplicationContext ctx = new 
		            ClassPathXmlApplicationContext("exercise/beans.xml");
	      
	
	      // --------------------------------------
	      // �Ʒ� �ڵ��� �ּ��� �����Ͽ��� �� �����Ǿ�� �Ѵ�.
		  Customer customer = (Customer)ctx.getBean("customer");
			
		  CustomerService customerService = (CustomerService)ctx.getBean("customerService");
		  customerService.saveCustomer(customer);
		  customerService.deleteCustomer(1);		
	
	}

}