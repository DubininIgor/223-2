package web.service;

import org.springframework.stereotype.Service;
import web.models.User;
@Service
public interface UserService {
    void add(User user);

}
