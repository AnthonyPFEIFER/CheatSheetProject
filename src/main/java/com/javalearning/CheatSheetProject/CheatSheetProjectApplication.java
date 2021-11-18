package com.javalearning.CheatSheetProject;


import com.javalearning.CheatSheetProject.model.Billionaire;
import com.javalearning.CheatSheetProject.model.HelloWorld;
import com.javalearning.CheatSheetProject.service.BillionaireService;
import org.springframework.boot.CommandLineRunner;
import com.javalearning.CheatSheetProject.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.EmptyResultDataAccessException;


@SpringBootApplication
public class CheatSheetProjectApplication implements CommandLineRunner {

	@Autowired
	private BusinessService bs;

	@Autowired
	private BillionaireService billionaireService;

	public static void main(String[] args) {
		SpringApplication.run(CheatSheetProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try {
			HelloWorld hw = bs.getHelloWorld();
			System.out.println(hw);
			Iterable<Billionaire> billionaires = billionaireService.getBillionaires();
			billionaires.forEach(billionaire -> System.out.println(billionaire.getFirstName() + " " + billionaire.getLastName()));

		} catch (Exception e) {
			System.out.println("Ca fonctionne pas");
			throw new Exception("I am Exception Alpha!");
		}
	}

}
