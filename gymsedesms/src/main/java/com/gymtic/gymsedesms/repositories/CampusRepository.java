package com.gymtic.gymsedesms.repositories;
import com.gymtic.gymsedesms.models.Campus;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface CampusRepository extends MongoRepository <Campus, String> { }
