package pbo_3_inherite;

public class main {

    public static void main(String[] args) 
    {
        Team newFile = new Tim("New File");
      
        Member people1 = new Member("Suri", 21);
        Member people2 = new Member("Khen", 22);
        Member people3 = new Member("Kage", 23);
        
        Member people4 = new Trainee("Bun", 24, 10);
        Member people5 = new Trainee("Shino", 25, 11);
        Member people6 = new Trainee("Jutsu", 26, 12);
        
        newFile.addMember(people1);
        newFile.addMember(people2);
        newFile.addMember(people3);
        newFile.addMember(people4);
        newFile.addMember(people5);
        newFile.addMember(people6);
        
        newFile.displayFullMember();
        newFile.displayTrainee();
    }
    
}