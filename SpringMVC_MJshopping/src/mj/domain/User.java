package mj.domain;

import java.io.Serializable;

public class User implements Serializable{

	public String User_id;
	public String User_name;
	public String User_pwd;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
		public String getUser_id() {
	        return User_id;
	    }
	    public void setUser_id(String user_id) {
	        this.User_id = user_id;
	    }
	    public String getUser_name() {
	        return User_name;
	    }
	    public void setUser_name(String user_name) {
	        this.User_name = user_name;
	    }
		public String getUser_pwd() {
			return User_pwd;
		}
		public void setUser_pwd(String user_pwd) {
			User_pwd = user_pwd;
		}
	
	@Override
	public String toString() {
		return "User [User_id=" + User_id + ", User_name=" + User_name + ", User_pwd="
				+ User_pwd + "]";
	}
	
	
}
