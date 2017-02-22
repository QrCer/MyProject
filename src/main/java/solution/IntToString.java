package solution;

import base.NumberToChinese;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by QrCeric on 21/02/2017.
 * 阿拉伯数字转为中文数字
 * 方法有点笨, 有空再优化吧
 */
public class IntToString {

    public static void main(String[] args) {
        intToString(1003);
    }

    public static final String intToString(int i) {

        List<String> list = new ArrayList<>(10);

        list.add(i >= 10000 ? getIntString(i / 10000) + "万" : "零");
        i = i % 10000;
        list.add(i >= 1000 ? getIntString(i / 1000) + "千" : "零");
        i = i % 1000;
        list.add(i >= 100 ? getIntString(i / 100) + "百" : "零");
        i = i % 100;
        list.add(i >= 10 ? getIntString(i / 10) + "十" : "零");
        i = i % 10;
        list.add(i >= 1 ? getIntString(i) : "零");

        boolean zeroAllowed = false;
        for (String string : list) {
            if (string.equals("零")) {
                if (zeroAllowed) {
                    System.out.print("零");
                    zeroAllowed = false;
                }
            } else {
                zeroAllowed = true;
                System.out.print(string);
            }
        }

        return null;
    }

    public static final String getIntString(int i) {
        return NumberToChinese.values()[i].getStringCN();
    }
}