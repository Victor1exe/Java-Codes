import java.util.*;

public class Functions {

    /*public static void printMyName(String name){
        System.out.println(name);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        printMyName(name);
    }
}*/

   /* public static void sum(int a,int b){
    int sum=a+b;
        System.out.println("The sum is:"+sum);}

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        sum(a,b);
    }*/

    //factorial of a number

   /* public static void factorial(int a){
        int ans=1;
        if(a<0){
            System.out.print("Invalid Number");
        }else{
            for(int i=a;i>0;i--){
                ans=ans*i;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        factorial(n);
    }
*/


   /*public static void prime(int n){
        if(n % 2 ==0 || n %3 ==0|| n%5 == 0 ||n%7==0){
            System.out.print("Number is not prime");
        }
        else{
            System.out.print("Number is prime");
        }
    }

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
       int n=sc.nextInt();
       prime(n);
    }*/

    /*public static void even(int n){
        if(n % 2 ==0){
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number is odd");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        even(n);

}*/

    /*public static void table(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        table(n);
    }*/
/*
    //average of three numbers
    public static void average(int n,int m,int o){
        int avg=(n+m+o)/3;
        System.out.println("The average of three numbers is:"+avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the number:");
        int m = sc.nextInt();
        System.out.println("Enter the number:");
        int o = sc.nextInt();
        average(n, m, o);
    }
*/

    /*public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of times you want to enter the numbers:");
        int n=sc.nextInt();
        int p;
        int pos=0,neg=0,zero=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter the number");
            p=sc.nextInt();
            if(p>0){
                pos++;
            }
            else if(p<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.print("Postive numbers: "+pos+" Negative numbers: "+neg+" Zeros: "+zero);
    }*/

    /*public  static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        System.out.println("Enter the power");
        int n=sc.nextInt();
        int res=1;
        for(int i=0;i<n;i++){
            res=res*x;
        }
        System.out.println("The ans is "+res);
    }*/

  //Fibonacci series
   /* public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int num=0; int prev1=1; int prev2=0;
        System.out.println("The fibonacci series :");
        System.out.print(prev2+" "+prev1+" ");
        for(int i=2;i<n;i++){
            num=prev1+prev2;
            System.out.print(num+" ");
            prev2=prev1;
            prev1=num;
        }
    }*/

    //Gcd of two numbers

   /* public static void gcd(int a, int b){
        int ans=1; int currans;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                currans=i;
                if(currans>ans){
                    ans=currans;
                }
            }
        }
        System.out.println("The gcd is: "+ans);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int a= sc.nextInt();
        System.out.println("Enter the number 2: ");
        int b= sc.nextInt();
        gcd(a,b);
    }*/
}


