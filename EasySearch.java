package HW7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EasySearch implements ISearchEngine {
    @Override
    public int search(String content, String word) {
        int indFirst = 0;
        int indNext = 0;
        int counter = 0;
        while ((indFirst = content.indexOf(word, indNext)) != -1) {
            counter++;
            indNext = indFirst + 1;
        }
        return counter;
    }

    public static String readAllBytesJava7(String filePath)
    {
        String content = "";

        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }

}
