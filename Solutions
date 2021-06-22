import java.util.*;
public class Solution {
    public static Boolean killSwitch(int[] input) {
        int length = input.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += input[i];
        }
        if (length == 2) {
            if (input[0] == input[1]) {
                return true;
            } else {
                return false;
            }
        }
        if (length > 1 && sum % 2 == 0) {
            ArrayList array = permute(input);
            return splitterMethod(length, array, sum);
        } else {
            return false;
        }
    }

    static ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        //start from an empty list
        result.add(new ArrayList<Integer>());

        for (int i = 0; i < num.length; i++) {
            //list of list in current iteration of the array num
            ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> l : result) {
                // # of locations to insert is largest index + 1
                for (int j = 0; j < l.size()+1; j++) {
                    // + add num[i] to different locations
                    l.add(j, num[i]);

                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
                    current.add(temp);

                    l.remove(j); // - remove num[i] add
                }
            }
            result = new ArrayList<ArrayList<Integer>>(current);
        }
        return result;
    }

    static Boolean splitterMethod(int length, ArrayList array, int sum) {
        for (Object i : array) {
            int half = sum / 2;
            String[] stringArray = i.toString().split(",");
            int[] newArray = new int[length];
            for (int j = 0; j < length; j++) {
                newArray[j] = Integer.parseInt(stringArray[j].replaceAll("[^0-9-]", ""));
            }
            for (int k = 0; k < length; k++) {
                if (half - newArray[k] >= 0) {
                    half -= newArray[k];
                    if (half == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
