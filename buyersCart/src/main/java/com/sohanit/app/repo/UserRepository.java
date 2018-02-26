package com.sohanit.app.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sohanit.app.model.UserDetails;


/**
 * @author Veera
 *
 */
public interface UserRepository extends JpaRepository<UserDetails, Long> {
    UserDetails findByUserName(String userName);
    
}