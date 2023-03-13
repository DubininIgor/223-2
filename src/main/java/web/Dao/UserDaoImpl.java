package web.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.models.User;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
@Component
public class UserDaoImpl implements UserDao{
    @Autowired
    private EntityManager entityManager;


    @Transactional
    @Override
    public void add(User user) {
        entityManager.persist(user);
    }
}
