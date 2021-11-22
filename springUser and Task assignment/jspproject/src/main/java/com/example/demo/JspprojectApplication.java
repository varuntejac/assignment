package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JspprojectApplication {
	//@Autowired
	//UserValidationInterface defaultUserValidation;

	public static void main(String[] args) {
		    ApplicationContext ct=SpringApplication.run(JspprojectApplication.class, args);
			/*UserValidationInterface validation= (UserValidationInterface)  ct.getBean("defaultUserValidation") ;
			boolean status=validation.validateUser("varun","Bhavya7895");
			if(status==true)
			{
				System.out.println("login-succesfull");
			}
			else {
				System.out.println("login-unsuccesfull");
			}
			
			*/


}
}