package com.andreeahurducas.datauiapp.controllers;

import com.andreeahurducas.datauiapp.models.Nationality;
import com.andreeahurducas.datauiapp.services.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NationalityController {
    @Autowired
    private NationalityService nationalityService;

    @GetMapping("/nationalities")
    public String getNationalities(Model model) {
        model.addAttribute("nationalities",nationalityService.getNationalities());
        return "nationalities";
    }

    @GetMapping("/onenationality")
    @ResponseBody
    public Nationality getNationalityById(Integer Id,Model model) {
        return nationalityService.getNationalityById(Id);
    }

    @RequestMapping(method={RequestMethod.POST, RequestMethod.PUT}, value = "/save")
    public String updateNationality(Nationality nationality) {
        nationalityService.updateNationality(nationality);
        return "redirect:/nationalities";
    }

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}, value = "/addNew")
    public String addNationality(Nationality nationality) {
        nationalityService.addNationality(nationality);
        return "redirect:/nationalities";
    }

    @RequestMapping(method = {RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.GET}, value = "/delete")
    public String deleteNationality(Integer Id) {
        nationalityService.deleteNationality(Id);
        return "redirect:/nationalities";
    }

}
