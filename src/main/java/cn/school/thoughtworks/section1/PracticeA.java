package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeA {
    static List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result = new ArrayList<>();
        for(int i = 0;i < collection1.size();i++){
            String s = collection1.get(i);
            if(collection2.contains(s)){
                result.add(s);
            }
        }
        return result;
    }
}
