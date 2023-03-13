package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.User;
import web.service.UserService;

@Controller
public class HelloController {
	@Autowired
    UserService userService;

	@PostMapping(value = "/")
    public String addUserForm(@RequestParam("name") String name, @RequestParam("age") int age) {
        User user = new User(name, age);
        userService.add(user);
        return "index";
    }

}