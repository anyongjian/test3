package net.codejava.springmvc.mapper;

import java.util.List;

import net.codejava.springmvc.po.User;
import net.codejava.springmvc.po.UserCustom;
import net.codejava.springmvc.po.UserQueryVo;


public interface UserMapper {
	//�û���Ϣ���ۺϲ�ѯ
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
	
	//ӽ���ż���Ϣ�ۺϲ�ѯ
	public List<User> findUserListByMap(UserQueryVo userQueryVo) throws Exception;
	//����id��ѯ�û�
	public User findUserById(int id) throws Exception;
	//����id�б��ѯ�û��б�
	public List<User> findUserByIds(UserQueryVo userQueryVo) throws Exception;
	
	//�����û�
	public int insertUser(User user) throws Exception;

	/*//����id��ѯ�û�
	public User findUserById(int id) throws Exception;
	
	//����û���Ϣ
	public void insertUser(User user) throws Exception;
	
	//ɾ���û���Ϣ
	public void deleteUser(int id) throws Exception;*/
	
}
