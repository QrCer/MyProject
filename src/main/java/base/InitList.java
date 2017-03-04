package base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by QrCeric on 22/02/2017.
 */
public class InitList {

    //Use Arrays.asList()
    public static final List<String> list1 = Arrays.asList("零", "一", "二", "三", "四", "五", "六", "七", "八", "九");

    //Same as Above one.
    public static final List<String> list2 = Arrays.asList(new String[]{"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"});

    //Since 1.9 List.of Set.of Map.of
//    public static final List<String> list3 = List.of("零", "一", "二", "三", "四", "五", "六", "七", "八", "九");

    public static final List<String> list4 = new ArrayList<String>() {
        {
            add("零");
            add("零");
            add("一");
            add("二");
            add("三");
            add("四");
            add("五");
            add("六");
            add("七");
            add("八");
            add("九");
        }
    };

}
