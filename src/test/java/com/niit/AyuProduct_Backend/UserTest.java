package com.niit.AyuProduct_Backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AyuProduct_Backend.Dao.UserDao;
import com.niit.AyuProduct_Backend.Model.Billing;
import com.niit.AyuProduct_Backend.Model.Cart;
import com.niit.AyuProduct_Backend.Model.User;
public class UserTest 
{
    public static void main(String arg[])
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
 	    context.scan("com.niit.AyuProducts.*");
 	    context.refresh();   
 	   
 	   User user =(User)context.getBean("user");
 	   UserDao userDao=(UserDao)context.getBean("userDao");
 	   
 	   Billing billing=(Billing)context.getBean("billing");
 	   Cart cart=(Cart)context.getBean("cart");

    	 user.setU_Name("Yarul Jan");
    	 user.setU_Address("Bangaore");
    	 user.setU_PhoneNum(948186863l);
    	 user.setU_dob("11/01/2002,");
    	 user.setU_Email("yj7@gmal.com");
    	 user.setUser_ID("Yarul@12");
    	 user.setU_Password("vandna@2002");
    	 user.setRole("User");
    	 
    	 cart.setCartId("I");
//    	 cart.setGrandtotal(1.0d);
//    	 cart.setTotalItems(1);
    	 
    	 billing.setB_Id("AS");
//    	 billing.setB_House_Number("fdsfcsd");
//    	 billing.setB_City("bdsb");
//    	 billing.setB_Landmark("dgt");
//    	 billing.setB_Pincode("60023");
//    	 billing.setB_State("Krnataka");
    	 
    	 user.setBill(billing);
    	 user.setCart(cart);
    	 

//  Save Or Update
    	   if(userDao.saveOrupdate(user))
            {
    		  System.out.println("\t Save is successfull"); 
            }
    	      else
    	       {
    	    	 System.out.println("\t Sorry"); 
    	       }
//  Get User
//    	 User user2=userDao.getUser("Yarul@1972");
//    	  if(user2!=null)
//    	  {
//    		 System.out.println("\t User Name = "+user2.getU_Name());
//    	  }
//    	  else
//    	  {
//    		 System.out.println("\t Sorry Wrong ID ");
//    	  }
//  Delete User
//       if(userDao.delete(user2))
//       {
//    	   System.out.println("\t Deletion is Done");
//       }
    	   
    	   
    	   context.close();
    }
}