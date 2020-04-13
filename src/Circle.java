public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }
/*属性--成员变量*/
    public void setRadius(double r) {
        radius = r;
    }
    public double zc(){
        return 2*radius*Math.PI;
    }
    public double mj(){
        return radius*radius*Math.PI;
    }
    public void disp(){
        System.out.printf("radius=%.4f\n" +
                "perimeter=%.4f\n" +
                "area=%.4f",radius,zc(),mj());

    }

    public static void main(String[] args) {
        String s1="international";
        System.out.println(s1.indexOf("na",3));
    }


}
