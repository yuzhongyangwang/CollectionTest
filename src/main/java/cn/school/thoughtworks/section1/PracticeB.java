package cn.school.thoughtworks.section1;

import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = null;
        for (int i = 0; i < collection1.size(); i++) {
            String s = collection1.get(i);
            for (int j = 0; j < collection2.size(); j++) {
                if (collection2.get(j).contains(s)) {
                    result.add(s);
                }
            }
        }
        return result;
    }
}
