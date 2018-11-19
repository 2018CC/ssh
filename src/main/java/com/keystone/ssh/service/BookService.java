package com.keystone.ssh.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.keystone.ssh.dao.BookDao;
import com.keystone.ssh.pojo.Book;

/** 
 *
 * @author 
 * @datetime 2018年10月18日 下午4:17:33
 * @editnote 
 *	
 */

@Service
public class BookService {
	@Resource
	private BookDao bookDao;
	
	public List<Book> getbook() {
			List<Book> Books = bookDao.queryBooks();
		return Books;
	}

}
