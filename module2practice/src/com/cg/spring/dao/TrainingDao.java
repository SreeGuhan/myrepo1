package com.cg.spring.dao;

import java.util.List;

import com.cg.spring.dto.ScheduledSessions;

public interface TrainingDao {

	public List<ScheduledSessions> showAllEmployee();
	public ScheduledSessions searchEmployee(int id);
	public void updateEmployee(ScheduledSessions emp);
	public void addEmployee(ScheduledSessions emp);
}
