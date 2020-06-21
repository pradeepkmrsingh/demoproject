package com.airline.airbooking.repository;

import com.airline.airbooking.document.Userbooking;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Saveuserdata extends MongoRepository<Userbooking, String> {

}