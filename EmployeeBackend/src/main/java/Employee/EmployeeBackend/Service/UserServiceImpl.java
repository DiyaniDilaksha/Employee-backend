package Employee.EmployeeBackend.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.EmployeeBackend.Entity.User;
import Employee.EmployeeBackend.Repository.UserDao;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public void saveOrUpdate(User user) {
		System.out.println("service"+user);
		userDao.saveOrUpdate(user);	
		
	}

}
