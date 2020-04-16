package Day12y3;

public class JingTaiStatic {
    static{
        System.out.println("static语句块");
    }{
        System.out.println("非static语句块" );
    }

    public static void main(String[] args) {
        System.out.println("111");
        JingTaiStatic ts;
        System.out.println("222");
       ts=new JingTaiStatic();
        System.out.println("333");
        JingTaiStatic ts2=new JingTaiStatic();
    }
}
