package com.pvt.services;

import com.pvt.DAO.EmployeeDao;
import com.pvt.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EmployeeService {
    
    @Autowired
    private EmployeeDao employeeDao;
    
    @Transactional
    public void addEmployee(Employee emp) {
	employeeDao.addEmployee(emp);
    }
    
    @Transactional
    public Employee getEmployee(Integer id) {
	return employeeDao.getEmployee(id);
    }
    
    @Transactional
    public void deleteEmployee(Integer id) {
	employeeDao.deleteEmployee(id);
    }
}
