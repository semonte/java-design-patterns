package org.designpatterns.abstractfactory;

public class DatabaseUserRepository implements IUserRepository {

    public User getUserByName(String name) {
        return new User("I am a user from database!");
    }
}
