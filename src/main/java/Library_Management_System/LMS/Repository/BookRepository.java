package Library_Management_System.LMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Library_Management_System.LMS.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
