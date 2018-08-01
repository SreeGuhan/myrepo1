package com.cg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.TrainingDao;
import com.cg.spring.dto.ScheduledSessions;

@Service("employeeservice")
@Transactional
public class TrainingServiceImpl implements TrainingService {
    @Autowired
	TrainingDao employeedao;
    
	@Override
	public List<ScheduledSessions> showAllEmployee() {
		// TODO Auto-generated method stub
		return employeedao.showAllEmployee();
	}
	@Override
	public ScheduledSessions searchEmployee(int id) {
		// TODO Auto-generated method stub
		return employeedao.searchEmployee(id);
	}
	
	public void updateEmployee(ScheduledSessions emp){
		
		 employeedao.updateEmployee(emp);
	}
	@Override
	public void addEmployee(ScheduledSessions emp) {
		employeedao.addEmployee(emp);
		
	}
	


}
