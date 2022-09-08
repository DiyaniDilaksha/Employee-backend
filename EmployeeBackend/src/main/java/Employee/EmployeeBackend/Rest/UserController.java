package Employee.EmployeeBackend.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Employee.EmployeeBackend.Entity.User;
import Employee.EmployeeBackend.Service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;
	
	//save
	@PostMapping("/saveUser")
	public User save(@RequestBody User stObj) {
		System.out.println("controller"+stObj);
		userService.saveOrUpdate(stObj);
		return stObj;	
	}
}
