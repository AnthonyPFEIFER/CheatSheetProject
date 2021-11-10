package com.javalearning.CheatSheetProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Billionaire> getBillionaires() {
        return billionaireService.getBillionaires();
    }

    @GetMapping("/billionaire/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Billionaire> getBillionaireById(@PathVariable Integer id) { return billionaireService.getBillionaireById(id);}

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Billionaire createNewBillionaire(@RequestBody Billionaire billionaire) {
        return billionaireService.createNewBillionaire(billionaire);
    }

    @DeleteMapping({"/billionaire/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteBillionaire(@PathVariable Integer id) {
        billionaireService.deleteBillionaire(id);
    }
}