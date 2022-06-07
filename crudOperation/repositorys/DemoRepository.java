package com.demoBydeepak.crudOperation.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoBydeepak.crudOperation.modal.DemoUser;

@Repository
public interface DemoRepository extends JpaRepository<DemoUser, Integer> {

}
