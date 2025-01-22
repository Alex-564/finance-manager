package utils.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVParser implements FileReader {
    
    @Override
    public ArrayList<String> readFile(String fileName){
        ArrayList<String> fileData = new ArrayList<String>();

        //attempt to open passed file
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);

            //collect each line
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();

                if (data.isBlank()) break;
                fileData.add(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Does Not Exist!");
        }

        return fileData;
    }

    @Override
    public void getFileInfo(String fileName){
        File myObj = new File(fileName);

        if (myObj.exists()){
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("File Does Not Exist!");

        }
    }
    
}

