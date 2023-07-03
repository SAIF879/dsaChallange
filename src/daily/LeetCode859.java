package daily;

import java.util.ArrayList;
import java.util.HashSet;

//BUDDY STRING PROBLEM   QUESTION <1>
public class LeetCode859 {

    public static Boolean BuddyString(String s , String goal){
        //check if both strings are equal in length
        if (s.length() != goal.length()) return false;

        //if equals sort out duplicates
        if (s.equals(goal)){
            HashSet<Character> set = new HashSet<>();
            for (char ch : s.toCharArray()){
                if (set.contains(ch)) {return true;}
                set.add(ch);
            }

            return false;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i)!=goal.charAt(i)) list.add(i);
        }

        if (list.size()==2 && s.charAt(list.get(0))==goal.charAt(list.get(1)) && s.charAt(list.get(1))==goal.charAt(list.get(0))){
            return true;
        }

        return false;

    }
    public static void main(String[] args) {

        //Given two strings A and B of lowercase letters, return true if and
        // only if we can swap two letters in A so that the result equals B.


       String A = "aaaaaaabc", B = "aaaaaaacb";
        //Output: true
        System.out.println(BuddyString(A , B));;
    }
}
