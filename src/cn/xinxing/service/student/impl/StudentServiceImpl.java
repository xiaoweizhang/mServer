package cn.xinxing.service.student.impl;

import java.util.List;

import cn.xinxing.business.StudentBusiness;
import cn.xinxing.model.Students;
import cn.xinxing.service.student.StudentService;

/**
 * 
 */
public class StudentServiceImpl implements StudentService{

	@Override
	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return StudentBusiness.getAllStudents();
	}

}
