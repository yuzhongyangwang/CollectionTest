package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {

        Map<String, Integer> result = new HashMap<>();
        Map<String, Integer> result2 = new HashMap<>();
        //Map<String, Integer> result3 = new HashMap<>();
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

        Iterator<Map.Entry<String, Integer>> its = result.entrySet().iterator();
        while (its.hasNext()) {
            Map.Entry<String, Integer> entry = its.next();
            result2.put(entry.getKey(),entry.getValue());
        }
        Iterator<Map.Entry<String, Integer>> entries = result.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if(entry.getKey().length() > 1 && entry.getKey().length() < 5 ){
                result2.remove(entry.getKey());
                if(result2.containsKey(String.valueOf(entry.getKey().charAt(0)))){
                    int num = result2.get(String.valueOf(entry.getKey().charAt(0)));
                    num += Integer.valueOf(entry.getKey().charAt(2))-'0';
                    result2.replace(String.valueOf(entry.getKey().charAt(0)),num);

                }else{
                    result2.put(String.valueOf(entry.getKey().charAt(0)),Integer.valueOf(entry.getKey().charAt(2))-'0');
                }
            }
            if(entry.getKey().length() >= 5 && entry.getKey().contains("[")){
                result2.remove(entry.getKey());
                if(result2.containsKey(String.valueOf(entry.getKey().charAt(0)))){
                    int num = result2.get(String.valueOf(entry.getKey().charAt(0)));
                    num += Integer.valueOf(entry.getKey().substring(2,4));
                    result2.replace(String.valueOf(entry.getKey().charAt(0)),num);

                }else{
                    result2.put(String.valueOf(entry.getKey().charAt(0)),Integer.valueOf(entry.getKey().substring(2,4)));
                }
            }
        }
        return result2;
    }
}
