package Day12y3;

public class XYstatic {
    int x=1;
    static int y=1;
    public XYstatic(){
        x++;
        y++;
        y
                ++;
    }

    public static void main(String[] args) {
        XYstatic a1=new XYstatic();
        XYstatic a2=new XYstatic();
        System.out.println("x"+a1.x+"y"+a1.y);
        System.out.println("x"+a2.x+"y"+a2.y);
    }
}
