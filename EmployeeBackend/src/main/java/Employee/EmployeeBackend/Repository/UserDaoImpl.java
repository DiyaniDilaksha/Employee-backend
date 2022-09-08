package Employee.EmployeeBackend.Repository;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Employee.EmployeeBackend.Entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private EntityManager entityManager;
	@Override
	public void saveOrUpdate(User user) {
		System.out.println("in dao"+user);
		Session currentSession =	entityManager.unwrap(Session.class); 
		currentSession.saveOrUpdate(user);
		
	}

}
