/*class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}*/
/*abstract class Shape{
    Shape(){
        System.out.println("Shape is Constructed");
    }
    abstract void draw();  //no definition
}*/
interface Shape{
    /*Shape(){    //err
        System.out.println("Shape is Constructed");
    }*/
    void draw();  //public abstract void draw();
}
class Circle implements Shape{  // Not Object to Object Inheritance
    public void draw(){  //overriding
        System.out.println("Drawing a Circle");
    }
}
/*class Rectangle extends Shape{  //Object to Object Inheritance
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
class Polygon extends Shape{
    void draw(){
        System.out.println("Drawing a Polygon");
    }
}*/
public class OOPS {
    public static void main(String[] args) {
       /* Shape s;
        s = new Shape();
        s.draw();

        Circle c;
        c = new Circle();
        c.draw();*/

        //Run Time Polymorphism
        Shape s;
        s = new Circle();  //polymorphic Statement
        s.draw();

//        s = new Rectangle();
//        s.draw();
//
//        s = new Polygon();
//        s.draw();

//        s = new Shape();
//        s.draw();
    }
}
