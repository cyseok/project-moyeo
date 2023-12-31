package com.moyeo.service;

import org.springframework.stereotype.Service;

import com.moyeo.dto.SecurityAuth;
import com.moyeo.dto.Userinfo;
import com.moyeo.repository.UserinfoSecurityRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserinfoSecurityServiceImpl implements UserinfoSecurityService{
	private final UserinfoSecurityRepository userinfoSecurityRepository;
	
	@Override
	public void addUserinfoSecurity(Userinfo userinfo) {
		userinfoSecurityRepository.insertUserinfoSecurity(userinfo);
	}

	@Override
	public void addSecurityAuth(SecurityAuth auth) {
		userinfoSecurityRepository.insertSecurityAuth(auth);
	}

	@Override
	public Userinfo getUserinfoSecurity(String id) {
		// TODO Auto-generated method stub
		return userinfoSecurityRepository.selectUserinfoSecurityByUserid(id);
	}

}
