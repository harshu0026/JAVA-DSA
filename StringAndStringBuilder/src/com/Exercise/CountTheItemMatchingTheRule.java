package com.Exercise;

import java.util.ArrayList;
import java.util.List;

public class CountTheItemMatchingTheRule {
    public static void main(String[] args) {
        ArrayList<List<String>> list = new ArrayList<>();
        String[] a = {"phone","blue","pixel","computer","silver","lenovo","phone","gold","iphone"};

        for (int i =0; i< 3; i++){
            list.add(new ArrayList<>());
        }
        for (int i =0;i< 3; i++){
            for (int j = 0; j<3; j++){
                list.get(i).add(a[i]);
            }
        }
        System.out.println(list);
        String ruleKey = "color";
        String ruleValue = "blue";
        int ans = countMatches(list, ruleKey, ruleValue);
        System.out.println(ans);
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j;
        String type="type";
        String color="color";
        String name="name";
        int count=0;

        if(ruleKey.equals(type))
        {
            for(j=0;j<items.size();j++)
            {
                if(items.get(j).get(0).equals(ruleValue))
                    count++;
            }
        }
        else if(ruleKey.equals(color))
        {
            for(j=0;j<items.size();j++)
            {
                if(items.get(j).get(1).equals(ruleValue))
                    count++;
            }
        }
        else if(ruleKey.equals(name))
        {
            for(j=0;j<items.size();j++)
            {
                if(items.get(j).get(2).equals(ruleValue))
                    count++;
            }
        }

        return count;
    }
}
