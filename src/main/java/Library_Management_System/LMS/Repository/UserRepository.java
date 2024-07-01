package Library_Management_System.LMS.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import Library_Management_System.LMS.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
