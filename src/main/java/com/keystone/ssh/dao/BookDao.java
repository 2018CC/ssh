package com.keystone.ssh.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.keystone.ssh.pojo.Book;

/** 
 *
 * @author 
 * @datetime 2018年10月18日 下午4:17:03
 * @editnote 
 *	
 */
@Repository
@SuppressWarnings("unchecked")
public class BookDao {
	@Resource
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession(){
		return this.sessionFactory.openSession();
	}
	public List<Book> queryBooks() {
		String hql="from Book";
		Query query = getSession().createQuery(hql);
		List<Book> books = query.list();
		System.out.println(books.isEmpty());
		return books;
	}
	
}
