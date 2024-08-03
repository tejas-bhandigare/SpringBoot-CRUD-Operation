package com.springbootproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springbootjdbc.dao.UserDao;
import com.springbootjdbc.main.entity.User;
@ComponentScan(basePackages = {"com.springbootjdbc.dao", "com.springbootproject1"})

@SpringBootApplication
public class SpringBootprojectjdbccrudApplication implements CommandLineRunner

{
	@Autowired
	private UserDao userDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootprojectjdbccrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//----------------------------- Insertion-----------------------
//		//User user1 = new User("deepak","deepak@gmail.com","male","pune");
//		
		User user2 = new User("tejas","Tejas@gmail.com","male","pune");
		
		
		boolean status = userDao.insertUser(user2);
		if(status)
		{
		    System.out.println("User inserted sucessfully...");		
			
		}
		else
		{
		    System.out.println("User not inserted due to some error");		
		}
		
		
//-------------------------Updation----------------------------
		
//		User user = new User("tejas","Tejas@gmail.com","male","mumbai");
//		
//		boolean status =  userDao.updateUser(user);
//		
//		if(status)
//		{
//			System.out.println("updation sucess");
//			
//		}
//		else
//		{
//			System.out.println("update failed");
//			
//		}
		

//----------------------Deletion----------------------------
		
//		boolean status =userDao.deleteUserByEmail("Tejas@gmail.com");
//		
//		if(status)
//		{
//			System.out.println("Deletion sucessfull");
//			
//		}
//		else {
//			System.out.println("deletion failed");
//			
//		}
	}
}
