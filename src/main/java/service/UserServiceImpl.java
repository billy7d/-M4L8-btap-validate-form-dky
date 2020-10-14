package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRepoInterface;

public class UserServiceImpl implements UserServiceInterface {
    @Autowired
    private UserRepoInterface userRepoInterface;

    @Override
    public void save(User user) {
        userRepoInterface.save(user);
    }
}
