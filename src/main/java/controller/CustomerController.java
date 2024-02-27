package controller;

import model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;

import java.util.List;

@Controller
public class CustomerController {
    CustomerService customerService = new CustomerService();
//    @GetMapping("/customer")
//    public String showList() {
//        return "index";
//    }
    @GetMapping("/customer")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Customer> customers = customerService.findAll();
        System.out.println(customers);
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }
}

