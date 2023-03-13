//package web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
////import web.service.UserService;
//
//@Controller
//public class HelloCarsController {
//    @Autowired
//    private UserService userService;
//
//    @GetMapping(value = "/cars")
//    public String printListCars(@RequestParam(value = "count", required = false) int count, Model model) {
//
//        model.addAttribute("cars", userService.listCarsByCount(count));
//
//        return "/cars";
//    }
//}
