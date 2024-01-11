package Strings.Easy;

//https://leetcode.com/problems/count-items-matching-a-rule/description/

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingaRule1773_4 {
    public static void main(String[] args) {
        List<String> str1 = new ArrayList<>();
        str1.add("phone");
        str1.add("blue");
        str1.add("pixel");
        List<String> str2 = new ArrayList<>();
        str2.add("computer");
        str2.add("silver");
        str2.add("lenovo");
        List<String> str3 = new ArrayList<>();
        str3.add("phone");
        str3.add("gold");
        str3.add("iphone");

        List<List<String>> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        System.out.println(countMatches(list, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for(List l : items){
            if(ruleKey.equals("type")){
                if(l.get(0).equals(ruleValue)){
                    count++;
                }
            }

            if(ruleKey.equals("color")){
                if(l.get(1).equals(ruleValue)){
                    count++;
                }
            }

            if(ruleKey.equals("name")){
                if(l.get(2).equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }

    //OR

    public int countMatchesLoops(List<List<String>> items, String ruleKey, String ruleValue) {
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
