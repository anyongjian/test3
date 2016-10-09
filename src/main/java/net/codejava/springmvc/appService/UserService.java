package net.codejava.springmvc.appService;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.springmvc.mapper.UserMapper;
import net.codejava.springmvc.po.User;

@Service
public class UserService {
	
	private static final Logger logger = Logger.getLogger(UserService.class);  
	@Autowired
	private UserMapper userMapper;
	public String getUserName() throws Exception{
	    User user = userMapper.findUserById(2);
	    logger.error(user.getName());
	    logger.info(user.getName());
	    logger.debug(user.getName());
	    logger.warn(user.getName());
	    
		return user.getName();
	}

}
