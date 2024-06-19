package Com.SpringData.Hibernate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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

	
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "student")
	private Set<Info> info =new HashSet<Info>();
	
	public Student() {
		
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	
	
	
	public Set<Info> getInfo() {
		return info;
	}

	public void setInfo(Set<Info> info) {
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
