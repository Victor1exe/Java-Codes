import java.util.*;
public class bitsmanp {

    public static int Binarytodecimal(int n){
        int ans =0;int x=1;
        while(n>0){
            int lastdig=n%10;
            n=n/10;
            ans= ans+(lastdig*x);
            x*=2;
        }
        return  ans;
    }

    public static int Decimaltobinary(int n){
        int ans =0;int x=1;
        while(x<=n){
            x=x*2;
        }
        x=x/2;
        while(n>0){
            int lastDig = n/x;
            n-=lastDig*x;
            ans=ans*10+lastDig;
            x/=2;
        }
        return  ans;
    }

    public static  void main(String[] args){
       /* // Get Bit
        int n=5;
       // int pos=2;
        int pos=3;
        int bitmask=1<<pos;
        if((bitmask&n)==0){
            System.out.print("Bit was zero");
        }
        else{
            System.out.print("Bit was one");
        }*/

       /* //Set Bit

        int n=5;
        int pos=1;
        int bitmask=1<<pos;
        System.out.print((n|bitmask));
*/

        /*// Clear Bit
        int n=5;
        int pos=2;
        int bitmask=1<<pos;

        int notbM = ~(bitmask);
        System.out.print((notbM&n));*/

        /*// Update Bit
        int n=5;
        int pos=2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter to 1 or 0");
        int i=sc.nextInt();
        if(i==1){
            int bitmask=1<<pos;
            System.out.print((n|bitmask));
        }else{
            int bitmask=1<<pos;
            int notbM = ~(bitmask);
            System.out.print((notbM&n));
        }*/

       /* //toggle a bit :: use the XOR operator
        Scanner sc= new Scanner(System.in);
        int n=5;
        int pos= sc.nextInt();
        int bitmask=1<<pos;
        System.out.print((bitmask^n));*/

       /* //Program to count no of 1's in Binary Number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int quot=1; int rem=0;
        int count=0;
        while(quot!=0){
            rem=n%2;
            quot=(n-rem)/2;
            n=n/2;
            if(rem==1){
                count++;
            }
        }
        System.out.print(count);*/

        //Convert Binary to Decimal
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans= Binarytodecimal(n);
        System.out.print(ans);*/

        //Convert Decimal to Binary
     /*   Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans= Decimaltobinary(n);
        System.out.print(ans);*/
        
}
}
