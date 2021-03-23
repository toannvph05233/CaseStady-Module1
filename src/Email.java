import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email<T> {
    public static void main(String[] args) {
////        String str = "johntoan @gmail.com.vn";
////
////        // Ký tự bất kỳ xuất hiện nhiều lần lần và kết thúc là r
////        String regex = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)+$";
////        System.out.println(regex);
////
////        // Tạo đối tượng Pattern thông qua method tĩnh.
////        Pattern pattern = Pattern.compile(regex);
////
////        // Lấy ra đối tượng Matcher
////        Matcher matcher = pattern.matcher(str);
////
////        // Kiểm tra có khơp với regex không
////        boolean match = matcher.matches();
////        System.out.println("Match = " + match); // Match = true
//        Toan t = new Toan();
//        TestCrawl testCrawl = new TestCrawl();
//
//
//        System.out.println(testCrawl.getClass().getSimpleName());
//
//        if (t.getClass().getSimpleName().equals("Toan")){
//            System.out.println("Toan");
//        }
        String str = "01aaA@@@01aaA@@@01aaA@@@01aaA@@@01aaA@@@01aaA@@@";
        String regex = "([0-9]+[a-z]+[A-Z]+[$&+,:;=?@#|]+){6,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        boolean match = matcher.matches();
        System.out.println(match);
        int a = (int) "Sbcd".charAt(0);
        System.out.println(a);

    }
}
class Toan{
    public Toan() {
    }
}
