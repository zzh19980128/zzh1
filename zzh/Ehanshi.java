package Day12y3;

public class Ehanshi {
   /* public static void main(String[] args) {

    }*/
    private static Ehanshi sin = new Ehanshi();//饿汉式

    private Ehanshi() {
    }

    public static Ehanshi getInstance() {
        return sin;
    }
}
/*private static Ehanshi2 sin=null;//懒汉式
      private Ehanshi(){
            }
      public static Ehanshi2 getInstance(){
      if(sin==null) sin=new Ehanshi2();
      return sin;
      }
* */