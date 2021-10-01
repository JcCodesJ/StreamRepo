package carroll.tbel.project2.services;

import carroll.tbel.project2.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findOneById(Long id);
    User updateOne(Long id, User user);
    User findOneByLogin(String username, String password);
}
