package carroll.tbel.project2.repositories;

import carroll.tbel.project2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByUsernameAndPassword(String username, String password);
}
