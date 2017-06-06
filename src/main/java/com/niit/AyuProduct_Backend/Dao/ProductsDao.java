package com.niit.AyuProduct_Backend.Dao;

import java.util.List;

//import java.util.List;
import com.niit.AyuProduct_Backend.Model.Products;

public interface ProductsDao
{
	public boolean saveOrupdate(Products products);
	public boolean delete(Products products);
	public Products getProducts(String id);
	public List<Products> list();
}