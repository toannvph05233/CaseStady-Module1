//import java.util.Scanner;
//
//public class BaiK {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String in = sc.nextLine();
//        int n = Integer.parseInt(in.split(" ")[0]);
//        int m = Integer.parseInt(in.split(" ")[1]);
//        int cout = 0;
//        try {
//            if (1 <= m && m < n && n <= (4 * 10 ^ 5)) {
//                String[] arr1 = new String[n];
//                String[] arr2 = new String[m];
//
//                for (int i = 0; i < n; i++) {
////                    System.out.println("Nhập hướng đi bước bản đồ 2 lần " + (i + 1));
//                    String input = sc.nextLine();
//                    String huong = input.split(" ")[0];
//                    if (huong.equals("?")) {
//                        arr1[i] = huong;
//                    } else {
//                        int buoc = Integer.parseInt(input.split(" ")[1]);
//                        if (huong.equals("s") || huong.equals("n") || huong.equals("e") || huong.equals("w") || huong.equals("?")) {
//                        } else {
//                            throw new Exception();
//                        }
////                        if (huong.equals("s")) {
//                            if (buoc >= 1 && buoc <= 7) {
//                                arr1[i] = huong + buoc;
//                            } else {
//                                throw new Exception();
//                            }
////                        } else {
////                            arr1[i] = huong + buoc;
////                        }
//                    }
//
//                }
//
//                for (int i = 0; i < m; i++) {
////                    System.out.println("Nhập hướng đi bước bản đồ 2 lần " + (i + 1));
//                    String input = sc.nextLine();
//                    String huong = input.split(" ")[0];
//                    if (huong.equals("?")) {
//                        arr2[i] = huong;
//                    } else {
//                        int buoc = Integer.parseInt(input.split(" ")[1]);
//                        if (huong.equals("s") || huong.equals("n") || huong.equals("e") || huong.equals("w") || huong.equals("?")) {
//                        } else {
//                            throw new Exception();
//                        }
////                        if (huong.equals("s")) {
//                            if (buoc >= 1 && buoc <= 7) {
//                                arr2[i] = huong + buoc;
//                            } else {
//                                throw new Exception();
//                            }
////                        } else {
////                            arr2[i] = huong + buoc;
////                        }
//                    }
//
//                }
//
//
////                for (String s : arr1) {
////                    System.out.print(s + "- ");
////                }
////                System.out.println("--------------");
////                for (String s : arr2) {
////                    System.out.print(s + "- ");
////                }
//
//                boolean check = true;
//                for (int i = 0; i < n; i++) {
//                    if (n - i >= m) {
//                        int index = 0;
//                        if (arr2[index].equals(arr1[i]) || arr2[index].equals("?") || arr1[i].equals("?")) {
//                            for (int j = i + 1; j < arr1.length; j++) {
//                                if (index == arr2.length - 1) {
//                                    break;
//                                } else {
//                                    index = index + 1;
//                                }
//                                if (arr2[index].equals(arr1[j]) || arr2[index].equals("?") || arr1[j].equals("?")) {
//                                    check = true;
//                                } else {
//                                    check = false;
//                                    break;
//                                }
//                            }
//                            if (check) {
//                                cout++;
//                            }
//                        }
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(cout);
//        }
//        System.out.println(cout);
//    }
//
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BaiK {
    public static void main(String[] args) throws IOException {

        String in =  new BufferedReader(new InputStreamReader(System.in)).readLine();
        int n = Integer.parseInt(in.split(" ")[0]);
        int m = Integer.parseInt(in.split(" ")[1]);
        int cout = 0;
        try {
            if (1 <= m && m < n && n <= (4 * 10 ^ 5)) {
                String[] arr1 = new String[n];
                String[] arr2 = new String[m];

                for (int i = 0; i < n; i++) {
//                    System.out.println("Nhập hướng đi bước bản đồ 2 lần " + (i + 1));
                    String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    String huong = input.split(" ")[0];
                    if (huong.equals("?")) {
                        arr1[i] = huong;
                    } else {
                        int buoc = Integer.parseInt(input.split(" ")[1]);
                        if (huong.equals("s") || huong.equals("n") || huong.equals("e") || huong.equals("w") || huong.equals("?")) {
                        } else {
                            throw new Exception();
                        }
//                        if (huong.equals("s")) {
                        if (buoc >= 1 && buoc <= 7) {
                            arr1[i] = huong + buoc;
                        } else {
                            throw new Exception();
                        }
//                        } else {
//                            arr1[i] = huong + buoc;
//                        }
                    }

                }

                for (int i = 0; i < m; i++) {
//                    System.out.println("Nhập hướng đi bước bản đồ 2 lần " + (i + 1));
                    String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    String huong = input.split(" ")[0];
                    if (huong.equals("?")) {
                        arr2[i] = huong;
                    } else {
                        int buoc = Integer.parseInt(input.split(" ")[1]);
                        if (huong.equals("s") || huong.equals("n") || huong.equals("e") || huong.equals("w") || huong.equals("?")) {
                        } else {
                            throw new Exception();
                        }
//                        if (huong.equals("s")) {
                        if (buoc >= 1 && buoc <= 7) {
                            arr2[i] = huong + buoc;
                        } else {
                            throw new Exception();
                        }
//                        } else {
//                            arr2[i] = huong + buoc;
//                        }
                    }

                }


//                for (String s : arr1) {
//                    System.out.print(s + "- ");
//                }
//                System.out.println("--------------");
//                for (String s : arr2) {
//                    System.out.print(s + "- ");
//                }

                boolean check = true;
                for (int i = 0; i < n; i++) {
                    if (n - i >= m) {
                        int index = 0;
                        if (arr2[index].equals(arr1[i]) || arr2[index].equals("?") || arr1[i].equals("?")) {
                            for (int j = i + 1; j < arr1.length; j++) {
                                if (index == arr2.length - 1) {
                                    break;
                                } else {
                                    index = index + 1;
                                }
                                if (arr2[index].equals(arr1[j]) || arr2[index].equals("?") || arr1[j].equals("?")) {
                                    check = true;
                                } else {
                                    check = false;
                                    break;
                                }
                            }
                            if (check) {
                                cout++;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(cout);
        }
        System.out.println(cout);
    }

}
