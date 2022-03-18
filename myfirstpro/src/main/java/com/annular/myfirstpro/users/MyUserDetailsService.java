package com.annular.myfirstpro.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service 
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users users = userRepository.findByUserName(username);
		System.out.println("\n\nuser name here : "+username+"\n\n user obj : "+users+"\n\n");
		if(users==null) {
		System.out.println(" null came\n\n");
			throw new UsernameNotFoundException("User not found");
		}
		
		System.out.println("\n\nmy user details service   :  "+ userRepository.findByUserName(username)+"\n\n");
		
		return new UserPrincipal(users);
	}

}
