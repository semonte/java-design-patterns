package org.designpatterns.abstractfactory;

public class UserService {

    private IUserRepositoryFactory userRepositoryFactory;

    public UserService(IUserRepositoryFactory userRepositoryFactory) {
        this.userRepositoryFactory = userRepositoryFactory;
    }

    public User getUserByName(RepositoryType repositoryType, String name) {
        return this.userRepositoryFactory.create(repositoryType).getUserByName(name);
    }
}
