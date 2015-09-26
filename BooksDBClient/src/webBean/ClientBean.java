package webBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import service.Author;
import service.BookService;
import service.BookServiceService;
import service.Books;

@ManagedBean(name = "booksClient")
public class ClientBean implements Serializable {
	private BookServiceService service;
	private BookService proxy;
	private String bookTitle;
	private String firstName;
	private String lastName;
	private String genre;
	private int yearOfPublish;
	private double price;
	private String result;

	public ClientBean() {
		service = new BookServiceService();
		proxy = service.getBookServicePort();
	}

	public BookServiceService getService() {
		return service;
	}

	public void setService(BookServiceService service) {
		this.service = service;
	}

	public BookService getProxy() {
		return proxy;
	}

	public void setProxy(BookService proxy) {
		this.proxy = proxy;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<SelectItem> getShowBookByAuthor() {
		List<Books> book = null;
		List<SelectItem> item = new ArrayList<SelectItem>();
		List<Author> author = proxy.showAuthors();
		for (Author selectItem : author) {
			book = proxy.showBookByAuthor(selectItem.getFirstName());
			for (Books book1 : book) {
				item.add(new SelectItem(book1.getTitle()));
			}
		}
		return item;
	}

	public void getInsertBook() {
		proxy.insertBook(getBookTitle(), getGenre(), getYearOfPublish(), getPrice(), getFirstName());

	}

	public void insertAuthor() {
		proxy.insertAuthor(getFirstName(), getLastName());
	}

	public void update() {
		proxy.update(getBookTitle(), getGenre(), getYearOfPublish(), getPrice());
	}

	public void delete() {
		proxy.delete(getBookTitle());
	}

	public void delBooksAndAuthors() {
		proxy.delBooksAndAuthors(getFirstName());
	}

	public List<SelectItem> getShowAllAuthors() {
		List<Author> author = proxy.showAuthors();
		List<SelectItem> item = new ArrayList<SelectItem>();
		for (Author selectItem : author) {
			item.add(new SelectItem(selectItem.getFirstName()));
		}
		return item;
	}
}
