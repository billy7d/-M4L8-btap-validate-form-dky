package repository;

import model.User;
import org.springframework.data.repository.Repository;

public interface UserRepoInterface extends Repository<User,Integer> {
    void save(User user);
}
