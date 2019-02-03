package com.tomaszoboza.filemanager.Model;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Repository
public class FileToBlob {

    public byte[] convertFileToBlob(String filePath) throws IOException {

        // create file object
        File file = new File(filePath);
        // initialize a byte array of size of the file
        byte[] fileContent = new byte[(int) file.length()];
        FileInputStream inputStream = null;
        try {
            // create an input stream pointing to the file
            inputStream = new FileInputStream(file);
            // read the contents of file into byte array
            inputStream.read(fileContent);
        } catch (IOException e) {
            throw new IOException("Unable to convert file to byte array. " + e.getMessage());
        } finally {
            // close input stream
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return fileContent;
    }
}
