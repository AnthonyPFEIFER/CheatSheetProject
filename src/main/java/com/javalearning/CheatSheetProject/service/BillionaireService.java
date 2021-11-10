package com.javalearning.CheatSheetProject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javalearning.CheatSheetProject.model.Billionaire;
import com.javalearning.CheatSheetProject.repository.BillionaireRepository;

import lombok.Data;

@Data
@Service
public class BillionaireService {

    @Autowired
    private BillionaireRepository billionaireRepository;

    public Optional<Billionaire> getBillionaireById(final Integer id) {
        return billionaireRepository.findById(id);
    }

    public Iterable<Billionaire> getBillionaires() {
        return billionaireRepository.findAll();
    }

    public void deleteBillionaire(final Integer id) {
        billionaireRepository.deleteById(id);
    }

    public Billionaire createNewBillionaire(Billionaire billionaire) {
        Billionaire savedBillionaire = billionaireRepository.save(billionaire);
        return savedBillionaire;
    }
    public Billionaire updateBillionaire(Integer id, Billionaire billionaire) {
        return billionaireRepository.save(billionaire);
    }
}
