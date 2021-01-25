package manikanta.mani.SpringJdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "msg.properties")
public class Person {
   
	@Value("${msg.pid}")
	private int pid;
	
	@Value("${msg.name}")
	private String name;
	
	@Value("${msg.salary}")
	private double salary;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void displayPerson() {
		System.out.println(pid);
		System.out.println(name);
		System.out.println(salary);
	}
}
