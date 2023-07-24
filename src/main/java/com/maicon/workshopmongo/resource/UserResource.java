package com.maicon.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maicon.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAl(){
		User maria =  new User("1","Maria Silva", "maria@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria));
		return ResponseEntity.ok().body(list);
		
	}

}
