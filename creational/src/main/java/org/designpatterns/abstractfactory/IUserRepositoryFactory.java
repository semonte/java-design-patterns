package org.designpatterns.abstractfactory;

public interface IUserRepositoryFactory {
    public IUserRepository create(RepositoryType repositoryType);
}
