package HW7;

import java.util.*;

public class UniqueWords {
    public HashSet<String> countUnique(String content){
        HashSet <String> hashSet = new HashSet<>();
        String [] words = content.split(" ");
        for(int i = 0; i < words.length; i++){
            hashSet.add(words[i]);
        }
        return hashSet;
    }
}
