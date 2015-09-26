package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Books {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String title;
	@OneToMany
	private List<Author> author;
	private String genre;
	private int yearOfPublish;
	private double price;
	
	
	
	public Books() {
		super();
	}
	public Books(String bookTitle, String bookGenre, int yearOfPublish2, double price2) {
		// TODO Auto-generated constructor stub
		setTitle(bookTitle);
		setGenre(bookGenre);
		setYearOfPublish(yearOfPublish2);
		setPrice(price2);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Author> getAuthor() {
		return author;
	}
	public void setAuthor(List<Author> author) {
		this.author = author;
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
	@Override
	public String toString() {
		
		return super.toString();
	}
	
	
}
