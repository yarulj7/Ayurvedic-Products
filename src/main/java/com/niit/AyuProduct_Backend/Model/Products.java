package com.niit.AyuProduct_Backend.Model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Products")
@Component
public class Products 
{
	@Id
	  private String ProductId;
	  private String ProductName;
	  private String ProductDes;
	  private String Product_weight_in_grams;
	 
	  private int Product_Qua;
	  private double Product_Price;
	  private float Product_weight;
	  

	@ManyToOne(cascade  = CascadeType.ALL)
	  @JoinColumn(name="C_Id")
	  private Category category;
	  
	  @ManyToOne
	  @JoinColumn(name="S_Id")
	  private Supplier supplier;

	  
	  public Products()
	  {
	    this.ProductId="PRODUCTS"+UUID.randomUUID().toString().substring(30).toUpperCase();
	  }
// Weight in grams
		public String getProduct_weight_in_grams() 
		{
			return Product_weight_in_grams;
		}

		public void setProduct_weight_in_grams(String product_weight_in_grams) 
		{
			Product_weight_in_grams = product_weight_in_grams;
		}

// Supplier
    public Supplier getSupplier() 
    {
		return supplier;
	}
    
	public void setSupplier(Supplier supplier) 
	{
		this.supplier = supplier;
	}

// Category 
	public Category getCategory() 
    {
		return category;
	}

	public void setCategory(Category category) 
	{
		this.category = category;
	}

// Product Name
	  public String getProductName() 
	  {
		return ProductName;
 	  }

	  public void setProductName(String productName) 
	   {
		 ProductName = productName;
	   }

// Product Description
	   public String getProductDes() 
	    {
	      return ProductDes;
	    }

	    public void setProductDes(String productDes) 
	     {
	       ProductDes = productDes;
	     }

// Product ID
	     public String getProductId() 
 	      {
	         return ProductId;
 	      }

	     public void setProductId(String productId) 
	      {
	         ProductId = productId;
	      }

// Product Quantity
	     public int getProduct_Qua() 
	      {
	         return Product_Qua;
	      }
	     
		public void setProduct_Qua(int product_Qua) 
	      {
	        Product_Qua = product_Qua;
	      }

// Product Price
		 public double getProduct_Price()
		 {
				return Product_Price;
		}
			public void setProduct_Price(double product_Price) 
			{
				Product_Price = product_Price;
			} 
// Product Weight

	       public float getProduct_weight() 
	       {
	 			return Product_weight;
	 	   }

	 		public void setProduct_weight(float product_weight) 
	 		{
	 			Product_weight = product_weight;
	 		}

}
