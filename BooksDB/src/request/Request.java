package request;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Author;
import entity.Books;

public class Request {
	@SuppressWarnings("unchecked")
	public List<Author> showAuthors() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BooksDB");
		EntityManager em = emf.createEntityManager();
		Query query = null;
		List<Author> authorList = null;
		em.getTransaction().begin();
		query = em.createQuery("Select a from Author a");
		authorList = query.getResultList();
		em.close();
		emf.close();
		return authorList;
	}

	@SuppressWarnings("unchecked")
	public List<Books> showBookByAuthor(String bookName) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BooksDB");
		EntityManager em = emf.createEntityManager();
		Query query = null;
		List<Books> booksList = null;
		em.getTransaction().begin();
		query = em.createQuery("Select b from Books b join b.author a where a.firstName= '" + bookName + "'");
		booksList = query.getResultList();
		em.close();
		emf.close();
		return booksList;
	}

	@SuppressWarnings("unchecked")
	public void insertBook(String bookTitle, String bookGenre, int yearOfPublish, double price,
			String firstNameAuthor) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BooksDB");
		EntityManager em = emf.createEntityManager();
		List<Author> authors = null;
		Query query = null;
		query = em.createQuery("Select a from Author a where a.firstName= '" + firstNameAuthor + "'");
		Books book = new Books(bookTitle, bookGenre, yearOfPublish, price);
		authors = query.getResultList();
		if (!authors.isEmpty()) {
			book.setAuthor(authors);
			em.getTransaction().begin();
			em.persist(book);
			em.getTransaction().commit();
			em.close();
			emf.close();
		} else {
			em.close();
			emf.close();
		}
	}

	public void insertAuthor(String firstNameAuthor, String lastName) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BooksDB");
		EntityManager em = emf.createEntityManager();
		Author author = new Author(firstNameAuthor, lastName);
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public void update(String bookTitle, String bookGenre, int yearOfPublish, double price) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BooksDB");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Books book = em.find(Books.class, bookTitle);
		book.setTitle(bookTitle);
		book.setGenre(bookGenre);
		book.setYearOfPublish(yearOfPublish);
		book.setPrice(price);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public void delete(String bookTitle) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BooksDB");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Books book = em.find(Books.class, bookTitle);
		em.remove(book);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public void delBooksAndAuthors(String firstName) {
		List<Books> books = showBookByAuthor(firstName);
		for (int i = 0; i < books.size(); i++) {
			delete(books.get(i).getTitle());
		}
		authorRemover(firstName);

	}

	private void authorRemover(String firstName) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BooksDB");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Author author = entitymanager.find(Author.class, firstName);
		entitymanager.remove(author);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

}
