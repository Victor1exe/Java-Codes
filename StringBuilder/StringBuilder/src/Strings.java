import java.util.*;
public class Strings {
    //Reverse of a string:
    public static void main(String[] args) {
        StringBuilder orig = new StringBuilder("hello");
        for (int i = 0; i<orig.length()/2; i++) {
            int front=i;
            int back=orig.length()-1-i;
            char frontch=orig.charAt(front);
            char backch=orig.charAt(back);

            orig.setCharAt(front,backch);
            orig.setCharAt(back,frontch);
        }
        System.out.print(orig);
    }
}
