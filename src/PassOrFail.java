import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Math score: ");
        float math = take.nextFloat();
        System.out.println("Phy score: ");
        float phy = take.nextFloat();
        System.out.println("Chem score: ");
        float chem = take.nextFloat();
        System.out.println("Music score: ");
        float music = take.nextFloat();
        System.out.println("Tur score: ");
        float tur = take.nextFloat();
        float total=0;
        int num = 0;
        if (math > 0 && math<100)
        {
            total+=math;
            num++;
        }
        if (phy > 0 && phy<100)
        {
            total+=phy;
            num++;
        }
        if (chem > 0 && chem<100)
        {
            total+=chem;
            num++;
        }
        if (music > 0 && music<100)
        {
            total+=music;
            num++;
        }
        if (tur > 0 && tur<100)
        {
            total+=tur;
            num++;
        }
        float aver = total/num;
        System.out.println("Average: " + aver);
        if (aver >= 55)
        {
            System.out.println("Passed");
        }
        else{
            System.out.println("Not Passed");
        }
    }
}
