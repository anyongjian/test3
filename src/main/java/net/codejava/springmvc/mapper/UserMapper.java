package net.codejava.springmvc.mapper;

import java.util.List;

import net.codejava.springmvc.po.User;
import net.codejava.springmvc.po.UserCustom;
import net.codejava.springmvc.po.UserQueryVo;


public interface UserMapper {
	//用户信息的综合查询
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
	
	//咏怀古迹信息综合查询
	public List<User> findUserListByMap(UserQueryVo userQueryVo) throws Exception;
	//根据id查询用户
	public User findUserById(int id) throws Exception;
	//根据id列表查询用户列表
	public List<User> findUserByIds(UserQueryVo userQueryVo) throws Exception;
	
	//插入用户
	public int insertUser(User user) throws Exception;

	/*//根据id查询用户
	public User findUserById(int id) throws Exception;
	
	//添加用户信息
	public void insertUser(User user) throws Exception;
	
	//删除用户信息
	public void deleteUser(int id) throws Exception;*/
	
}
