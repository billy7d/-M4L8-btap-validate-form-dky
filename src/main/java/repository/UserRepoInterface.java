package repository;

import model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepoInterface extends PagingAndSortingRepository<User,Integer> {

}
