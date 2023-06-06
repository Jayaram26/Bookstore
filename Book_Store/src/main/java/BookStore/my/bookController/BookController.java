package BookStore.my.bookController;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import BookStore.my.BookService.BookService;
import BookStore.my.bookRepo.Book;
import BookStore.utility.ResponseHandler;
import BookstroreDTO.BookDTO;
import BookStore.utility.MessageHandler;

//import BookStore.my.bookRepo.Book;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
//	public List<Book> getBooks(){
//		List<Book> booklist = Arrays.asList(
//				new Book(id: 1, name: "2 state",desc: "3 states of 2states",
//				yearofpublication: 2021, booktype: "fiction"));
//		return booklist;
//	}
//	

	@GetMapping("/test")
	public String getmyspring() {
		
		return "welcome to my spring project";
		
	}
	
	//Get or list  api
	@GetMapping("/books")
	public List<Book> getBooks(){
		return bookservice.getBooks();
	}
	
//	@RequestMapping(value="/savebook", method=RequestMethod.POST)
//	public Book saveBooks(@RequestBody Book book) {
//		return bookservice.saveBooks(book);
//	}
	
	//save or create api
	@PostMapping("/save")
	public ResponseEntity savebook(@RequestBody BookDTO bookdto) {
		
		 ResponseHandler responseHandler = null;
	       int data = bookservice.saveBooks(bookdto);
		 if (data > 0) {
	            if (bookdto.getId() == null || bookdto.getId() == 0) {
	                responseHandler = new ResponseHandler(MessageHandler.SUCCESS, data);
	            } else {
	                responseHandler = new ResponseHandler(MessageHandler.UPDATE, data);
	            }
	        } else {
	            responseHandler = new ResponseHandler(MessageHandler.FAILED);
	        }
	        return new ResponseEntity(responseHandler, HttpStatus.OK);

	    }
	
	
//	@RequestMapping(value="/update" ,method=RequestMethod.PUT)
//	public ResponseEntity updatebook(@RequestBody BookDTO bookdto) {
//		
//		ResponseHandler responseHandler=null;
//		
//		int test= bookservice.updateBooks(bookdto);
//		if(test > 0) {
//		     if (bookdto.getId() == null || bookdto.getId() == 0) {}else {
//			responseHandler = new ResponseHandler(MessageHandler.FAILED,test);
//		}
//		return new ResponseEntity(responseHandler,HttpStatus.OK);
//			
//		}
	//Update api
	@RequestMapping(value="/update" ,method=RequestMethod.PUT)
	public Book updateBook(@RequestBody BookDTO bookdto) {
	  return bookservice.updateBooks(bookdto);
	}
	
	//delete api
	@RequestMapping(value="/delete/{id}" ,method=RequestMethod.DELETE)
	public String deleteById(@PathVariable Integer id) {
		return bookservice.deleteById(id);
	}
	
	
	
}
