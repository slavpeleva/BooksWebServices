package service;

import java.util.List;

import javax.jws.WebService;

import entity.Author;
import entity.Books;
import request.Request;

@WebService
public class BookService {
	Request request = new Request();
	
	public List<Books> showBookByAuthor(String bookName){		
		return request.showBookByAuthor(bookName);
	}
	public List<Author> showAuthors(){
		return request.showAuthors();
	}

	public void insertBook(String bookTitle,String bookGenre, int yearOfPublish,double price,String firstNameAuthor){
		request.insertBook(bookTitle, bookGenre, yearOfPublish, price, firstNameAuthor);
	}
	
	public void insertAuthor(String firstNameAuthor,String lastName){
		request.insertAuthor(firstNameAuthor, lastName);
	}
	public void update(String bookTitle,String bookGenre, int yearOfPublish,double price){
		request.update(bookTitle, bookGenre, yearOfPublish, price);
	}
	
	public void delete(String bookTitle){
		request.delete(bookTitle);
	}
	
	public void delBooksAndAuthors(String firstName){
		request.delBooksAndAuthors(firstName);		
	}	
	
}
