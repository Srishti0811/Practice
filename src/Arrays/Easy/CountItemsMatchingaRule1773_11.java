package Arrays.Easy;
//https://leetcode.com/problems/count-items-matching-a-rule/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingaRule1773_11 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> str = new ArrayList<>(Arrays.asList("phone", "blue", "pixel"));
        List<String> str1 = new ArrayList<>(Arrays.asList("computer","silver","lenovo"));
        List<String> str2 = new ArrayList<>(Arrays.asList("phone","gold","iphone"));
        items.add(str);
        items.add(str1);
        items.add(str2);
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;

        //type
        if(ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if(items.get(i).get(0).equals(ruleValue)){
                            count++;
                }
            }
        }

        //color
        if(ruleKey.equals("color")) {
             for (int i = 0; i < items.size(); i++) {
                if(items.get(i).get(1).equals(ruleValue)){
                    count++;
                }
             }
        }

        //name
        if(ruleKey.equals("name")) {
            for (int i = 0; i < items.size(); i++) {
                 if(items.get(i).get(2).equals(ruleValue)){
                     count++;
                 }
            }
        }
        return count;
    }
}
