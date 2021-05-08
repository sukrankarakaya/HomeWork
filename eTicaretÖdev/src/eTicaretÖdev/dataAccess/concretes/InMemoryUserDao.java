package eTicaret÷dev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaret÷dev.dataAccess.abstracts.UserDao;
import eTicaret÷dev.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	private List<User>users =new ArrayList<User>();
	public InMemoryUserDao() {
		User user1 =new User(1,"ﬁ¸kran","Karakaya","suko@gmail.com","123456",true);
		User user2 =new User(2,"Hakan","AkÁa","hakan@gmail.com","123456",true);

		users.add(user1);
		users.add(user2);
		
	}
	

	@Override
	public void add(User user) {
		System.out.println("User Eklendi : "+user.geteMail());
		users.add(user);
		
		
	}

	@Override
	public void updatae(User user) {
		User userUpdate = users.stream()
				.filter(u->u.getId()==user.getId())
				.findFirst()
				.orElse(null);
		userUpdate.seteMail(user.geteMail());
		userUpdate.setFirstName(user.getFirstName());
		userUpdate.setLastName(user.getLastName());
		userUpdate.setPassword(user.getPassword());
		userUpdate.setVerify(user.isVerify());
		
		
		
		
	
		
	}

	@Override
	public void delete(int userId) {
		User userToDelete =users.stream()
				.filter(u-> u.getId()==userId)
				.findFirst()
				.orElse(null);
		users.remove(userToDelete);
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public User get(String eMail) {
		User user=users.stream()
				.filter(u->u.geteMail()==eMail)
				.findFirst()
				.orElse(null);
				
		return user;
	}

}
