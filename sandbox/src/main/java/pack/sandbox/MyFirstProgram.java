package pack.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    Point p1=new Point(2,5);
    Point p2=new Point(0,8);
    System.out.println(p1.distance(p1,p2));
  }
  public static void hello()
  {
    System.out.println("Hello Word");
  }

  public static double area (Rectangle k)
  {
    return k.a*k.b;
  }
}