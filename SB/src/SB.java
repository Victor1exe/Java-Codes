import java.util.*;
public class SB {
    //Reverse a string
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orig = sc.next();
        String reverse = "";
        for (int i = orig.length()-1; i>=0; i--) {
                reverse=reverse+orig.charAt(i);
        }
        System.out.print(reverse);
    }*/

    public static void main(String[] args) {
        StringBuilder orig = new StringBuilder("hello");
        for (int i = 0; i<orig.length()/2; i++) {
            int front=i;
            int back=orig.length()-i-1;
            char frontch=orig.charAt(front);
            char backch=orig.charAt(back);

            orig.setCharAt(front,backch);
            orig.setCharAt(back,frontch);
        }
        System.out.print(orig);
    }
}

