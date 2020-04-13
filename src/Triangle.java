public class Triangle {
    private double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (judgeTriangle(a,b,c))
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (judgeTriangle(a,b,c))
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (judgeTriangle(a,b,c))
        this.c = c;
    }
    public boolean judgeTriangle(double a,double b,double c){
        if (a>=b+c||c>=b+a||b>=a+c){
            return false;
        }else {
            return true;
        }
    }
    public double getPerimeter(){
        return a+b+c;
    }
    public void setSide(double x, double y, double z){
        if (judgeTriangle(x,y,z))
        {this.a = x;
        this.b = y;
        this.c = z;}
    }
    public double getArea(){
        double p=this.getPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public Triangle(double a, double b, double c) {
        if (judgeTriangle(a,b,c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    @Override
    public String toString() {
        return
                "a=" + a +
                ",b=" + b +
                ",c=" + c;
    }
}
