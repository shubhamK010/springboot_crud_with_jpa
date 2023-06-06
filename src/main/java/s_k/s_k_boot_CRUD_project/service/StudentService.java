package s_k.s_k_boot_CRUD_project.service;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import s_k.s_k_boot_CRUD_project.dao.StudentDAO;
import s_k.s_k_boot_CRUD_project.entity.Student;



@Service
public class StudentService {
	
	@Autowired
	private StudentDAO dao;
	public String addStudent(Student student)
	{
	
		dao.save(student);
		return "New student has been added into database, roll no:"+student.getRoll();
		
		
		
	}
	
	
	public String addStudents(List <Student> students)
	{
		
		dao.saveAll(students);
		return "All new students has been added into database";
		

	}
	
	public List<Student> getAllStudents() {
	    return dao.findAll();
	}
	
	
	public String deleteStudent(int roll)
	{
		
		Student student=dao.findById(roll).get();
		
		dao.delete(student);
		return "Roll number is deleted:"+roll;
		
		

	}
	
	public String updateStudent(Student student)
	{
		
		dao.save(student);
		return "Roll number is updated :"+student.getRoll();
		

	}
	
	public Student getStudent(int roll)
	{
		
		return dao.findById(roll).get();
		
		

	}
	
	
		
	

}
