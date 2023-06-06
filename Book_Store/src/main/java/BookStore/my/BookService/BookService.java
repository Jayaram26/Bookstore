package BookStore.my.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import BookStore.my.bookRepo.Book;
import BookStore.my.bookRepo.bookRepository;
import BookstroreDTO.BookDTO;

@Service
public class BookService {
	@Autowired
	bookRepository  bookrepository;

	public List<Book> getBooks() {
		
		List<Book> booklist = new ArrayList<>();
		
		bookrepository.findAll().forEach(book->booklist.add(book));
		
		
		return booklist;
	}
    public int saveBooks(BookDTO bookdto) {
		   int test= 0;
		   
		   Book book = new Book();
		   
		   book.setId(bookdto.getId());
		   book.setName(bookdto.getName());
		   book.setDesc(bookdto.getDesc());
		   book.setYearofpublication(bookdto.getYearofpublication());
		   book.setBooktype(bookdto.getBooktype());
		  test= bookrepository.save(book).getId();
		   
		   return  test;
		   
//		String mybooks=null;
//		List<Book> booklist = new ArrayList<>();
//		Book bk = new Book();
//		bk.setId(bk.getId());
//		bk.setName(bk.getName());
//		
//		bk.setDesc(bk.getDesc());
		
//		return  bookrepository.save(book);
		
		
	}
//	public int updateBooks(BookDTO bookdto) {
//		// TODO Auto-generated method stub
//		int data =0;
//		Book book = new Book();
//		 book.setId(bookdto.getId());
//		   book.setName(bookdto.getName());
//		   book.setDesc(bookdto.getDesc());
//		   book.setYearofpublication(bookdto.getYearofpublication());
//		   book.setBooktype(bookdto.getBooktype());
//		   data=bookrepository.updatebooks(bookdto.getId());
//		return data;
//	}
	public Book updateBooks(BookDTO bookdto) {
		Book bk = new Book();
		bk.setId(bookdto.getId());
		   bk.setName(bookdto.getName());
		   bk.setDesc(bookdto.getDesc());
		  bk.setYearofpublication(bookdto.getYearofpublication());
		  bk.setBooktype(bookdto.getBooktype());
		return bookrepository.save(bk);
		
		
	}
	
	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		bookrepository.deleteById(id);
		return "deleted successfully";
	}

}
