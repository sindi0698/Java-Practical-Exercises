package com.practicalexercises3.ex2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class IOFile {

    public static final String EMPTY_BUFFER_MESSSAGE = "The buffered reader is empty";
    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
    private String filePath;

    public IOFile(String filePath) {
        this.filePath = filePath;
    }

    public int countLines() {
        File newFile = new File(this.filePath);
        int linesOfFile = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(newFile))) {
            while (reader.readLine() != null) {
                linesOfFile++;
            }
        } catch (IOException e) {
            System.out.println(EMPTY_BUFFER_MESSSAGE);
        }
        logger.log(Level.INFO, "The lines of file read successfully!");
        return linesOfFile;
    }

    public void write(OutputStream os, String contentToWrite) throws FileNotFoundException {
        File newFile = new File(this.filePath);
        os = new FileOutputStream(newFile);
        try {
            os.write(contentToWrite.getBytes(StandardCharsets.UTF_8));
            logger.log(Level.WARNING, "This method updated the file with the new content entered by the user in the console!");
            os.close();
        } catch (IOException ex) {
            System.out.println(EMPTY_BUFFER_MESSSAGE);
        }
    }

    public void print() {
        File newFile = new File(this.filePath);
        try (Scanner reader = new Scanner(newFile)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            logger.log(Level.INFO, "The lines of file printed successfully in the console!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void copy(String fileName){
        File file = new File(this.filePath);
        File fileCopied = new File(fileName);
        try (FileInputStream fileInputStream = new FileInputStream(file); FileOutputStream fileOutputStream = new FileOutputStream(fileCopied)) {
            int line;
            while ((line = fileInputStream.read()) != -1) {
                fileOutputStream.write(line);
            }
            logger.log(Level.INFO, "File copied successfully!");
        } catch (IOException e) {
            System.out.println(EMPTY_BUFFER_MESSSAGE);
        }
    }

    public void delete() {
        File file = new File(this.filePath);
        try {
            if (file.delete()) {
                logger.log(Level.CONFIG, "File fileToDelete.txt is deleted, please recreate it to check delete() method!");
                System.out.println("File deleted successfully");
            } else throw new FileNotFoundException("File can not be deleted as it does not exist.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}