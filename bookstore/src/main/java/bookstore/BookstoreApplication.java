package bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookstoreApplication {

	@RequestMapping(value="/recommended")
	public String readingList(){
		return "a,b,c";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(BookstoreApplication.class,args);
	}

}
