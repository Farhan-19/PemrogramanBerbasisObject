package pbo_3_inherite;
      //Komen
public class Member {
    protected String jeneng;
    protected int age;
      //Komen
    public Member (String jeneng, int age) 
    {
        this.jeneng = jeneng;
        this.age = age;
    }
    public void display() 
    {
        System.out.println("Namanya : " + jeneng);
        System.out.println("Usianya : " + age);
    }
}