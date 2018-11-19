package com.keystone.ssh.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.keystone.ssh.pojo.Book;
import com.keystone.ssh.service.BookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
 *
 * @author 
 * @datetime 2018年10月18日 下午4:17:52
 * @editnote 
 *	
 */
@Component("book")
@Scope(value="Prototype")
public class BookAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	//页面OGNL访问基本属性
	private String id ="123456";
	
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BookAction(){
		//System.out.println("-----------------------------");
	}
	
	@Resource
	private  BookService bookService;
	
	public String bo(){
		
		List<Book> books = bookService.getbook();
		if(books.size()!=0){
			for (Book book : books) {
				System.out.println(book);
			}
			//ActionContext.getContext().put("books", books);
			ServletActionContext.getRequest().setAttribute("books", books);
			return "boo";
		}else{
			ActionContext.getContext().getContextMap().put("msg", "书库还没有书籍");
			return "boo";
		}
		
		
		
	}
}
