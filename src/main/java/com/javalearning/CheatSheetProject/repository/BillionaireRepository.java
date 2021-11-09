package com.javalearning.CheatSheetProject.repository;

import com.javalearning.CheatSheetProject.model.Billionaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BillionaireRepository extends CrudRepository<Billionaire, Integer> {
}
