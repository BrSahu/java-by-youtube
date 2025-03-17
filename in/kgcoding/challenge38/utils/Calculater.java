package in.kgcoding.challenge38.utils;

import in.kgcoding.challenge38.geomatery.Circle;
import in.kgcoding.challenge38.geomatery.rectangle;

public class Calculater {
    public static void main(String[] args) {

        Circle cir = new Circle(5);
        rectangle rect = new rectangle(9, 8);
        double cirArea = Math.PI * Math.pow(cir.radius,2);
        double rectArea = rect.breadth * rect.length ;
        System.out.println("area of the circle  " +  cirArea);
        System.out.println("areaof the rectangle is  "+ rectArea);

    }
}
