import java.util.Random;

public class HomeWork8 {
    public static void main(String[] args) {
        int number = 5;
        int hiddenNumber;
        int numberOfAttempts = 10;
        Random random = new Random();
        for (int i = 0; i < numberOfAttempts; i++) {
            hiddenNumber = random.nextInt(10);
            if (hiddenNumber == number){
                System.out.println("Вы отгадали число правильно " + hiddenNumber + ".");
                break;
            }else {
                System.out.println("Компьютер загадал другое число.");
            }
        }
    }
}

