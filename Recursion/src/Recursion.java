import java.util.*;
public class Recursion {

    // print numbers from nto 1
    /*public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
*/

    // Print numbers from 1 to n

  /*  public static void printn(int n){
       if(n==0){
           return;
       }
       printn(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        printn(n);
    }*/


    // Print sum of n natural numbers

  /*  public static int sumn(int n){
       if(n==0){
           return 0;
       }
       int prevsum=sumn(n-1);
       return n+prevsum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sumn(n));
    }*/


    // Print sum of n natural numbers

    /*public static int sumn(int n){
        if(n==1){
            return 1;
        }
        int prev=sumn(n-1);
        return n+prev;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sumn(n));
    }*/

    // Factorial of N
    /*public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact=factorial(n-1);
        return n*fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(factorial(n));
    }
*/


    // Print Fibonacci sequence till n

    /*public static int Fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        int fibo=Fibonacci(n-1)+Fibonacci(n-2);
        return fibo;
    }

    public static void main(String[] args){
        Scanner tito=new Scanner(System.in);
        int n= tito.nextInt();
        System.out.print(Fibonacci(n));
    }*/

    // Print x^n (Stack height = n)

   /* public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int res=power(x,n-1);
        return x*res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.print(power(x,n));
    }*/

    // Print x^n (stack height= log(n))

   /* public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return power(x,n/2) *power(x,n/2);
        }else{
            return power(x,n/2)*power(x,n/2)*x;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.print(power(x,n));
    }*/
}
