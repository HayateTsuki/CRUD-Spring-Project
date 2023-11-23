package com.example.demo;

import org.springframework.beans.factory.annotation. Autowired ;
import org.springframework.stereotype. Controller ;
import org.springframework.ui.Model ;
import org.springframework.web.bind.annotation. RequestMapping ;
import org.springframework.web.bind.annotation. RequestParam ;

@Controller
public class AddController {
    @Autowired
    private PhoneRepo phoneRepo ;
    @RequestMapping ("/add" )
    public String add(
            @RequestParam ("manufacturer") String manufacturer ,
            @RequestParam ("model" ) String modelName ,
            @RequestParam ("publishYear" ) String publishYear ,
            Model model) throws Exception {
                Phone phone = new Phone(manufacturer , modelName , publishYear);
                System.out.println(phone);
                phoneRepo.save(phone);
                model.addAttribute("phone", phone);
                return "PhoneView";
            }


}