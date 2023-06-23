package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int [] arr = {5,7,23,5,2,8,4,-7,31,83,-4};
        System.out.println(min(arr));
    }


    // assume array length != 0
    static int min(int [] arr){
        // set minimum to first index
        int min = arr[0];
        // loop through whole array
        for (int i=0; i<arr.length; i++){
            // if array[i] is less than the minimum then new minimum is arr[i]
            if (arr[i] < min){
                min = arr[i];
            }
        }
        // return the minimum number found
        return min;
    }
}
