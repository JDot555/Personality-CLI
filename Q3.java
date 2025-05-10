import java.util.Scanner;

public class Q3 {
    public static void q3(int Q, int Brave,int coward,int calm,int fearless,String Run){
        Scanner scan = new Scanner(System.in);

        switch (Run) {
            case "Q3_1_1": Q3_1_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_1_2": Q3_1_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_1_3": Q3_1_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_1_4": Q3_1_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_2_1": Q3_2_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_2_2": Q3_2_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_2_3": Q3_2_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_2_4": Q3_2_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_3_1": Q3_3_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_3_2": Q3_3_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_3_3": Q3_3_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_3_4": Q3_3_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_4_1": Q3_4_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_4_2": Q3_4_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_4_3": Q3_4_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q3_4_4": Q3_4_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            default:
                System.out.println("error Question not found on " + Run);
        }
    }

    public static void Q3_1_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The object is heavier than expected. what will you do?");
        System.out.println("""
                1. Keep lifting even if it's painful.\
                
                2. Step back and wait for help.\
                
                3. Calmly look for a tool.\
                
                4. Ask others nearby to help.""");
        int Q3_1_1 = scan.nextInt();

        Q++;

        if (Q3_1_1 == 1){
            Brave++;
            Run = "Q4_1_1_1";
        } else if (Q3_1_1 == 2) {
            coward++;
            Run = "Q4_1_1_2";
        } else if (Q3_1_1 == 3) {
            calm++;
            Run = "Q4_1_1_3";
        } else if (Q3_1_1 == 4) {
            fearless++;
            Run = "Q4_1_1_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_1_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You see someone else approaching. what will you do?");
        System.out.println("""
                1. Quickly explain the situation.\
                
                2. Back away and let them handle it.\
                
                3. Stay by the victim’s side.\
                
                4. Take control and give orders.""");
        int Q3_1_2 = scan.nextInt();

        Q++;

        if (Q3_1_2 == 1){
            Brave++;
            Run = "Q4_1_2_1";
        } else if (Q3_1_2 == 2) {
            coward++;
            Run = "Q4_1_2_2";
        } else if (Q3_1_2 == 3) {
            calm++;
            Run = "Q4_1_2_3";
        } else if (Q3_1_2 == 4) {
            fearless++;
            Run = "Q4_1_2_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_1_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The person is conscious but scared. what will you do?");
        System.out.println("""
                1. Encourage them confidently.\
                
                2. Step away nervously.\
                
                3. Reassure them calmly.\
                
                4. Shout for medical help.""");
        int Q3_1_3 = scan.nextInt();

        Q++;

        if (Q3_1_3 == 1){
            Brave++;
            Run = "Q4_1_3_1";
        } else if (Q3_1_3 == 2) {
            coward++;
            Run = "Q4_1_3_2";
        } else if (Q3_1_3 == 3) {
            calm++;
            Run = "Q4_1_3_3";
        } else if (Q3_1_3 == 4) {
            fearless++;
            Run = "Q4_1_3_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_1_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": A crowd gathers. what will you do?");
        System.out.println("""
                1. Lead a rescue attempt.\
                
                2. Let others take over.\
                
                3. Keep things calm and focused.\
                
                4. Rush to pull the person out.""");
        int Q3_1_4 = scan.nextInt();

        Q++;

        if (Q3_1_4 == 1){
            Brave++;
            Run = "Q4_1_4_1";
        } else if (Q3_1_4 == 2) {
            coward++;
            Run = "Q4_1_4_2";
        } else if (Q3_1_4 ==3) {
            calm++;
            Run = "Q4_1_4_3";
        } else if (Q3_1_4 == 4) {
            fearless++;
            Run = "Q4_1_4_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }

    public static void Q3_2_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You hear footsteps approaching. what will you do now?");
        System.out.println("""
                1. Stay hidden and hope for safety.\
                
                2. Sneak away.\
                
                2. Quietly call for help.\
                
                4. Confront whoever it is.""");
        int Q3_2_1 = scan.nextInt();

        Q++;

        if (Q3_2_1 == 1){
            Brave++;
            Run = "Q4_2_1_1";
        } else if (Q3_2_1 == 2) {
            coward++;
            Run = "Q4_2_1_2";
        } else if (Q3_2_1 == 3) {
            calm++;
            Run = "Q4_2_1_3";
        } else if (Q3_2_1 == 4) {
            fearless++;
            Run = "Q4_2_1_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_2_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The dispatcher asks questions. what will you do?");
        System.out.println("""
                1. Answer quickly and clearly.\
                
                2. Panic and hang up.\
                
                3. Stay calm and give details.\
                
                4. Demand they send help fast.""");
        int Q3_2_2 = scan.nextInt();

        Q++;

        if (Q3_2_2 == 1){
            Brave++;
            Run = "Q4_2_2_1";
        } else if (Q3_2_2 == 2) {
            coward++;
            Run = "Q4_2_2_2";
        } else if (Q3_2_2 == 3) {
            calm++;
            Run = "Q4_2_2_3";
        } else if (Q3_2_2 == 4) {
            fearless++;
            Run = "Q4_2_2_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_2_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You see a child crying. what will you do?");
        System.out.println("""
                1. Step out and help.\
                
                2. Stay hidden.\
                
                3. Talk to them calmly.\
                
                4. Run toward them fast.""");
        int Q3_2_3 = scan.nextInt();

        Q++;

        if (Q3_2_3 == 1){
            Brave++;
            Run = "Q4_2_3_1";
        } else if (Q3_2_3 == 2) {
            coward++;
            Run = "Q4_2_3_2";
        } else if (Q3_2_3 == 3) {
            calm++;
            Run = "Q4_2_3_3";
        } else if (Q3_2_3 == 4) {
            fearless++;
            Run = "Q4_2_3_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_2_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You fall while running. what will you do now?");
        System.out.println("""
                1. Get up and run again.\
                
                2. Lie still and hope you’re not seen.\
                
                3. Breathe deeply and assess the situation.\
                
                4. Grab a stick and prepare to fight.""");
        int Q3_2_4 = scan.nextInt();

        Q++;

        if (Q3_2_4 == 1){
            Brave++;
            Run = "Q4_2_4_1";
        } else if (Q3_2_4 == 2) {
            coward++;
            Run = "Q4_2_4_2";
        } else if (Q3_2_4 == 3) {
            calm++;
            Run = "Q4_2_4_3";
        } else if (Q3_2_4 == 4) {
            fearless++;
            Run = "Q4_2_4_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }

    public static void Q3_3_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": One person yells at you.");
        System.out.println("""
                1. Stand firm.\
                
                2. Back away.\
                
                3. Keep your tone even.\
                
                4. Yell louder than them.""");
        int Q3_3_1 = scan.nextInt();

        Q++;

        if (Q3_3_1 == 1){
            Brave++;
            Run = "Q4_3_1_1";
        } else if (Q3_3_1 == 2) {
            coward++;
            Run = "Q4_3_1_2";
        } else if (Q3_3_1 == 3) {
            calm++;
            Run = "Q4_3_1_3";
        } else if (Q3_3_1 == 4) {
            fearless++;
            Run = "Q4_3_1_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_3_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": They start fighting.");
        System.out.println("""
                1. Step in bravely.\
                
                2. Walk away.\
                
                3. Call police quietly.\
                
                4. Charge in and separate them.""");
        int Q3_3_2 = scan.nextInt();

        Q++;

        if (Q3_3_2 == 1){
            Brave++;
            Run = "Q4_3_2_1";
        } else if (Q3_3_2 == 2) {
            coward++;
            Run = "Q4_3_2_2";
        } else if (Q3_3_2 == 3) {
            calm++;
            Run = "Q4_3_2_3";
        } else if (Q3_3_2 == 4) {
            fearless++;
            Run = "Q4_3_2_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_3_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": They start listening.");
        System.out.println("""
                1. Encourage peace.\
                
                2. Back away cautiously.\
                
                3. Mediate carefully.\
                
                4. Take over the conversation.""");
        int Q3_3_3 = scan.nextInt();

        Q++;

        if (Q3_3_3 == 1){
            Brave++;
            Run = "Q4_3_3_1";
        } else if (Q3_3_3 == 2) {
            coward++;
            Run = "Q4_3_3_2";
        } else if (Q3_3_3 == 3) {
            calm++;
            Run = "Q4_3_3_3";
        } else if (Q3_3_3 == 4) {
            fearless++;
            Run = "Q4_3_3_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_3_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Someone gets angry at you.");
        System.out.println("""
                1. Defend yourself.\
                
                2. Leave immediately.\
                
                3. Calmly explain.\
                
                4. Push back physically.""");
        int Q3_3_4 = scan.nextInt();

        Q++;

        if (Q3_3_4 == 1){
            Brave++;
            Run = "Q4_3_4_1";
        } else if (Q3_3_4 == 2) {
            coward++;
            Run = "Q4_3_4_2";
        } else if (Q3_3_4 == 3) {
            calm++;
            Run = "Q4_3_4_3";
        } else if (Q3_3_4 == 4) {
            fearless++;
            Run = "Q4_3_4_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }

    public static void Q3_4_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The dog stops but growls.");
        System.out.println("""
                1. Talk to it bravely.\
                
                2. Freeze in fear.\
                
                3. Speak gently.\
                
                4. Bark back at it.""");
        int Q3_4_1 = scan.nextInt();

        Q++;

        if (Q3_4_1 == 1){
            Brave++;
            Run = "Q4_4_1_1";
        } else if (Q3_4_1 == 2) {
            coward++;
            Run = "Q4_4_1_2";
        } else if (Q3_4_1 == 3) {
            calm++;
            Run = "Q4_4_1_3";
        } else if (Q3_4_1 == 4) {
            fearless++;
            Run = "Q4_4_1_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_4_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You’re stuck. The dog barks louder.");
        System.out.println("""
                1. Jump down and run.\
                
                2. Stay frozen.\
                
                3. Call for help.\
                
                4. Jump at the dog to scare it.""");
        int Q3_4_2 = scan.nextInt();

        Q++;

        if (Q3_4_2 == 1){
            Brave++;
            Run = "Q4_4_2_1";
        } else if (Q3_4_2 == 2) {
            coward++;
            Run = "Q4_4_2_2";
        } else if (Q3_4_2 == 3) {
            calm++;
            Run = "Q4_4_2_3";
        } else if (Q3_4_2 == 4) {
            fearless++;
            Run = "Q4_4_2_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_4_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The dog approaches slowly.");
        System.out.println("""
                1. Let it sniff you.\
                
                2. Flinch.\
                
                3. Stay still and calm.\
                
                4. Pat it on the head.""");
        int Q3_4_3 = scan.nextInt();

        Q++;

        if (Q3_4_3 == 1){
            Brave++;
            Run = "Q4_4_3_1";
        } else if (Q3_4_3 == 2) {
            coward++;
            Run = "Q4_4_3_2";
        } else if (Q3_4_3 == 3) {
            calm++;
            Run = "Q4_4_3_3";
        } else if (Q3_4_3 == 4) {
            fearless++;
            Run = "Q4_4_3_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void Q3_4_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The dog runs off. A person yells behind it.");
        System.out.println("""
                1. Confront them.\
                
                2. Walk away fast.\
                
                3. Ask what’s happening.\
                
                4. Run toward them.""");
        int Q3_4_4 = scan.nextInt();

        Q++;

        if (Q3_4_4 == 1){
            Brave++;
            Run = "Q4_4_3_1";
        } else if (Q3_4_4 == 2) {
            coward++;
            Run = "Q4_4_3_2";
        } else if (Q3_4_4 == 3) {
            calm++;
            Run = "Q4_4_3_3";
        } else if (Q3_4_4 == 4) {
            fearless++;
            Run = "Q4_4_3_4";
        }else {
            System.out.println("option not available.");
        }
        exit(Q, Brave, coward, calm, fearless, Run);
    }
    public static void exit(int Q, int Brave, int coward, int calm, int fearless, String Run){
        Q4.q4(Q, Brave, coward, calm, fearless, Run);
    }
}
