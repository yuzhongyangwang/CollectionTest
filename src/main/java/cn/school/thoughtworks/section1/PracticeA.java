package cn.school.thoughtworks.section1;

import java.util.Arrays;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result = Arrays.asList();
        for(int i = 0;i < collection1.size();i++){
            String s = collection1.get(i);
            if(collection2.contains(s)){
                result.add(s);
            }
        }
        return result;
    }
}
