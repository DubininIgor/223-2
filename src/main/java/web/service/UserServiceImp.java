package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.UserDao;
import web.models.User;

import javax.transaction.Transactional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }
}
//    private final List<Car> cars = new ArrayList<>();
//
//    public UserServiceImp() {
//
//        cars.add(new Car("mazda", 3, "black"));
//        cars.add(new Car("bmv", 5, "red"));
//        cars.add(new Car("vaz", 9, "white"));
//        cars.add(new Car("gaz", 21, "yellow"));
//        cars.add(new Car("vaz", 7, "blue"));
//    }
//
//    public List<Car> listCarsByCount(int count) {
//        if (count < 1 || count > 5) {
//            return cars;
//        } else
//            return cars.stream().limit(count).toList();
//    };
//}
