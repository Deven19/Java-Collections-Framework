package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem500 {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        List<String> out = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            Character c = 'd';
            Boolean isSameRow = true;
            for(int j = 0 ; j < words[i].length(); j++){
                //System.out.println(words[i].charAt(j));
                //System.out.println(s1.contains(String.valueOf(words[i].charAt(j))));
                if(c=='a' && !s1.contains(String.valueOf(words[i].toLowerCase().charAt(j)))){ isSameRow = false; break;}
                else if(c=='b' && !s2.contains(String.valueOf(words[i].toLowerCase().charAt(j)))){ isSameRow = false; break;}
                else if(c=='c' && !s3.contains(String.valueOf(words[i].toLowerCase().charAt(j)))){ isSameRow = false; break;}
                else if(s1.contains(String.valueOf(words[i].charAt(j)))){
                    c = 'a';
                }else if(s2.contains(String.valueOf(words[i].charAt(j)))){
                    c = 'b';
                }else if(s3.contains(String.valueOf(words[i].charAt(j)))){
                    c = 'c';
                }
            }
            if(isSameRow){
                out.add(words[i]);
            }
        }
        String[] array = new String[out.size()];
        out.toArray(array);
        return array;
    }


    public static void main(String[] args){
        Problem500 pb500 = new Problem500();
        String[] stAr = new String[]{"Aasdfghjkl","Qwertyuiop","zZxcvbnm"};
        System.out.println(Arrays.toString(pb500.findWords(stAr)));
    }
}
