public class IntEqualityPrinter{
    public static void printEqual(int i1, int i2, int i3){
        if(i1<0 || i2<0 ||i3<0){
            System.err.println("Invalid Vaiue");
        }else{
            if(i1==i2 && i2==i3){
                System.out.println("All numbers are equal");
            } else{
                if((i1 != i2)&&(i2 != i3)&&(i3 != i1)){
                    System.out.println("All number are different");
                }else{
                    System.out.println("Neither all are equal or different");
                }
            }
        }
    }

    public static void main(String[] args) {
        printEqual(50, 50, 50);
    }
}