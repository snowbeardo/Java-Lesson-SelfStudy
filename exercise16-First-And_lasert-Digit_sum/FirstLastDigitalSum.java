public class FirstLastDigitalSum {
    public static int firstAndLastDigitSum(int number) {
        if(number<0){
            return -1;
        }

        int lastDigit = number %10;
        int firstDigit = number;
        while (firstDigit>=10){
            firstDigit = firstDigit/10;
        }
        return firstDigit + lastDigit;
    }
}