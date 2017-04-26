package mj.service;

import mj.domain.User;

public interface UserService {
	User login(String loginname,String password);
}
