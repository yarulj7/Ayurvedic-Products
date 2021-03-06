package com.niit.AyuProduct_Backend.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="User")
@Component

public class User 
{
  @Id	
    private String User_ID;
    private String U_F_Name;
    private String U_L_Name;
    private long U_PhoneNum;
    private String U_dob;
    private String U_Address;
    private String U_Email;  
    private String U_Password;
    private String Role="USER";
    private String Title;
    
    
    @OneToOne(cascade  = CascadeType.ALL)
    @JoinColumn(name="b_Id")
    Billing bill;

    @OneToOne(cascade  = CascadeType.ALL)
    @JoinColumn(name="CartId")
    Cart cart; 
  
    private static final DateFormat df = new SimpleDateFormat("DD/MM/YYYY");
    public User()
    {
    	Date date = new Date();
    	U_dob = df.format(date);
    	this.User_ID="USER"+UUID.randomUUID().toString().substring(30).toUpperCase();
    }
    
   public Cart getCart() 
   {
		return cart;
   }
	
   public void setCart(Cart cart) 
   {
		this.cart = cart;
	}
public Billing getBill() 
    {
		return bill;
	}
	public void setBill(Billing bill) 
	{
		this.bill = bill;
	}
	//  Role Of the User
    public String getRole() 
     {
		return Role;
	}
	public void setRole(String role) 
	{
		Role = role;
	}
// User Name
   
       public String getU_F_Name() {
		return U_F_Name;
	}

	public void setU_F_Name(String u_F_Name) {
		U_F_Name = u_F_Name;
	}

	public String getU_L_Name() {
		return U_L_Name;
	}

	public void setU_L_Name(String u_L_Name) {
		U_L_Name = u_L_Name;
	}

//	}
// User Phone Number
         public long getU_PhoneNum() 
          {
        	return U_PhoneNum;
          }
           public void setU_PhoneNum(long u_PhoneNum) 
            {
        	   U_PhoneNum = u_PhoneNum;
            }
// User Dob
              
              public String getU_dob() 
               {
            	  return U_dob;
               }

                 public void setU_dob(String u_dob) 
                  {
                	 U_dob = u_dob;
                  }

// User Address
                  public String getU_Address() 
                   {
                	  return U_Address;
                   }
                     public void setU_Address(String u_Address) 
                      {
                    	U_Address = u_Address;
                      }
// User Email
                       public String getU_Email() 
                        {
                    	   return U_Email;
                        }
                          public void setU_Email(String u_Email) 
                           {
                        	   U_Email = u_Email;
                           }
// User ID
                          public String getUser_ID() 
                           {
                        	 return User_ID;
                           }
                            public void setUser_ID(String user_ID) 
                             {
                               User_ID = user_ID;
                             }
// User Password
                              public String getU_Password() 
                               {
                            	  return U_Password;
                               }
                                public void setU_Password(String u_Password) 
                                 {
                                	U_Password = u_Password;
                                 }

								public String getTitle() {
									return Title;
								}

								public void setTitle(String title) {
									Title = title;
								}
                                
}