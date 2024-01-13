package study;

public class ArrayLoop {
    public static void main(String[] args) {
        String[] members = {"차아린", "차아린1", "차아린2", "차아린3"};
        for (int i = 0; i < members.length; i++){
            String member = members[i];
            System.out.println(member + "은 똑똑이 입니다");
        }

        int i = 0;
        while(i < members.length){
            String member = members[i];
            System.out.println(member + "while문 인가요?");





            i++;
        }
    }
}
