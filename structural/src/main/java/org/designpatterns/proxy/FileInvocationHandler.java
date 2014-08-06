package org.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.security.AccessControlException;

public class FileInvocationHandler implements InvocationHandler {

    private IFile file;

    public FileInvocationHandler(IFile file) {
        this.file = file;
    }

    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("getContent")) {
            String path = (String) args[0];
            if (path.startsWith("/private")) {
                throw new AccessControlException(String.format("You are not allowed to access %s", path));
            }
        }
        return method.invoke(this.file, args);
    }
}
