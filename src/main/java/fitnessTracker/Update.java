package fitnessTracker;

import org.hibernate.Session;

public class Update {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		  User user = (User)session.get(User.class, 1);
		  user.setName("chetan");
		  
		  
		  Appointment app= (Appointment)session.get(Appointment.class, 2);
		  app.setName("hvfhfdveh");
		  System.out.println("Updated Successfully");
		session.getTransaction().commit();
		  HibernateUtil.shutdown();
	}
}
