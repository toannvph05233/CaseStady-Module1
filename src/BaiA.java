import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BaiA {
    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String[] arr = line.split(" ");
        System.out.println(arr);
        int n1 = Integer.parseInt(arr[0]);
        int m1 = Integer.parseInt(arr[1]);
        int n2 = Integer.parseInt(arr[2]);
        int m2 = Integer.parseInt(arr[3]);

//        int[][] arr1 = new int[n1][m1];
//        int[][] arr2 = new int[n2][m2];
        int sum1 =0;
        int sum2 =0;


        if (n1 == n2 && m1 == m2) {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    System.out.println("nhập số cột " + i +"-" + j);
                    String input1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
//                    arr1[i][j] = Integer.parseInt(input1);
                    sum1 += Integer.parseInt(input1);
                    String input2 = new BufferedReader(new InputStreamReader(System.in)).readLine();
//                    arr1[i][j] = Integer.parseInt(input2);
                    sum2 += Integer.parseInt(input2);
                }
            }
            if (sum1 == sum2){
                System.out.println("oke");
            }
        } else {
            System.out.println("khong bang");
        }

    }
}
