package pack.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    Square s = new Square(5);
    Rectangle k = new Rectangle();
    k.a=5;
    k.b=6;
    area(k);
    System.out.println( s.area());
    System.out.println(area(k));

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