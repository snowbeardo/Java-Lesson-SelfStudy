public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){
        d1 = d1*1000;
        d2 = d2*1000;
        int i1 = (int)d1;
        int i2 = (int)d2;
        if (i1 == i2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        double d1 = 342414.43;
        double d2 = 342414.435;
       boolean judgement =  areEqualByThreeDecimalPlaces(d1, d2);
       System.out.println(judgement);
    }
}