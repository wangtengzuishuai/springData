package com.text;

import java.util.*;

public class text {

    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put("id",1);
        map1.put("text","网络");

        Map map2 = new HashMap();
        map2.put("id",2);
        map2.put("text","规格");

        Set set = map1.keySet();
        System.out.println(set);
      /*  for (Object o : set) {
            Object o1 = map1.get(o);
            System.out.println(o1);
        }*/

        List<Map> list = new ArrayList();
        list.add(map1);
        list.add(map2);


        System.out.println(list.get(0).get("id"));

    }
}
