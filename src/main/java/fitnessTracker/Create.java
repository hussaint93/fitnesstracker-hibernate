package fitnessTracker;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

public class Create {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		//adding appointment object 
		Appointment app1 = new Appointment();
		app1.setAddress("mumbai");
		app1.setEmail("h@gmail.com");
		app1.setName("hussain");
		app1.setNoOfWeeks(3);
		app1.setNumber(1234567890L);
		app1.setPackageSelected(300);
		app1.setAmount(app1.getNoOfWeeks()*app1.getPackageSelected());
		app1.setPhysiotherapist(false);
		app1.setTraineePreference("male");
		
		Appointment app2 = new Appointment();
		app2.setAddress("mumbai");
		app2.setEmail("m@gmail.com");
		app2.setName("mohammed");
		app2.setNoOfWeeks(3);
		app2.setNumber(1234567890L);
		app2.setPackageSelected(300);
		app2.setAmount(app2.getNoOfWeeks()*app2.getPackageSelected());
		app2.setPhysiotherapist(false);
		app2.setTraineePreference("male");
		
		Appointment app3 = new Appointment();
		app3.setAddress("mumbai");
		app3.setEmail("s@gmail.com");
		app3.setName("shiv");
		app3.setNoOfWeeks(3);
		app3.setNumber(1234567890L);
		app3.setPackageSelected(300);
		app3.setAmount(app3.getNoOfWeeks()*app3.getPackageSelected());
		app3.setPhysiotherapist(false);
		app3.setTraineePreference("male");
		
		//add user obj
		User u1 = new User();
		u1.setEmail("h@gmail.com");
		u1.setName("hussain");
		u1.setNumber(12345L);
		u1.setPassword("ggfdgsyuaguyewtuew");
		
		User u2 = new User();
		u2.setEmail("m@gmail.com");
		u2.setName("mohammed");
		u2.setNumber(12345L);
		u2.setPassword("ggfdgsyuaguyewtuew");
		
	
		Set<Appointment> appu1 = new HashSet<Appointment>();
		appu1.add(app1);
		appu1.add(app3);
		
		Set<Appointment> appu2= new HashSet<Appointment>();
		appu2.add(app2);
		
		u1.setAppointments(appu1);
		u2.setAppointments(appu2);
		
		session.save(u1);
		session.save(u2);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
	}
}
