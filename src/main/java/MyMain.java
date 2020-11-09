import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int oddnumber =  0;
        // REPLACE WITH YOUR CODE
        for (int i : list){
            if (i % 2 == 1 || i % 2 == -1){
                oddnumber += 1;
            }
        }
        return oddnumber;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        int list = 0;
        // REPLACE WITH YOUR CODE
            for(int i : list1) {
                for (int u : list2) {
                    if (i == u) {
                        list += 1;
                    }
                }
            }
        return list>0;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        // REPLACE WITH YOUR CODE
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            newlist.add(arr[i]);
        }
        return newlist;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
