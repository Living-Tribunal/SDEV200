

public class Main_M1_9_9 {
    public static void main(String[] args){
        RegularPolygon firstPolygon = new RegularPolygon();

        RegularPolygon secondPolygon = new RegularPolygon(6,4);

        RegularPolygon thirdPolygon = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("The perimeter of polygon one is " + firstPolygon.getPerimeter() + " the " + "area of polygon one is " + firstPolygon.getArea());

        System.out.println("The perimeter of polygon two is " + secondPolygon.getPerimeter() + " the " + "area of polygon two is " + secondPolygon.getArea());

        System.out.println("The perimeter of polygon three is " + thirdPolygon.getPerimeter() + " the " + "area of polygon three is " + thirdPolygon.getArea());
            
            }
}