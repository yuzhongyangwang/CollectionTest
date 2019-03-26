package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < collection1.size(); i++) {
            String s = collection1.get(i);
            List<String> ls = collection2.get("value");
            if(ls.contains(s)){
                result.add(s);
            }
        }
        return result;
    }
}
