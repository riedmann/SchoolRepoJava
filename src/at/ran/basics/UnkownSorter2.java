package at.ran.basics;

public class UnkownSorter2 {
    public static void main(String[] args) {
        int[] data = {4,1,2,9,3};
        int[] result = unknownSort(data);

        for (Integer value: result) {
            System.out.print(value + " - ");
        }
    }
    static int[] unknownSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
