

public class speedconverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        } else{
            double con = (kilometersPerHour/1.60934);
            return Math.round(con);
        }
    }

    public static void printConverter(double kilometersPerHour){
        double con = toMilesPerHour(kilometersPerHour);
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        } else{
            System.err.println(":"+kilometersPerHour+"km/h = " +Math.round(con)+"mi/h");
        }
    }
    // public static void main(String[] args) throws IOException{
    //     System.out.println(args);
    // }
}