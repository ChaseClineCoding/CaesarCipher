import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CaesarCipher {
    public static List<String> movingShift(String s, int shift) {
        List<String> result = new ArrayList<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ((Pattern.matches("[A-Za-z]", String.valueOf(arr[i])) && Character.toLowerCase(arr[i]) + shift <= 'z')) {
                arr[i] += shift;
            } else if (Pattern.matches("[A-Z]", String.valueOf(arr[i])) && arr[i] + shift > 'Z') {
                arr[i] = Character.toChars(((shift - ('Z' - arr[i])) % 26) + 'A')[0];
            } else if (Pattern.matches("[a-z]", String.valueOf(arr[i])) && arr[i] + shift > 'z') {
                arr[i] = Character.toChars(((shift - ('z' + 1 - arr[i])) % 26) + 'a')[0];
            }
            shift++;
        }
        int indexSplit = arr.length / 5;
        if (arr.length % 5 != 0) {
            indexSplit++;
        }
        int lastI1 = Math.min(indexSplit, arr.length);
        int lastI2 = Math.min(indexSplit*2, arr.length);
        int lastI3 = Math.min(indexSplit*3, arr.length);
        int lastI4 = Math.min(indexSplit*4, arr.length);
        result.add(0, String.valueOf(arr).substring(0, lastI1));
        result.add(1, String.valueOf(arr).substring(lastI1, lastI2));
        result.add(2, String.valueOf(arr).substring(lastI2, lastI3));
        result.add(3, String.valueOf(arr).substring(lastI3, lastI4));
        result.add(4, String.valueOf(arr).substring(lastI4));
        return result;
    }

//    public static String demovingShift(List<String> s, int shift) {
//    }
}
