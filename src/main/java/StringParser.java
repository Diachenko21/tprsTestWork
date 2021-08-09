import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringParser {


    public void StringParser(String[] input) {
        Map<String, ArrayList<Integer>> output = new HashMap<>();
        for (String f : input) {
            int i = 0;
            ArrayList<Integer> counter = new ArrayList<>();
            while (i < input.length) {
                if (StringSorter(f).equals(StringSorter(input[i]))) {
                    counter.add(i);
                }
                i = i + 1;
            }
            if (counter.size()>1) {
                output.put(StringSorter(f),counter);
            }
        }
        System.out.println(output);
    }

    public String StringSorter(String a) {
        char[] aChar = a.toCharArray();
        Arrays.sort(aChar);
        return String.valueOf(aChar);
    }
}
