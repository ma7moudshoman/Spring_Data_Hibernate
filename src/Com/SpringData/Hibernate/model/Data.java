package Com.SpringData.Hibernate.model;

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
@Table(name = "data")
public class Data {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="id")
    private int id;

    @Column(name="person_age")
    private String age;

    @OneToOne(mappedBy = "data" ,cascade = CascadeType.ALL)
    private person person;

public Data(){

}


public person getPerson() {
	return person;
}


public void setPerson(person person) {
	this.person = person;
}


public int getId(){
    return id;
}
public void setId(int id){
    this.id=id;
}
public String getAge(){
    return age;

}
public void setAge (String age){
    this.age=age;
}
}
