import com.example.models.Book;
import com.example.presentation.FrontEnd;
import com.example.repo.BookDaoImpl;
import com.example.service.Service;
import com.example.utility.ConnectionFactory;

public class MainDriver {
	

	public static void main(String[] args) {
		
		
		/*
		 * Testing for Connection 
		 */
		
		
		ConnectionFactory.getConnection();
		
		
//		-----------------------------------------------------
		
	//Testing Dao 
		
//		BookDaoImpl bDao = new BookDaoImpl();
//
//		Book b = bDao.selectBookById(1);
//		
//		bDao.updateAvailablity(b, true);
		
//		System.out.println(bDao.selectBookById(1));
//		System.out.println(bDao.selectBookByName("Dune"));
//		System.out.println(bDao.selectAllBooks());
		
//		-----------------------------------------------------
		
		BookDaoImpl bDao = new BookDaoImpl();
		Service service = new Service(bDao);
		FrontEnd frontEnd = new FrontEnd(service);
		
		Book b = bDao.selectBookByName("Dune");
		
		bDao.updateAvailablity(b, false);
//		
//		System.out.println(service.getAllBooks());
		
		frontEnd.displayBooks();

	}

}
