package Test;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ArrayListTest implements Serializable {

    public static void main(String[] args)  {
/*        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>(list1);
        list2.add(4);

        System.out.println("list1:" + JSON.toJSONString(list1));
        System.out.println("list2:" + JSON.toJSONString(list2));

 */
        /*
        ArrayList<Map<String, String >> list1 = new ArrayList<>();
        Map<String, String > map = new HashMap<>();
        map.put("a","b");
        list1.add(map);

        System.out.println("1:" + list1);
        Object clone = list1.clone();
        Object[] objects = list1.toArray();
        System.out.println("objects:" + objects);
        System.out.println("clone:" + clone);

        map.put("a1","b1");

        System.out.println("11:" + list1);

        System.out.println("clone1:" + clone);
        Object[] objects1 = list1.toArray();
        System.out.println("objects12:" + objects1);
        System.out.println("objects1:" + objects);
*/



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        Integer[] a = new Integer[]{5,6,7,8,9,0};
        Integer[] a1 = list1.toArray(a);


        System.out.println(JSON.toJSONString(a));
        System.out.println(JSON.toJSONString(a1));



        Integer[] b = new Integer[]{5};
        Integer[] b1 = list1.toArray(b);

        System.out.println(JSON.toJSONString(b));

        System.out.println(JSON.toJSONString(b1));

        list1.ele

    }





}
