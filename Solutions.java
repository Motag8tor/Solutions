import java.util.*;
public class Solution {
    public static Boolean killSwitch(int[] input) {
        int length = input.length;
        if (length == 2) { // Catch lengths of 2
            if (input[0] == input[1]) {
                return true;
            } else {
                return false;
            }
        } else if (length > 1) { // Catch lengths less than 1
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += input[i];
            }
            if (sum % 2 == 0) { // Catch numbers that cannot be divided equally by 2
                ArrayList<Integer> sortedArray = new ArrayList<Integer>();
                for (int i = 0; i < length; i++) {
                    sortedArray.add(input[i]);
                }
                Collections.sort(sortedArray, Collections.reverseOrder());
                if (splitterMethod(length, sortedArray, sum)) {
                    return true;
                }
                HashSet array = permute(input);
                for (Object i : array) {
                    String[] stringArray = i.toString().replaceAll("[^0-9,-]", "").split(",");
                    ArrayList<Integer> tempArray = new ArrayList<Integer>();
                    for (int j = 0; j < length; j++) {
                        tempArray.add(Integer.parseInt(stringArray[j]));
                    }
                    if (splitterMethod(length, tempArray, sum)) { 
                        return true;
                    }
                }
                return false;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static HashSet<ArrayList<Integer>> permute(int[] num) {
        HashSet<ArrayList<Integer>> result = new HashSet<ArrayList<Integer>>();

        result.add(new ArrayList<Integer>()); //start from an empty list
        for (int i = 0; i < num.length; i++) {
            //list of list in current iteration of the array num
            ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> l : result) {
                for (int j = 0; j < l.size()+1; j++) { // # of locations to insert is largest index + 1
                    l.add(j, num[i]); // + add num[i] to different locations

                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
                    current.add(temp);

                    l.remove(j); // - remove num[i] add
                }
            }
            result = new HashSet<ArrayList<Integer>>(current);
        }
        return result;
    }

    static Boolean splitterMethod(int length, ArrayList<Integer> array, int sum) {
        int half = sum / 2;
        for (int k = 0; k < length; k++) {
            if (half - array.get(k) >= 0) {
                half -= array.get(k);
                if (half == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
