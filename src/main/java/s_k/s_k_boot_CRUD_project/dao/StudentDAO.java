package s_k.s_k_boot_CRUD_project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import s_k.s_k_boot_CRUD_project.entity.Student;



public interface StudentDAO extends JpaRepository<Student,Integer> {

	
	
	
}
