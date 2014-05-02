package com.batch.emp.processor;

import org.springframework.batch.item.ItemProcessor;

import com.batch.emp.vo.Employee;

public class CustomItemProcessor implements ItemProcessor<Employee, Employee> {

	public Employee process(Employee item) throws Exception {
		
		System.out.println("Processing..." + item);
		return item;
	}

}
