package com.niit.AyuProduct_Backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.AyuProduct_Backend.Dao.BillingDao;
import com.niit.AyuProduct_Backend.Model.Billing;

public class BillingTest 
{

	public static void main(String[] args)
	{
		 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	      context.scan("com.niit.*");
	      context.refresh();
	     
	    Billing billing=(Billing)context.getBean("billing");
	    BillingDao billingDao =(BillingDao)context.getBean("billingDao");
	    
	    billing.setB_Id("12c");
	    billing.setB_House_Number("bfs");
	    billing.setB_Landmark("sfs");
	    billing.setB_City("bangalore");
	    billing.setB_State("karnataka");
	    billing.setB_Pincode("560023");
	    if(billingDao.saveOrupdate(billing))
	    {
	      try
	      {
	    	System.out.println("\t Save has been done");
	      }
	       catch(Exception e)
	        {
	    	   System.out.println("\t Error has been created while saving the billing details");  
	        }
	    }
	    else
	    {
	    	System.out.println("\t Sorry failed to save the billing details0");
	    }
	    
//	    if(billingDao.delete(billing))
//	    {
//	      try
//	      {
//	    	System.out.println("\t Delete has been done");
//	      }
//	       catch(Exception e)
//	        {
//	    	   System.out.println("\t Error has been created while deleting the billing details");  
//	        }
//	    }
//	    else
//	    {
//	    	System.out.println("\t Sorry failed to delete the billing details0");
//	    }
	    Billing bill = billingDao.getBilling("12c");
	   if(bill != null)
	   {
	     try
	      {
	    	System.out.println("\t Getting of has been done");
	      }
	       catch(Exception e)
	        {
	    	   System.out.println("\t Error has been created while getting the billing details");  
	        }
	    }
	    else
	    {
	    	System.out.println("\t Sorry failed to get the billing details");
	    }
	    context.close();
	}

}
