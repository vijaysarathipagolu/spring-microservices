/**
 * 
 */
package com.microservices.user;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

/**
 * @author vijay
 *
 */
public interface UserRepository extends CrudRepository<User, Long>{
	
	public Collection<User> findByLastName(String ln);
	
	public User saveUser(User user);
	
	public void delete(User user);
	
	public Collection<User> findAll();

    public User updateUser(User user);
    
}
