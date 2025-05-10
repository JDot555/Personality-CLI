import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Q = 1;
        int Brave = 0;
        int coward = 0;
        int calm = 0;
        int fearless = 0;
        String Run = "Q1";

        Scanner scan = new Scanner(System.in);

        System.out.println("\nQ"+Q+": You're walking alone at night and hear a loud crash nearby. What do you do?");
        System.out.println("1. Run toward the sound to help");
        System.out.println("2. Run away from the area ");
        System.out.println("3. Stay still and observe from a distance");
        System.out.println("4. Shout to scare off whatever it is");
        int Q1 = scan.nextInt();

        Q++;

        if (Q1==1){
            Brave++;
            Run = "Q2_1";
        } else if (Q1 == 2) {
            coward++;
            Run = "Q2_2";
        } else if (Q1 == 3) {
            calm++;
            Run = "Q2_3";
        } else if (Q1 == 4) {
            fearless++;
            Run = "Q2_4";
        }else {
            System.out.println("option not available.");
        }
        Q2.q2(Q, Brave, coward, calm, fearless, Run);
    }
}