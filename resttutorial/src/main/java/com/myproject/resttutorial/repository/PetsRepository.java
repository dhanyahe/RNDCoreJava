package com.myproject.resttutorial.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.myproject.resttutorial.models.Pets;

public interface PetsRepository extends MongoRepository<Pets,String>{
	
	Pets findBy_id(ObjectId _id);
	Pets deleteBy_id(ObjectId _id);

}
