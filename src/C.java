import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] size = new int[4];
        int[][] pos;
        int count = 0;
        for (int i = 0; i < 4; ++i) {
            size[i] = (sc.nextInt());
        }
        int[][] result = new int[size[0] - 2][size[1] - 2];
        int[][] matric = new int[size[0]][size[1]];
        int[][] demo = new int[size[2]][size[3]];
        for (int row = 0; row < size[0]; ++row) {
            for (int col = 0; col < size[1]; ++col) {
                matric[row][col] = (sc.nextInt());
            }
        }
        for (int row = 0; row < size[2]; ++row) {
            for (int col = 0; col < size[3]; ++col) {
                demo[row][col] = (sc.nextInt());
                if (demo[row][col] == 1) {
                    count += 1;
                }
            }
        }

        pos = new int[count][2];
        int c = 0;
        for (int row = 0; row < size[2]; ++row) {
            for (int col = 0; col < size[3]; ++col) {
                if (demo[row][col] == 1) {
                    pos[c][0] = row;
                    pos[c][1] = col;
                    c += 1;

                }
            }
        }
        int[][] temp = new int[3][3];
        for (int crow = 0; crow < size[0] - 2; ++crow) {
            for (int ccol = 0; ccol < size[1] - 2; ++ccol) {
                for (int row = crow; row < crow + 3; ++row) {
                    for (int col = ccol; col < ccol + 3; ++col) {
                        for (int l = 0; l < count; ++l) {
                            if (pos[l][0] == row - crow && pos[l][1] == col - ccol) {
                                result[crow][ccol] += matric[row][col];
                            }
                        }
                    }
                }
            }
        }
        for (int row = 0; row < size[0] - 2; ++row) {
            for (int col = 0; col < size[1] - 2; ++col) {
                String tmp = (col<size[1]-3)?result[row][col] + " ":result[row][col]+"" ;
                System.out.print(tmp);
            }
            System.out.println();
        }
    }
}
