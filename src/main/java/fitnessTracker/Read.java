package fitnessTracker;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

public class Read {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		 Query query = session.createQuery("from User");
		 List<User> users = query.getResultList();
		 for(User user : users) {
			 System.out.println("id:-"+user.getUserId()+" Name:-"+user.getName());
		 }
		 System.out.println();
		 Query query1 = session.createQuery("from Appointment");
		 List<Appointment> appointments = query1.getResultList();
		 System.out.println();
		 for(Appointment app : appointments) {
			 System.out.println(app);
		 }
		  session.getTransaction().commit();
		  HibernateUtil.shutdown();
	}
}
