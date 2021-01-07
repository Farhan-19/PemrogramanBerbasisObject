package pbo_3_inherite;

import java.util.ArrayList;

public class Tim 
    {
    private String jeneng;
    private ArrayList<Member> team;
 
    public Tim(String jeneng) 
    {
        this.jeneng = jeneng;
        team = new ArrayList<>();
    }
    public void addMember(Member m) 
    {
        team.add(m);
    }
    public void displayFullMember() 
    {
        System.out.println("\n\n===== Member Anggota : " + jeneng +" =====");
        for(Member m : team) {
            m.display();
            System.out.println();
        }
    }
    public void displayTrainee() {
        System.out.println("\n\n===== Trainee Anggota : " + jeneng +" =====");
        for(Member m : member) {
            if(m instanceof Trainee) {
                Trainee trainee = (Trainee) m;
                trainee.display();
                System.out.println();
            }
        }
    }
}