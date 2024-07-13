import java.util.*;
public class Recursion {

    // Tower of Hanoi

  /*  public static void hanoi(int n,char src,char dest, char helper){
        if(n==0){
            return;
        }
        hanoi(n-1,src,helper,dest);
        System.out.println("Move disk from "+src+" to "+dest);
        hanoi(n-1,helper,dest,src);
    }
    public static void main(String[] args){
        hanoi(3,'A','C','B');
    }*/

    // Print a string in reverse

   /* public static void reverse(String s){
        if(s.length()==0){
            return;
        }
        reverse(s.substring(1));
        System.out.print(s.charAt(0));
    }

    public static void main(String[] args){
        String s="bhenkilodi";
        reverse(s);
    }*/

    // Find the first and last occurrence of an element in a string

    /*public static int first=-1;
    public static int last=-1;
    public static void occur(String s, int idx,char val){
        if(idx==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
       char curr=s.charAt(idx);
        if(val == curr){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        occur(s,idx+1,val);
    }
    public static void main(String[] args){
     String s="abaacdaefaah";
     occur(s,0,'a');
    }*/

    // Check if an array is sorted or not

   /* public static boolean sort(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr.length==1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return sort(arr,idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int arr[]={1,4,3,4,5,6};
        System.out.print(sort(arr,0));
    }*/

    // Move all the x to the end of the string

    public static String movex(String s){
        if(s.length()==0){
            return "";
        }
        char ch=s.charAt(0);
        String ros=movex(s.substring(1));
        if(ch=='x'){
            return ros+ch;
        }else{
            return ch+ros;
        }
    }
    public static void main(String[] args){
        String s="axbcxxd";
        System.out.println(movex(s));
    }

}
