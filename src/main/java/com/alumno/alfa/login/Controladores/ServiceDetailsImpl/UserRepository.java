package com.alumno.alfa.login.Controladores.ServiceDetailsImpl;

import com.alumno.alfa.login.Controladores.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    
}
