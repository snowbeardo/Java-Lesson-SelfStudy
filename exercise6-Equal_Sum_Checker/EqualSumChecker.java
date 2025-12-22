public class EqualSumChecker{
    public static boolean hasEqualSum(int a, int b, int c){
        int d = a+b;
        if(d==c) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = -3;
        int z = 3;

        boolean judgement = hasEqualSum(x, y, z);
        System.out.println(judgement);
    }
}