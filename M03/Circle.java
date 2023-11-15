import java.util.Objects;

/**
 * Represents a circle with a given radius.
 * Extends the GeometricObject class and implements Comparable<Circle>.
 */
public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int compareTo(Circle c1) {
        return Double.compare(this.radius, c1.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    /**
     * Instantiates a new Circle.
     */
    public Circle() {
    }

    /**
     * Instantiates a new Circle.
     *
     * @param radius the radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Instantiates a new Circle.
     *
     * @param radius the radius
     * @param color  the color
     * @param filled whether the circle is filled
     */
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /**
     * Returns the radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius.
     *
     * @param radius the radius
     */
    public void setRadius(double radius) {
        // Add validation if necessary
        this.radius = radius;
    }

    /**
     * Returns the area of the circle.
     *
     * @return the area of the circle
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Returns the diameter of the circle.
     *
     * @return the diameter of the circle
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Returns the perimeter of the circle.
     *
     * @return the perimeter of the circle
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Print details of the circle.
     */
    public void printDetails() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}
