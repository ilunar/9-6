package com.pvt.services;

import com.pvt.DAO.EmployeeDetailDao;
import com.pvt.model.EmployeeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EmployeeDetailService {
    @Autowired
    private EmployeeDetailDao employeeDetailDao;
    
    @Transactional
    public EmployeeDetail getEmployeeDetail(Integer id) {
	return employeeDetailDao.getEmployeeDetail(id);
    }
}
