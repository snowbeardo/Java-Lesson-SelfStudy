public class MegaBytesConverter{
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes<0){
            System.out.println("Invalid value");
        } else{
            int mega = kiloBytes/1024;
            int rnd = kiloBytes%1024;

            System.out.println(""+kiloBytes+"KB = "+ mega+"MB+"+rnd+"KB");
        }
        
    }
    public static void main(String[] args) {
        int kilo = 8003;

        printMegaBytesAndKiloBytes(kilo);
    }
}