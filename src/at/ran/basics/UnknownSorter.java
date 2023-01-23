package at.ran.basics;

public class UnknownSorter {

    public static void main(String[] args) {
        int[] data = {4,1,2,9,3};
        int[] result = unkwnownSort(data);

        for (Integer value: result) {
            System.out.print(value + " - ");
        }
    }
    public static int[] unkwnownSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}
