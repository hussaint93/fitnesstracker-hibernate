package fitnessTracker;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private Long number;
	private String name;
	private String email;
	private String password;
	
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="USER_ID")
    private Set<Appointment> appointments;
	
	public Integer getUserId() {
		return userId;
	}
	public Set<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}
	public void setUserId(Integer id) {
		this.userId = id;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + userId + ", number=" + number + ", name=" + name + ", email=" + email + ", password="
				+ password + "]";
	}
	
}
