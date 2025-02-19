class Rectangle extends Shape{
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    // Getter
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    // Getter
    public double getRadius(){
        return radius;
    }

    @Override
    public double calculateArea() {
      return Math.PI * this.radius * this.radius;
    }
}

class Eclipse extends Shape {
    private double radiusA;
    private double radiusB;

    public Eclipse(double radiusA, double radiusB){
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }

    // Getter
    public double getRadiusA(){
        return radiusA;
    }
    public double getRadiusB(){
        return radiusB;
    }

    @Override
    public double calculateArea() {
      return Math.PI * this.radiusA * this.radiusB;
    }
}