package classWorks;

public class GeomApp {

    public static void main(String[] args) {

        point p1 = new point(10.5,12.5);
        point p2 = new point(3.5, 5.5);
        point p3 = new point(15.5, 20.5);


        rectangle r = new rectangle(p1, p2);
        System.out.println(r.area());

        circle c = new circle(34);
        System.out.println(c.area());


    }

}
