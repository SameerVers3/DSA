package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {2,45,2,5,4,2,5,6,5,5,7,5};
        System.out.println("45 is at index: " + linearSearch(arr, 4));

    }



    // search in the array: return the index if item is found:
    // otherwise return -1
    static int linearSearch(int [] arr, int target){
        // if array is empty return -1
        if (arr.length == 0){
            return -1;
        }

        // run loop
        for (int i=0; i< arr.length; i++){
            // check for target at every index
            if (arr[i] == target){
                return i;
            }
        }

        // if no item is found then return -1
        return -1;
    }
}
