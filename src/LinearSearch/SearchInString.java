package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Sameer";
        char target = 'm';
        System.out.println(search(name, target));
    }

    // linear search through a string if a character is present or not
    // return true if present and false if not
    static boolean search(String str, char target){
        //if string length is 0 or empty then return false
        if (str.length() == 0){
            return false;
        }

        // loop through every character in string and check if present then return true
        for (int i=0; i< str.length(); i++){
            // if found return true
            if (str.charAt(i) == target){
                return true;
            }
        }

        // if no character is found return false
        return false;
    }


    // same using for each loop
    static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch: str.toCharArray()) {
            if (ch  ==  target){
                return true;
            }
        }
        return false;
    }
}
