package com.taxbridgeai.taxbridgeai.user;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class UserService{

    @Autowired
    private UserRepository repo;
    
     
    public User getUser(Long id)
    {
        return repo.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }

    public void deleteUser(Long id)
    {
        if(!repo.existsById(id))
        {
            throw new UserNotFoundException(id);
        }
        else
        {
            repo.deleteById(id);

        }
    }

    public User updateUser(Long id, User theUser)
    {
        User user = repo.findById(id).orElseThrow(()-> new UserNotFoundException(id));
        user.setEmail(theUser.getEmail());
        user.setPassword(theUser.getPassword());
        return repo.save(user);
    }


}