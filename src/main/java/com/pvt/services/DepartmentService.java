package com.pvt.services;

import com.pvt.Dao.DepartmentDao;
import com.pvt.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    
    @Transactional
    public void addDepartment(Department dep) {
	departmentDao.addDepartment(dep);
    }
    
    @Transactional
    public Department getDepartment(Integer id) {
	return departmentDao.getDepartment(id);
    }
    
    @Transactional
    public void deleteDepartment(Integer id) {
	departmentDao.deleteDepartment(id);
    }
}
