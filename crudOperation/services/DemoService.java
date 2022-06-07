package com.demoBydeepak.crudOperation.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoBydeepak.crudOperation.modal.DemoUser;
import com.demoBydeepak.crudOperation.repositorys.DemoRepository;
@Service
public class DemoService {
	
	@Autowired
	private DemoRepository repo;
	
	
	
	
	public void savedata( DemoUser demo) {
		repo.save(demo);
	}
	
	public List<DemoUser> getallusers(){
		return repo.findAll();
		
	}
	
	public Optional<DemoUser> getbyiduser(int id) {
		return repo.findById(id);
	}
	
	public void deleteById(int id){
		 repo.deleteById(id);
	}
	
	
	public DemoUser updatedUser(DemoUser user){
		
		DemoUser existingData =	 repo.findById(user.getId()).orElse(null);

		
        if (existingData == null) {
        throw new NullPointerException(
                "No Such user exists!!");
        	
//        	return "no such user exists-----------";
        }
        else {

		
	existingData.setName(user.getName());
	existingData.setAddress(user.getAddress());
	existingData.setCity(user.getCity());
	
	return repo.save(existingData);
	
//	return "data are updated successfully ="+user.getId();
	
	
        }
		
		
		
	}

	
	
	

}
