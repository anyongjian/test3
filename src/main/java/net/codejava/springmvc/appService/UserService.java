package net.codejava.springmvc.appService;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public String getUserName(){
		return "name from userservice";
	}

}
