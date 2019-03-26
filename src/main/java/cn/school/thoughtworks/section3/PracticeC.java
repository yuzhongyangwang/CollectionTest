package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> result= new HashMap<>();
        List<String> list = object.get("value");
        List<Mymap> mmlist = new ArrayList<>();
        Map<String, Integer> collection1 = new HashMap<>();
        for (int i = 0; i < collectionA.size(); i++) {
            if(collection1.containsKey(collectionA.get(i))){
                Integer num = collection1.get(collectionA.get(i));
                num++;
                collection1.replace(collectionA.get(i), num);
            }
            else{
                collection1.put(collectionA.get(i),1);
            }
        }
        Iterator<Map.Entry<String, Integer>> entries = collection1.entrySet().iterator();
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
                    int x = num/3;
                    num -= x;
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
