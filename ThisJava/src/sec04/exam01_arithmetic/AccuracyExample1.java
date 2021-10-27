package sec04.exam01_arithmetic;

public class AccuracyExample1 {
    public static void main(String args[]) {
        int apple = 1;
        // double pieceUnit = 0.1;
        int totalPieces = apple * 10;
        int number = 7;
        int temp = totalPieces - number;

        // double result = apple - number * pieceUnit;
        System.out.println("사과 한개에서 0.7을 빼면"+ temp + " 조각이 남는다");
    }
}
