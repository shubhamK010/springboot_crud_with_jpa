package s_k.s_k_boot_CRUD_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import s_k.s_k_boot_CRUD_project.entity.Student;
import s_k.s_k_boot_CRUD_project.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student)
	{
		//serviceclass.method who can save student
		
		return studentService.addStudent(student);
		
	}
	

	@PostMapping("/bulkadd")
	public String addStudents(@RequestBody List <Student> students)
	{
		
		
		return studentService.addStudents(students);
		
	}
	
	
	
	@DeleteMapping("/all/{roll}")
	public String deleteStudent(@PathVariable int roll)
	{
		
		
		return studentService.deleteStudent(roll);
		
	}
	
	
	@PutMapping("/add")
	public String updateStudent(@RequestBody Student student)
	{
		
		
		return studentService.updateStudent(student);
		
	}
	
	@GetMapping("/showAll")
	public Iterable<Student>getStudent()
	{
		return studentService.getAllStudents();
		
	}

}