package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String firstName;
	private String lastName;
	
	
	public Author() {
		super();
	}
	
	
	public Author(String firstName, String lastName) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
