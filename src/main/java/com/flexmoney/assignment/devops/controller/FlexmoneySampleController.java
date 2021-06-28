package com.flexmoney.assignment.devops.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flexmoney.assignment.devops.controller.model.Employee;

@RestController
@RequestMapping("/api")
public class FlexmoneySampleController {
	@GetMapping("/data")
	@CrossOrigin(origins = "http://localhost:4200")
	public Employee getMethod() {
        return new Employee(1L, "Rohan", "Joshi");
    }
}
