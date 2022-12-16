import javafx.util.Pair;

public class Solution {
    public static Pair < Integer, Integer > swap(Pair < Integer, Integer > swapValues) {
        // Write your code here.
        int firstVal = swapValues.getKey();
        int secondVal = swapValues.getValue();

        Pair<Integer, Integer> pairSwap = new Pair<>(secondVal, firstVal);


        return pairSwap;
    }
}
