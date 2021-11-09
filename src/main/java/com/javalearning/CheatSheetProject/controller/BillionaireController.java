package com.javalearning.CheatSheetProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javalearning.CheatSheetProject.model.Billionaire;
import com.javalearning.CheatSheetProject.service.BillionaireService;

@RestController
public class BillionaireController {

    @Autowired
    private BillionaireService billionaireService;

    /**
     * Read - Get all billionaires
     * @return - An Iterable object of Billionaire full filled
     */
    @GetMapping("/billionaires")
    public Iterable<Billionaire> getBillionaires() {
        return billionaireService.getBillionaires();
    }

}
