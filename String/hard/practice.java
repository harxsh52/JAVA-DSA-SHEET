package String.hard;
import java.util.*;
class practice {
    public static void main(String[] args) {
String text = "The quick 22 brown fox";
String newText = text.replace("\\d+", "cat");
String f=text.substring(0,7);
System.out.println(newText+" "+ f); // Output: The quick brown cat
    }
}