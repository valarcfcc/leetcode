package utils;

import java.util.Map;

/**
 * @Auther: valarcfcc
 * @Date: 2020/8/4 23:01
 * @Description:
 */
public class Utils {
    public static void show(char[] a) {
        for (char e : a) {
            System.out.print(e + " ");
        }
    }
    public static void show(int[] a) {
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
    public static void mapOut(Map<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }

}
