package mj.service;

import mj.domain.User;

public interface EnrollService {
	User enroll(String name,String id,String pwd);
}
