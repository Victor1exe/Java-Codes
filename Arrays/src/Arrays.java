import java.util.*;

public class Arrays {

    public static void main(String[] args){

        // Spiral order print
    /*
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
       int m=sc.nextInt();
        System.out.print("Enter the number of columns:");
       int n=sc.nextInt();
       int arr[][]=new int[m][n];
        System.out.print("Enter the values in array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int row_start=0;int row_end=m-1;
        int col_start=0;int col_end=n-1;
        System.out.print("The Spiral order is:");
        while(row_start<=row_end && col_start<=col_end){
        for(int i=col_start;i<=col_end;i++){
            System.out.print(arr[row_start][i]+" ");
        }
        row_start++;
        for(int j=row_start;j<=row_end;j++){
            System.out.print(arr[j][col_end]+" ");
        }
        col_end--;
        for(int i=col_end;i>=col_start;i--){
            System.out.print(arr[row_end][i]+" ");
        }
        row_end--;
        for(int j=row_end;j>=row_start;j--) {
            System.out.print(arr[j][col_start]+" ");
        }
        col_start++;
        }*/

    //Transpose of a matrix

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int m=sc.nextInt();
        System.out.print("Enter the number of columns:");
        int n=sc.nextInt();
        int a[][]= new int[m][n];
        System.out.print("Enter the elements:");
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        System.out.println("The transpose is: ");
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
