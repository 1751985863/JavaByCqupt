public class test {
    public static void main(String[] args) {
        int num=100;
        int a1,a2,a3;
        int times=1;
        for (int i = 100; i < 999; i++) {
            a1=i/100;
            a2=(i-a1*100)/10;
            a3=i%10;
            if (a1*a1*a1+a2*a2*a2+a3*a3*a3==i){
                System.out.println("ShuiXianHua No"+times+":"+i+"");
                times++;
            }
        }
    }
}
