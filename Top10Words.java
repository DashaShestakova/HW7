package HW7;

import java.util.*;

public class Top10Words {
    public List searchTop10 (String content){
        String [] words = content.split("\\s+");
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            if (h.containsKey(words[i])) {
                h.replace(words[i], h.get(words[i]) + 1);
            } else {
                h.put(words[i], 1);
            }
        }

        ValueComparator bvc =  new ValueComparator(h);
        TreeMap<String,Integer> sorted_map = new TreeMap<String,Integer>(bvc);
        sorted_map.putAll(h);

        List<Map.Entry<String,Integer>> results = new ArrayList<>(sorted_map.entrySet());

        return results.subList(0, 10);

    }
}


class ValueComparator implements Comparator<String> {

    Map<String, Integer> base;
    public ValueComparator(Map<String, Integer> base) {

        this.base = base;
    }

    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }
}

