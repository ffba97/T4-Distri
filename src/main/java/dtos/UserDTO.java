package dtos;

import abstracts.AbstractDto;
import beans.User.Address;
import beans.User.Company;
import interfaces.beans.IUser;
import interfaces.dtos.IUserDTO;
import services.PostsService;

public class UserDTO extends AbstractDto implements IUserDTO {

	private static final long serialVersionUID = 1L;
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;
	private PostDTO[] posts;

	public UserDTO(IUser user) {
		id = user.getID();
		name = user.getName();
		username = user.getUsername();
		email = user.getEmail();
		address = user.getAddress();
		phone = user.getPhone();
		website = user.getWebsite();
		company = user.getCompany();
		posts = new PostsService().getByUserId(Integer.toString(id));
	}

	public PostDTO[] getPosts(){
		return posts;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getUserName() {
		return username;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
		return phone;
	}

	@Override
	public String getWebsite() {
		// TODO Auto-generated method stub
		return website;
	}

	@Override
	public Address getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public Company getCompany() {
		// TODO Auto-generated method stub
		return company;
	}

}
