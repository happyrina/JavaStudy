package study;
public class Switch {
    public static void main(String[] args){
        System.out.println("switch(1)");
        switch(4) { //주어진 타입만 사용 가능 제한!
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

    } 
}
