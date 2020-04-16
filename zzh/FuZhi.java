package Day12y3;

public class FuZhi {
    String name;
    int age;

    public FuZhi() {

    }

    public FuZhi(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("输入错误");
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("输入错误");
        }
    }

    public int getAge() {
        return age;
    }
}
