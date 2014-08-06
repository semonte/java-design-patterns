package org.designpatterns.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.assertEquals;

public class FileInvocationTest {

    @Test
    public void thatPublicFolderIsAccessible() throws IllegalAccessException {
        IFile o = (IFile) Proxy.newProxyInstance(IFile.class.getClassLoader(),
                new Class<?>[]{IFile.class},
                new FileInvocationHandler(new FileImpl()));
        assertEquals("Placeholder text...", o.getContent("/public/file.txt"));
    }

    @Test(expected = java.security.AccessControlException.class)
    public void thatPrivateFolderIsNotAccessible() {
        IFile o = (IFile) Proxy.newProxyInstance(IFile.class.getClassLoader(),
                new Class<?>[]{IFile.class},
                new FileInvocationHandler(new FileImpl()));
        o.getContent("/private/file.txt");
    }
}
