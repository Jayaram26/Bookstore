package BookStore.my.bookRepo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book_store")
public class Book implements Serializable {
	
	 private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	
	@Column(name="Description")
	private String desc ;
	
	@Column(name="year_of_publication")
	private Integer yearofpublication;
	
	@Column(name="booktype")
	private String booktype;
	
	
	
	public Book() {
		
	}

	public Book(Integer id, String name, String desc, Integer yearofpublication, String booktype) {
		
		this.id = id;
		this.name = name;
		this.desc = desc ;
		this.yearofpublication = yearofpublication;
		this.booktype = booktype;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc= desc;
	}

	public Integer getYearofpublication() {
		return yearofpublication;
	}

	public void setYearofpublication(Integer yearofpublication) {
		this.yearofpublication = yearofpublication;
	}

	public String getBooktype() {
		return booktype;
	}

	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", desc=" + desc + ", yearofpublication=" + yearofpublication
				+ ", booktype=" + booktype + "]";
	}

	
}
