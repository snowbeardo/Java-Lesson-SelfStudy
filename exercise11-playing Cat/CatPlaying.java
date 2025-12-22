import java.util.Scanner;

public class CatPlaying{
    public static boolean isCatPlaying  (boolean summer, int temperature){
        if(summer == true){
            if(temperature<=35 || temperature>=25){
                return true;
            }else{
                return  false;
            }
        }else{
            if(temperature>=35 || temperature<=45){
                return  true;
            }else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is it summer? ");
        boolean summer = scanner.nextBoolean();

        System.out.println("Enter temperature:");
        int temperature = scanner.nextInt();

        boolean result = isCatPlaying(summer, temperature);

        if(result){
            System.out.println("The cat is playing!");
        }else{
            System.err.println("The cat is  not playing");
        }
    }



}