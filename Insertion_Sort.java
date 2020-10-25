//Insertion sort

import java.util.*; //for Scanner
class Insertion_Sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sorting Program >>>");
        System.out.println("Enter Number of Items want to Soring : ");
        int n = sc.nextInt();
        int A[] = new int[n]; //create n lenght of Array
        //loop for getting Numbers from User
        for(int i = 0; i < n; i++){
            System.out.println("Enter " + (i+1) + " Number : ");
            A[i] = sc.nextInt();
        }

        for(int i = 1; i < A.length; i++){
            int key = A[i];

            int j = i - 1;
            while(j >= 0 && A[j] > key){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
        //Display after sorting
        System.out.println("\n After Sorting the Data >>>\n");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + "\t");
        }
    }
}