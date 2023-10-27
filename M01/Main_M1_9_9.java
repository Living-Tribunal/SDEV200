
// RegularPolygon Main Program
// AUTHOR: <|Cody Dalton|>
//M1_9_9
// Date: 10.27.2023
// Purpose: <|Main program to run the RegularPolygon class file|>
public class Main_M1_9_9 {
    public static void main(String[] args){
        
        /*calling methods */
        RegularPolygon firstPolygon = new RegularPolygon();

        RegularPolygon secondPolygon = new RegularPolygon(6,4);

        RegularPolygon thirdPolygon = new RegularPolygon(10,4,5.6,7.8);
        
        /* printing results */
        System.out.println("The perimeter of the first polygon " + firstPolygon.getPerimeter() + " the " + "area of the first polygon " + firstPolygon.getArea());

        System.out.println("The perimeter of the second polygon " + secondPolygon.getPerimeter() + " the " + "area of the second polygon" + secondPolygon.getArea());

        System.out.println("The perimeter of the third polygon " + thirdPolygon.getPerimeter() + " the " + "area of the third polygons " + thirdPolygon.getArea());
            
            }
}