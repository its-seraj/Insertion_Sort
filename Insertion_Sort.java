//Insertion sort
//Using Figure 2.2 as a model, illustrate the operation of INSERTION-SORT on the
//array A = {31; 41; 59; 26; 41; 58}.

class Insertion_Sort{
    public static void main(String[] args){
        int[] A = {31, 41, 59, 26, 41, 58};

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
        for(int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
    }
}