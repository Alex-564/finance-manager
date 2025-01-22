package utils.fileReader;

//imports
import java.util.ArrayList;

public interface FileReader {

    public ArrayList<String> readFile(String fileName);
    public void getFileInfo(String fileName);
    
}
