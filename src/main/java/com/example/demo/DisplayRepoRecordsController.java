package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayRepoRecordsController {
@Autowired
    private PhoneRepo phoneRepo ;
    @RequestMapping("/displayRepoRecords" )
    public String displayRepoRecords(Model model) {
        model.addAttribute( "phones", phoneRepo.findAll());

        return "DisplayRepoRecordsView";
    }
}
