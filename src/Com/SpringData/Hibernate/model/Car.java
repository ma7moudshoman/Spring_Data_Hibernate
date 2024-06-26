package Com.SpringData.Hibernate.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;


@Entity
@Table(name="car")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="car_id")
	private int id;
	
	@Column(name="car_name")
	private String name;
	
	@ManyToMany(cascade = { CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH},
			fetch = FetchType.EAGER)
	@JoinTable(
			name = "car_color",
			joinColumns = @JoinColumn(name= "car_id"),
			 inverseJoinColumns = @JoinColumn(name="color_id")
			)
	private  List<Color> colores=new ArrayList<Color>();
	
	
	
	
	public Car() {
		
	}
	
	
	

	public Car( String name) {
		 super();
		this.name = name;
	}




	public List<Color> getColores() {
		return colores;
	}




	public void setColores(List<Color> colores) {
		this.colores = colores;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	
}
