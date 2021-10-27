package sec02.exam02_switch;

public class SwitchStringExam1 {
    public static void main(String args) {
        String position = "과장";

        switch (position) {
            case "부장":
                System.out.println("800만원");
            case "과장":
                System.out.println("500만원");
            default:
                System.out.println("300만원");
        }
    }
}
