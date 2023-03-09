package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarsService;
import web.service.CarsServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloCarsController {
    @Autowired
    private CarsService carsService;

    @GetMapping(value = "/cars")
    public String printListCars(@RequestParam(value = "count", required = false) int count, Model model) {

        model.addAttribute("cars", carsService.listCarsByCount(count));

        return "/cars";
    }
}
