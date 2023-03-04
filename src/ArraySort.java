public class ArraySort {
    public static void main (String args[]){
        int[] arr = {44,23,5,81,15,92,32,82,61,37,5,6,44,15,24};
        int[] sortedArr = new int[15];
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i=0; i<arr.length;i++)
            System.out.println(" " + arr[i]);

    }

}
