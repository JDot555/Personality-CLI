import java.util.Scanner;

public class Q2 {
    public static void q2(int Q, int Brave, int coward, int calm, int fearless, String Run){
        Scanner scan = new Scanner(System.in);

        switch (Run) {
            case "Q2_1": Q2_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q2_2": Q2_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q2_3": Q2_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q2_4": Q2_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            default:
                System.out.println("error Question not found on " + Run);
        }
    }

    public static void Q2_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You see a person trapped under a fallen sign. What do you do?");
        System.out.println("1. Try to lift it immediately ");
        System.out.println("2. Call someone else for help");
        System.out.println("3. Check the person's condition calmly");
        System.out.println("4. Take charge and yell for backup");
        int Q2_1 = scan.nextInt();

        Q++;

        if(Q2_1 == 1){
            Brave++;
            Run = "Q3_1_1";
        } else if (Q2_1 == 2) {
            coward++;
            Run = "Q3_1_2";
        } else if (Q2_1 == 3) {
            calm++;
            Run = "Q3_1_3";
        } else if (Q2_1 == 4) {
            fearless++;
            Run = "Q3_1_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q2_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You hide behind a building but hear crying. What now?");
        System.out.println("1. Keep hiding until it's silent");
        System.out.println("2. Call emergency services");
        System.out.println("3. Slowly peek around the corner");
        System.out.println("4. Sprint away as fast as possible");
        int Q2_2 = scan.nextInt();

        Q++;

        if(Q2_2 == 1){
            Brave++;
            Run = "Q3_2_1";
        } else if (Q2_2 == 2) {
            coward++;
            Run = "Q3_2_2";
        } else if (Q2_2 == 3) {
            calm++;
            Run = "Q3_2_3";
        } else if (Q2_2 == 4) {
            fearless++;
            Run = "Q3_2_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q2_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You see people arguing loudly. What do you do?");
        System.out.println("1. Walk over to calmly intervene.");
        System.out.println("2. Stay and observe from a distance.");
        System.out.println("3. Try to talk them down gently.");
        System.out.println("4. Get involved quickly and take control.");
        int Q2_3 = scan.nextInt();

        Q++;

        if(Q2_3 == 1){
            Brave++;
            Run = "Q3_3_1";
        } else if (Q2_3 == 2) {
            coward++;
            Run = "Q3_3_2";
        } else if (Q2_3 == 3) {
            calm++;
            Run = "Q3_3_3";
        } else if (Q2_3 == 4) {
            fearless++;
            Run = "Q3_3_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q2_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Your shout startled something. A dog runs out toward you.");
        System.out.println("1. Stand your ground.");
        System.out.println("2. Climb a nearby bench or object.");
        System.out.println("3. Remain calm and talk to the dog.");
        System.out.println("4. Charge toward the dog to scare it off.");
        int Q2_4 = scan.nextInt();

        Q++;

        if(Q2_4 == 1){
            Brave++;
            Run = "Q3_4_1";
        } else if (Q2_4 == 2) {
            coward++;
            Run = "Q3_4_2";
        } else if (Q2_4 == 3) {
            calm++;
            Run = "Q3_4_3";
        } else if (Q2_4 == 4) {
            fearless++;
            Run = "Q3_4_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void exit(int Q, int Brave, int coward, int calm, int fearless, String Run){
        Q3.q3(Q, Brave, coward, calm, fearless, Run);
    }

}
