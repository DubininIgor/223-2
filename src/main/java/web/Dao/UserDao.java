package web.Dao;

import org.springframework.stereotype.Component;
import web.models.User;
@Component
public interface UserDao {
    void add(User user);
}
