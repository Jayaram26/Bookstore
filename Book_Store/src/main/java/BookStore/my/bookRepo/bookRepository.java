package BookStore.my.bookRepo;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepository extends CrudRepository<Book, Integer> {
	

	
	
	

}
