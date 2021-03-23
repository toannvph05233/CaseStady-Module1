import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String inputString = "abac";
        List<String> list = new ArrayList<>();
        char[] chars = inputString.toCharArray();

        for (int i = 1; i < chars.length; i++) {
            for (int j = 0; j <= chars.length - i; j++) {
                String str = "";
                for (int k = 0; k < i; k++) {
                    str += chars[k + j] + "";
                }
                list.add(str);
            }
        }
        for (String str : list) {
            System.out.println(str);
        }
    }

    public void bai1() {
        String[] inputArray = {"abc", "cbc", "aaa", "aba", "bab"};
        List<String> outputArray = new ArrayList<>();
        String result = "bbb";
        boolean check = true;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i; j < inputArray.length; j++) {
                for (int g = 0; g < inputArray[i].toCharArray().length; g++) {
                    char so1 = inputArray[i].toCharArray()[g];
                    char resl1 = result.charAt(g);
                    char so2 = inputArray[j].toCharArray()[g];

                    if (so1 != resl1) {
                        if (so2 != resl1) {
                            check = false;
                            break;
                        } else {
                            check = true;
                        }
                    }
                }
                if (check) {
                    outputArray.add(inputArray[i]);
                    outputArray.add(inputArray[j]);
                }
            }
        }
        for (String str : outputArray) {
            System.out.println(str);
        }
    }

    public void bai2() {
        int a = 12345;
        String str = String.valueOf(a);
        System.out.println(str);
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.println(((int) c - 48));
        }
    }
}

