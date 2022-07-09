package chap14;

import java.util.Arrays;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(1,2,3);
        for(int value : list2){
            System.out.println(value);
        }
    }
}
