public class AreaCalculator{
    public static double areaRound(double x){
        if(x<0){
            return -1;
        }else{
            double area = x*x*Math.PI;
            return area;
        }
    }

    public static double areaSquare(double x, double y){
        if(x<0 || y<0){
            return -1;
        }else{
            double area = x*y;
            return area;
        }
    }
}