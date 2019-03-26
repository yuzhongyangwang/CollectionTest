package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result= new HashMap<>();
        List<String> list = object.get("value");
        List<Mymap> mmlist = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> entries = collectionA.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            Mymap mm = new Mymap();
            mm.setK(entry.getKey());
            mm.setV(entry.getValue());
            mmlist.add(mm);
        }
        for(int i=0;i<list.size();i++){
            String str = list.get(i);
            for(int j=0;j<mmlist.size();j++){
                if(str.equals(mmlist.get(j).getK())){
                    int num = mmlist.get(j).getV();
                    num--;
                    mmlist.get(j).setV(num);
                }
            }
        }

        for(int k=0;k<mmlist.size();k++){
            result.put(mmlist.get(k).getK(),mmlist.get(k).getV());
        }
        return result;
    }
}
