package HW7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxData <T> {
    public static void main(String[] args) {
    }
    T[]container;

    public BoxData(T[]container){
            this.container = container;
    }
    List<T> numlist = Arrays.asList(container);

    public void boxAdd (T data){
        numlist.add(data);
    }

    public void addToIndex (int index, T data){
        numlist.add(index, data);
    }

    String str;
    @Override
    public String toString() {
        for (T element : numlist){
            str += element.toString();
        }
        return str;
    }
}
