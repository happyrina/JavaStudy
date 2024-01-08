package study;
public class EqualString {
    public static void main(String[] args) {
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b)); //문자열 내용 비교, 문자와 문자 비교
    }
}
