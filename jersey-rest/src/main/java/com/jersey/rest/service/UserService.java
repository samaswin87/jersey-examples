package com.jersey.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.NotFoundException;

import com.jersey.rest.model.User;

public class UserService {

	private List<User> users = new ArrayList<User>();
	
	public List<User> fetchAll() {

        users.add(new User(1, "A", "demo@gmail.com"));
        users.add(new User(2, "B", "demo1@gmail.com"));
        users.add(new User(3, "C", "demo2@gmail.com"));
        return users;
    }

    public User fetchBy(long id) throws NotFoundException {
        for (User user2 :  fetchAll()) {
             if (id == user2.getId()) {
                return user2;
             }else{
                throw new NotFoundException("Resource not found with Id :: " + id);
             }
         }
         return null;
     }

    public void create(User user) {
         users.add(user);
    }

    public void update(User user) {
         for (User user2 : users) {
            if (user.getId() == user2.getId()) {
                users.remove(user2);
                users.add(user);
            }
         }
    }

    public void delete(long id) throws NotFoundException {
    	User user = fetchBy(id);
    	if(user != null) {
    		users.remove(user);
    	}
    }

}
