package com.taxbridgeai.taxbridgeai.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/Users")
public class UserController
{
    @Autowired
    private UserService service;


    @GetMapping("/{id}")
    public User getTheUser(@PathVariable Long id)
    {
        return service.getUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTheUser(@PathVariable Long id)
    {
        service.deleteUser(id);
    }


    @PutMapping("/{id}")
    public User updateTheUser(@PathVariable Long id, @RequestBody User user)
    {
        return service.updateUser(id,user);
    }

}