package fitnessTracker;

import org.hibernate.Session;

public class Delete {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
//		User user = (User)session.load(User.class, 1);
//		session.delete(user);
		
		 Appointment app= (Appointment)session.load(Appointment.class, 6);
		 session.delete(app);
		System.out.println("Deleted Successfully");
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}
