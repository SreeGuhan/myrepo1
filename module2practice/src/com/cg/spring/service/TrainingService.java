package com.cg.spring.service;

import java.util.List;

import com.cg.spring.dto.ScheduledSessions;

public interface TrainingService {

	public List<ScheduledSessions> showAllEmployee();
	public ScheduledSessions searchEmployee(int id);
	public void updateEmployee(ScheduledSessions emp);
	public void addEmployee(ScheduledSessions emp);
}
