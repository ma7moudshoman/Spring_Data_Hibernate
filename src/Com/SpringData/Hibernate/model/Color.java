package Com.SpringData.Hibernate.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="color")
public class Color {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="color_id")
	private int id;
	@Column(name="color_name")
	private String name;
	
	
	public Color () {
		
	}

	@ManyToMany
	@JoinTable(
			name = "car_color",
			joinColumns = @JoinColumn(name= "color_id"),
			 inverseJoinColumns = @JoinColumn(name="car_id")
			)
	private List<Car>cars=new ArrayList<Car>();
	
	
	
	
	public Color( String name) {
        super();
		this.name = name;
	}


	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
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
