package cn.school.thoughtworks.section2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {

        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            if(result.containsKey(collection1.get(i))){
                Integer num = result.get(collection1.get(i));
                num++;
                result.replace(collection1.get(i), num);
            }
            else{
                result.put(collection1.get(i),1);
            }
        }
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
           if(entry.getValue() == 1 && entry.getKey().contains("-")){
               String[] str = entry.getKey().split("-");
               result.remove(entry.getKey(),entry.getValue());
               result.put(str[0],Integer.valueOf(str[1]));
           }
        }
        return result;
    }

}
