package com.github.ganesh.service;

import com.github.ganesh.model.StudentInterface;

public interface StudentService {
	StudentInterface save(StudentInterface student);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
