package com.demoBydeepak.crudOperation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoBydeepak.crudOperation.modal.DemoUser;
import com.demoBydeepak.crudOperation.services.DemoService;

@RestController
public class DemoController {
	@Autowired
	private DemoService servicess;
	
	@GetMapping("/show")
	public String show() {
		return "hello its success";
	}
	
	
	
	@PostMapping("/save")  
	public int saveBook(@RequestBody DemoUser user)   
	{  
		servicess.savedata(user);  
	return user.getId();  
	}  
	
	
	@GetMapping("/getuser")
	public List<DemoUser> getalluserrr(@RequestBody DemoUser user){
		return servicess.getallusers();
	}
	
	@GetMapping("/getuser/{id}")
	public Optional<DemoUser> getuserbyids(@RequestBody DemoUser user, @PathVariable int id) {
		return servicess.getbyiduser(id);
		
	}
	
	@DeleteMapping("/getuser/{id}")
	public String deleteById(@PathVariable int id) {
		
		servicess.deleteById(id);
		return "delete success this id "+ id +"information ";
	}
	
	@PutMapping("updateuser")
	public DemoUser UpdatedData(@RequestBody DemoUser user) {
		return servicess.updatedUser(user);
//		return "data are updated successfully "+user.getId();
	}


}
