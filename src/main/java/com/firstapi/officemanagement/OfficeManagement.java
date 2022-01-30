package com.firstapi.officemanagement;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.firstapi.officemanagement.people.People;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OfficeManagement {

	public static void main(String[] args) {
		SpringApplication.run(OfficeManagement.class, args);
	}

}
