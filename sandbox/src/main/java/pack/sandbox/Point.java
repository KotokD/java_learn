package pack.sandbox;

/**
 * Created by User on 10.06.2017.
 */
public class Point {
  public double a;
  public double b;
  public Point(double aa,double bb)
  {
    a=aa;
    b=bb;
  }
  public double distance(Point pp,Point pq)
  {
    double dist= Math.sqrt(Math.pow((pp.a-pq.a),2)+Math.pow((pp.b-pq.b),2));
    return dist;
  }
}
