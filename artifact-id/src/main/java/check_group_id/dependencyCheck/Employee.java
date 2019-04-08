package check_group_id.dependencyCheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	@Required  
	public void setId(int id) { this.id = id; }
	 
	/*
	 * @Required public void getId_NA(int id) { this.id = id; }
	 */

	public String getName() {
		return name;
	}
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	public String printAll() {
		return this.name + this.id;
	}
}
