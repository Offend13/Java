package regex;

import java.util.ArrayList;

public class Regex {
    public static void main(String[] args) {
        String s = "public static void main(String[] args) {";
        for (String word : s.split("\\W+")){
            System.out.println(word);
        }
    }
}
