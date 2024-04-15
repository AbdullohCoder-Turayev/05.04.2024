package com.example.demo.Controller;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Employee;
import com.example.demo.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@Controller
public class WebController {

    @Autowired
    MainService mainService;

    @GetMapping("/main")
        public String showMain(){



            return"main";
        }


//    @GetMapping("/index")
//    public String index(Model model){
//        int a = 10, b = 55, c = a * b;
//
//        model.addAttribute("result", c);
//        return "index";
//    }



    @GetMapping("/page1")
    public void access1() {
        System.out.println("Hi this is page 1!");
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustom(){
        System.out.println("This is customer class!");
        return mainService.getCustomers();
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmp(){
        System.out.println("This is employee class!");
        return mainService.getEmployees();
    }

    @GetMapping("/page2")
    public void access2() {
        System.out.println("Hi this is page 2!");
    }

    @GetMapping("/page3")
    public void access3() {
        System.out.println("Hi this is page 3!");
    }

}
