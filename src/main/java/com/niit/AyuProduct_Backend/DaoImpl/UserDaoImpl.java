package com.niit.AyuProduct_Backend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

//import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.AyuProduct_Backend.Dao.UserDao;
import com.niit.AyuProduct_Backend.Model.User;

@Repository("userDao")
@EnableTransactionManagement
@Transactional
public class UserDaoImpl  implements UserDao
{

	@Autowired
	private SessionFactory sessionFactory;

	public UserDaoImpl (SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	
	public boolean saveOrupdate(User user)
	{
		try 
		{	
//			Billing bill= new Billing();
			sessionFactory.getCurrentSession().saveOrUpdate(user);
//			sessionFactory.getCurrentSession().saveOrUpdate(bill);
			return true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}	
	 }


	public boolean delete(User user)
	{
		try
		{
		 sessionFactory.getCurrentSession().delete(user);
		 return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			 return false;
		}
	}
	

	public User getUser(String id)
	{
		String s="from User where User_ID='" +id +"'";
		Query q=sessionFactory.getCurrentSession().createQuery(s);
		@SuppressWarnings("unchecked")
		List<User> list=(List<User>)q.list();
		if(list==null||list.isEmpty())
		{
		return null;
		}
		else
		{
			return list.get(0);
		}	
	}
	
	public List<User> list()
	{
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return users;
		}}