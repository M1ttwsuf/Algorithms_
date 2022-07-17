import java.util.Scanner;

/*정수를 읽어서 2진수, 8진수, 16진수로 출력하는 프로그램을 작성하라.*/
public class Question {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));
    }
}
