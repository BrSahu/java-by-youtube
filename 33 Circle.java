import java.util.Scanner;

class Circle {
     double radiusInmm ;

     Circle(double radiusInmm){
         this.radiusInmm = radiusInmm;
     }

     double getCircumference(double radiusInmm){
         return 2 * Math.PI*radiusInmm;
     }

     double getArea(){
         return Math.PI*Math.pow(radiusInmm,2);
     }

    @Override
    public String toString() {
        return "circle world : Radius in mm"+ radiusInmm
                              +" , circumference in mm ,"+getCircumference( radiusInmm)
                              +" area in mm2 "+ getArea();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to circle world");
        System.out.println("please enter circle radius");
        double radiusInmm = input.nextInt();
        Circle circle = new Circle(radiusInmm);
        System.out.println(circle);
    }
}
