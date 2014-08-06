package org.designpatterns.proxy;

public class FileImpl implements IFile {

    public String getContent(String path) {
        // This method would actually read a file's content
        return "Placeholder text...";
    }
}
