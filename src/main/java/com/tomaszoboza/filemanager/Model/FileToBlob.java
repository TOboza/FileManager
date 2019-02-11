package com.tomaszoboza.filemanager.Model;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Repository
public class FileToBlob {

    public byte[] convertFileToBlob(String filePath) throws IOException {

        File file = new File(filePath);
               byte[] fileContent = new byte[(int) file.length()];

               FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            inputStream.read(fileContent);
        } catch (IOException e) {
            throw new IOException("Unable to convert file to byte array. " + e.getMessage());
        } finally {
                if (inputStream != null) {
                inputStream.close();
            }
        }
        return fileContent;
    }
}
