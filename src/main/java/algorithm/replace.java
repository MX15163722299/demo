package algorithm;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.applet.Main;

import java.util.Scanner;

public class replace {

    public static String Train(String p) {
        String A = "HI";
        return A + p;
    }

    public static String replaceSpace(StringBuffer str) {

        int length = str.length();
        // System.out.println("length=" + length);
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char b = str.charAt(i);
            if (String.valueOf(b).equals(" ")) {
                result.append("%20");
            } else {
                result.append(b);
            }
        }
        return result.toString();

    }

    public static String replaceSpace2(String str) {

        return str.toString().replaceAll("\\s", "%20");

    }


    public static void main(String[] args) {
//        System.out.println(Train("Hellow world"));
        String p = "你好 你好 NIHAO";
//
//        System.out.println(replaceSpace(p));
        System.out.println(replaceSpace2(p));


    }
}






