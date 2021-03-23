package Thi_JSCB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaiC {
    public static void main(String[] args) throws IOException {
        String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int n = Integer.parseInt(in.split(" ")[0]);
        int m = Integer.parseInt(in.split(" ")[1]);
        int[][] arr = new int[n][m];
        if (0 < n && m <= 1024) {
            for (int i = 0; i < n; i++) {
                String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(input.split(" ")[j]);
                }
            }
            int[] arr2 = new int[255];
            List<Integer> list = new ArrayList<>();
            list.add(arr[0][0]);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!check(list, arr[i][j])) {
                        list.add(arr[i][j]);
                    }
                }
            }

            int[] arrCout = cout(list, arr, n, m);

            for (int i = 0; i < 255; i++) {
                arr2[i] = 0;
            }
            for (int i = 0; i < list.size(); i++) {
                arr2[list.get(i)] = arrCout[i];
            }

            for (int i = 0; i < arr2.length; i++) {
                if (i % 23 == 0) {
                    System.out.println();
                }
                System.out.print(arr2[i] + " ");
            }

        }

    }

    public static boolean check(List<Integer> list, int n) {
        boolean check = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                check = true;
            } else {
                check = false;
            }
        }
        return check;
    }

    public static int[] cout(List<Integer> list, int[][] arr, int n, int m) {
        int[] arrCount = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int g = 0; g < m; g++) {
                    if (arr[j][g] == list.get(i)) {
                        count++;
                    }
                }
            }
            arrCount[i] = count;
        }
        return arrCount;
    }
}
