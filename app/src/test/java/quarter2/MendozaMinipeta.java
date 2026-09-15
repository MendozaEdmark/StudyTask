package quarter2;
import org.junit.Test;
public class MendozaMinipeta {
    @Test
    public void printmyProfile() {
        String myName = "Edmark";
        String petName = "Destroyah";
        String favFood = "Kare-kare";
        int myage = 17;

        System.out.println("--- My Digital Profile ---");
        System.out.println("Hello!, my name is " + myName + " and i am " + myage);
        System.out.println("And I know a wonderful cat named " + petName + ".");
        System.out.println("And one of my favorite food is " + favFood + ".");
    }

}
