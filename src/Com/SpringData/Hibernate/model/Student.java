package Com.SpringData.Hibernate.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@Column(name= "name")
	private String Name;

	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "student",fetch = FetchType.LAZY)
	private List<Info> info =new ArrayList();
	
	public Student() {
		
	}
	

	public Student(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	
	public List<Info> getInfo() {
		return info;
	}


	public void setInfo(List<Info> info) {
		this.info = info;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
	
}
