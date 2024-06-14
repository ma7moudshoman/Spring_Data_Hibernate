package Com.SpringData.Hibernate.model;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int  id;
	
	@Column(name = "full_name")
	String name;

	
	
	@OneToOne(cascade = CascadeType.MERGE) // Refresh access all data from database but  Mostly i will used all  
	@JoinColumn(name = "data_id")
	private Data data;
	
 	 
	public person () {
		
	}
	
	
	
	public Data getData() {
		return data;
	}



	public void setData(Data data) {
		this.data = data;
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
