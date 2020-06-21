package com.airline.airbooking.repository;
import com.airline.airbooking.document.Booking;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking ,String>{

}