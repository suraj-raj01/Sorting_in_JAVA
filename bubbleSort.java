public class bubbleSort {
    public static void pritArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        System.out.print("Sorted array is: ");
        int arr[] = {7,9,4,2,5,3,8,1,6};
        //bubble sort
        //Time Complexity :- O(N*2)
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        pritArray(arr);
    }
}
