package org.example;

public class hello {

    //program for sort array
    public static int[] solve(int arr[]){
        int N = arr.length;

        for ( int i = 0 ;i<N-1;i++ ){
            for (int j= i+1;j<N;j++){
                if (arr[i] > arr[i+1]) {
                    int temp= arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] solveDes(int arr[]){
        int N = arr.length;

        for ( int i = N-1 ;i>0;i-- ){
            for (int j= i-1;j>0;j--){
                if (arr[j] > arr[j-1]) {
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }



    public static void main(String[] args) {

        int arr[]={12,15,  6 ,7, 8, 9};

        int res[]= solve(arr);

        for (int i=0;i< res.length;i++){
            System.out.print(res[i]+"  ");
        }
        System.out.println();

        int resDes[]= solveDes(arr);
        for (int i=0;i<resDes.length;i++){
            System.out.print(resDes[i]+ "  ");
        }

    }
}
