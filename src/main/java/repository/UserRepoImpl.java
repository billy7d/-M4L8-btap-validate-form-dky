package repository;

import model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Transactional
public class UserRepoImpl implements UserRepoInterface{
    @Override
    public void save(User user) {
        @PersistenceContext
        private EntityManager em;
    }
}
