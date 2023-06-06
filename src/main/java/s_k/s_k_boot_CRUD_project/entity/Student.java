package s_k.s_k_boot_CRUD_project.entity;

import jakarta.persistence.Column;  
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_information_records2")
public class Student {
	@Id
	private int roll;
	@Column
	private String name;
	@Column
	private String city;
	
	
	public Student() {}


	public Student(int roll, String name, String city) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}

