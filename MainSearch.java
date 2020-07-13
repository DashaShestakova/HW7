package HW7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static HW7.EasySearch.readAllBytesJava7;

public class MainSearch {
    public static void main(String[] args) {

        String filepath = "d:/Java/Война и мир.txt";
        EasySearch easySearch = new EasySearch();
        UniqueWords uniqueWords = new UniqueWords();
        Top10Words top10Words = new Top10Words();
        System.out.println(easySearch.search(readAllBytesJava7(filepath), "война"));
        System.out.println(easySearch.search(readAllBytesJava7(filepath), " и "));
        System.out.println(easySearch.search(readAllBytesJava7(filepath), " мир "));
        uniqueWords.countUnique(readAllBytesJava7(filepath));
        System.out.println(top10Words.searchTop10(readAllBytesJava7(filepath)));
    }

}
