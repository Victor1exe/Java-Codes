public class Sorting {

    public static void Bubblesort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
         for(int j=0;j<n-i-1;j++){
             if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
             }
         }
    }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    public static void Selectionsort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
           if(arr[smallest]>arr[j]){
                smallest=j;
           }
            }
           int temp=arr[smallest];
           arr[smallest]=arr[i];
           arr[i]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
}


    public static void Insertionsort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr={7,3,1,2,8};
        Insertionsort(arr,5);
}}
