package com.javalearning.CheatSheetProject;


import com.javalearning.CheatSheetProject.model.HelloWorld;
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

	public static void main(String[] args) {
		SpringApplication.run(CheatSheetProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try {
/*			System.console().writer().println("test");*/
			HelloWorld hw = bs.getHelloWorld();
			System.out.println(hw);
		} catch (Exception e) {
			System.out.println("Ca fonctionne pas");
			throw new Exception("I am Exception Alpha!");
		}
	}

}
