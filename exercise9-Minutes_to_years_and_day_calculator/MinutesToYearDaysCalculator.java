public class MinutesToYearDaysCalculator{

public static void calculator(int min){
    int allDays = min % (24*60);
    int years = allDays/365;
    int days = allDays%365;
    System.out.println(min+" Minutes = "+ years + " years "+ days + "days");
}

public static void main(String[] args) {
    calculator(54326);
}
}