// CONVERSIONS BETWEEN FEET AND METERS
// AUTHOR: <|Cody Dalton|>
//M1_9_9
// Date: 10.23.2023
// Purpose: <|To convert feet to meters and meters to feet|>


public class RegularPolygon {
    private int n = 3; /* A private int data field named n that defines the number of sides in the polygon with default value 3. */
    private double side = 1; /*A private double data field named side that stores the length of the side with default value 1.. */
    private double x = 0; /* A private double data field named x that defines the coordinate of the polygon’s center with default value 0. */
    private double y = 0; /* A private double data field named y that defines the coordinate of the polygon's center with the default value 0. */
    

    RegularPolygon() {/*A no-arg constructor that creates a regular polygon with default values. */
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    RegularPolygon(int numSides, double sideLength) { /*A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0). */
        n = numSides;
        side = sideLength;
    }
    
    RegularPolygon(int numSides, double sideLength, double x, double y) {
        n = numSides;
        side = sideLength;
        this.x = x;
        this.y = y;
    }
    /*The accessor and mutator methods for all data fields.*/

    public void setN(int n) {
        this.n = n;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }
    public double getSide() {
        return side;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    
    public double getPerimeter(){ /* The method getPerimeter() that returns the perimeter of the polygon.*/
        return n * side;
    }

    public double getArea(){ /* The method getArea() that returns the  of the polygon.*/
        return n * (Math.pow(side, 2) / 4 * Math.tan(Math.PI / n));

    }


}             




