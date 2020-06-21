package com.airline.airbooking.repository;

import com.airline.airbooking.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, String> {
}