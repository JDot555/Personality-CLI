import java.util.Scanner;

public class Q4 {
    public static void q4(int Q, int Brave, int coward, int calm, int fearless, String Run){
        Scanner scan = new Scanner(System.in);

        switch (Run) {
            case "Q4_1_1_1": Q4_1_1_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_1_2": Q4_1_1_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_1_3": Q4_1_1_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_1_4": Q4_1_1_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_2_1": Q4_1_2_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_2_2": Q4_1_2_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_2_3": Q4_1_2_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_2_4": Q4_1_2_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_3_1": Q4_1_3_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_3_2": Q4_1_3_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_3_3": Q4_1_3_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_3_4": Q4_1_3_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_4_1": Q4_1_4_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_4_2": Q4_1_4_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_4_3": Q4_1_4_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_1_4_4": Q4_1_4_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_1_1": Q4_2_1_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_1_2": Q4_2_1_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_1_3": Q4_2_1_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_1_4": Q4_2_1_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_2_1": Q4_2_2_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_2_2": Q4_2_2_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_2_3": Q4_2_2_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_2_4": Q4_2_2_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_3_1": Q4_2_3_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_3_2": Q4_2_3_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_3_3": Q4_2_3_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_3_4": Q4_2_3_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_4_1": Q4_2_4_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_4_2": Q4_2_4_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_4_3": Q4_2_4_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_2_4_4": Q4_2_4_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_1_1": Q4_3_1_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_1_2": Q4_3_1_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_1_3": Q4_3_1_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_1_4": Q4_3_1_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_2_1": Q4_3_2_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_2_2": Q4_3_2_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_2_3": Q4_3_2_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_2_4": Q4_3_2_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_3_1": Q4_3_3_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_3_2": Q4_3_3_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_3_3": Q4_3_3_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_3_4": Q4_3_3_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_4_1": Q4_3_4_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_4_2": Q4_3_4_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_4_3": Q4_3_4_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_3_4_4": Q4_3_4_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_1_1": Q4_4_1_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_1_2": Q4_4_1_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_1_3": Q4_4_1_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_1_4": Q4_4_1_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_2_1": Q4_4_2_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_2_2": Q4_4_2_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_2_3": Q4_4_2_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_2_4": Q4_4_2_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_3_1": Q4_4_3_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_3_2": Q4_4_3_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_3_3": Q4_4_3_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_3_4": Q4_4_3_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_4_1": Q4_4_4_1(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_4_2": Q4_4_4_2(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_4_3": Q4_4_4_3(Q, Brave, coward, calm, fearless, Run, scan);break;
            case "Q4_4_4_4": Q4_4_4_4(Q, Brave, coward, calm, fearless, Run, scan);break;
            default:
                System.out.println("error Question not found on " + Run);
        }
    }

    public static void Q4_1_1_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You're hurt but manage to lift the object. A stranger offers help.");
        System.out.println("""
                1. Accept and ask them to assist further.\
                
                2. Refuse and leave the scene.\
                
                3. Thank them and wait for paramedics.\
                
                4. Give them instructions to help others.""");
        int Q4_1_1_1 = scan.nextInt();

        if (Q4_1_1_1 == 1){
            Brave++;
        } else if (Q4_1_1_1 == 2) {
            coward++;
        } else if (Q4_1_1_1 == 3) {
            calm++;
        } else if (Q4_1_1_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_1_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You hesitated while helping. The person trapped looks disappointed.");
        System.out.println("""
                1. Try again despite the struggle.\
                
                2. Apologize and leave.\
                
                3. Stay and offer moral support.\
                
                4. Shout at others nearby to help.""");
        int Q4_1_1_2 = scan.nextInt();

        if (Q4_1_1_2 == 1){
            Brave++;
        } else if (Q4_1_1_2 == 2) {
            coward++;
        } else if (Q4_1_1_2 == 3) {
            calm++;
        } else if (Q4_1_1_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_1_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You found a tool but others nearby look confused.");
        System.out.println("""
                1. Show them how to help.\
                
                2. Let them handle it and step aside.\
                
                3. Calmly assign tasks.\
                
                4. Command them to act fast.""");
        int Q4_1_1_3 = scan.nextInt();

        if (Q4_1_1_3 == 1){
            Brave++;
        } else if (Q4_1_1_3 == 2) {
            coward++;
        } else if (Q4_1_1_3 == 3) {
            calm++;
        } else if (Q4_1_1_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_1_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You're leading the effort but people are panicking.");
        System.out.println("""
                1. Shout instructions confidently.\
                
                2. Step back, unsure.\
                
                3. Calm everyone and proceed.\
                
                4. Push through even without them.""");
        int Q4_1_1_4 = scan.nextInt();

        if (Q4_1_1_4 == 1){
            Brave++;
        } else if (Q4_1_1_4 == 2) {
            coward++;
        } else if (Q4_1_1_4 == 3) {
            calm++;
        } else if (Q4_1_1_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_1_2_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Someone approaches to help.");
        System.out.println("""
                1. Welcome them and coordinate.\
                
                2. Walk away quietly.\
                
                3. Calmly update them on the situation.\
                
                4. Bark orders and take charge.""");
        int Q4_1_2_1 = scan.nextInt();

        if (Q4_1_2_1 == 1){
            Brave++;
        } else if (Q4_1_2_1 == 2) {
            coward++;
        } else if (Q4_1_2_1 == 3) {
            calm++;
        } else if (Q4_1_2_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_2_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The victim asks for you to stay.");
        System.out.println("""
                1. Reassure them.\
                
                2. Refuse and step away.\
                
                3. Sit beside them until help arrives.\
                
                4. Call others to assist loudly.""");
        int Q4_1_2_2 = scan.nextInt();

        if (Q4_1_2_2 == 1){
            Brave++;
        } else if (Q4_1_2_2 == 2) {
            coward++;
        } else if (Q4_1_2_2 == 3) {
            calm++;
        } else if (Q4_1_2_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_2_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You're unsure what to do next.");
        System.out.println("""
                1. Stay with the victim.\
                
                2. Back away slowly.\
                
                3. Wait calmly.\
                
                4. Take over the scene confidently.""");
        int Q4_1_2_3 = scan.nextInt();

        if (Q4_1_2_3 == 1){
            Brave++;
        } else if (Q4_1_2_3 == 2) {
            coward++;
        } else if (Q4_1_2_3 == 3) {
            calm++;
        } else if (Q4_1_2_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_2_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Crowd starts forming.");
        System.out.println("""
                1. Address them confidently.\
                
                2. Leave immediately.\
                
                3.Explain the situation clearly.\
                
                4. Get everyone into action.""");
        int Q4_1_2_4 = scan.nextInt();

        if (Q4_1_2_4 == 1){
            Brave++;
        } else if (Q4_1_2_4 == 2) {
            coward++;
        } else if (Q4_1_2_4 == 3) {
            calm++;
        } else if (Q4_1_2_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_1_3_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You calm the person.");
        System.out.println("""
                1. Assure them everything's fine.\
                
                2. Avoid further responsibility.\
                
                3. Let them speak.\
                
                4. Take full control.""");
        int Q4_1_3_1 = scan.nextInt();

        if (Q4_1_3_1 == 1){
            Brave++;
        } else if (Q4_1_3_1 == 2) {
            coward++;
        } else if (Q4_1_3_1 == 3) {
            calm++;
        } else if (Q4_1_3_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_3_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": They panic again.");
        System.out.println("""
                1. Hold their hand.\
                
                2. Step away.\
                
                3. Breathe with them.\
                
                4. Shout for help.""");
        int Q4_1_3_2 = scan.nextInt();

        if (Q4_1_3_2 == 1){
            Brave++;
        } else if (Q4_1_3_2 == 2) {
            coward++;
        } else if (Q4_1_3_2 == 3) {
            calm++;
        } else if (Q4_1_3_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_3_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Paramedics arrive.");
        System.out.println("""
                1. Guide them.\
                
                2. Leave quickly.\
                
                3. Brief them calmly.\
                
                4. Step up as the lead.""");
        int Q4_1_3_3 = scan.nextInt();

        if (Q4_1_3_3 == 1){
            Brave++;
        } else if (Q4_1_3_3 == 2) {
            coward++;
        } else if (Q4_1_3_3 == 3) {
            calm++;
        } else if (Q4_1_3_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_3_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": More people arrive.");
        System.out.println("""
                1. Organize them.\
                
                2. Slip out quietly.\
                
                3. Speak with everyone.\
                
                4. Bark orders.""");
        int Q4_1_3_4 = scan.nextInt();

        if (Q4_1_3_4 == 1){
            Brave++;
        } else if (Q4_1_3_4 == 2) {
            coward++;
        } else if (Q4_1_3_4 == 3) {
            calm++;
        } else if (Q4_1_3_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_1_4_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You're leading now.");
        System.out.println("""
                1. Motivate the team.\
                
                2. Let someone else take charge.\
                
                3. Speak steadily.\
                
                4. Rush to finish alone.""");
        int Q4_1_4_1 = scan.nextInt();

        if (Q4_1_4_1 == 1){
            Brave++;
        } else if (Q4_1_4_1 == 2) {
            coward++;
        } else if (Q4_1_4_1 == 3) {
            calm++;
        } else if (Q4_1_4_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_4_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": A volunteer refuses.");
        System.out.println("""
                1. Inspire them.\
                
                2. Ignore them.\
                
                3. Ask why calmly.\
                
                4. Replace them.""");
        int Q4_1_4_2 = scan.nextInt();

        if (Q4_1_4_2 == 1){
            Brave++;
        } else if (Q4_1_4_2 == 2) {
            coward++;
        } else if (Q4_1_4_2 == 3) {
            calm++;
        } else if (Q4_1_4_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_4_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Someone challenges your command.");
        System.out.println("""
                1. Explain.\
                
                2. Retreat.\
                
                3. Negotiate.\
                
                4. Assert dominance.""");
        int Q4_1_4_3 = scan.nextInt();

        if (Q4_1_4_3 == 1){
            Brave++;
        } else if (Q4_1_4_3 == 2) {
            coward++;
        } else if (Q4_1_4_3 == 3) {
            calm++;
        } else if (Q4_1_4_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_1_4_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": It's chaotic now.");
        System.out.println("""
                1. Take initiative.\
                
                2. Back off.\
                
                3. Bring order.\
                
                4. Push through chaos.""");
        int Q4_1_4_4 = scan.nextInt();

        if (Q4_1_4_4 == 1){
            Brave++;
        } else if (Q4_1_4_4 == 2) {
            coward++;
        } else if (Q4_1_4_4 == 3) {
            calm++;
        } else if (Q4_1_4_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_2_1_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You hear approaching footsteps.");
        System.out.println("""
                1. Prepare to confront.\
                
                2. Hide further.\
                
                3. Stay quiet and observe.\
                
                4. Yell to scare them.""");
        int Q4_2_1_1 = scan.nextInt();

        if (Q4_2_1_1 == 1){
            Brave++;
        } else if (Q4_2_1_1 == 2) {
            coward++;
        } else if (Q4_2_1_1 == 3) {
            calm++;
        } else if (Q4_2_1_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_1_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": It’s a friend.");
        System.out.println("""
                1. Hug them in relief.\
                
                2. Ask them to lead.\
                
                3. Discuss calmly.\
                
                4. Take them with you.""");
        int Q4_2_1_2 = scan.nextInt();

        if (Q4_2_1_2 == 1){
            Brave++;
        } else if (Q4_2_1_2 == 2) {
            coward++;
        } else if (Q4_2_1_2 == 3) {
            calm++;
        } else if (Q4_2_1_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_1_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": They seem nervous.");
        System.out.println("""
                1. Comfort them.\
                
                2. Keep hiding.\
                
                3. Ask what happened.\
                
                4. Tell them to act fast.""");
        int Q4_2_1_3 = scan.nextInt();

        if (Q4_2_1_3 == 1){
            Brave++;
        } else if (Q4_2_1_3 == 2) {
            coward++;
        } else if (Q4_2_1_3 == 3) {
            calm++;
        } else if (Q4_2_1_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_1_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You see the cause of the noise.");
        System.out.println("""
                1. Investigate.\
                
                2. Stay hidden.\
                
                3. Watch silently.\
                
                4. Chase it away.""");
        int Q4_2_1_4 = scan.nextInt();

        if (Q4_2_1_4 == 1){
            Brave++;
        } else if (Q4_2_1_4 == 2) {
            coward++;
        } else if (Q4_2_1_4 == 3) {
            calm++;
        } else if (Q4_2_1_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_2_2_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You’re asked to stay on the call.");
        System.out.println("""
                1. Describe surroundings.\
                
                2. Say you’re scared and hang up.\
                
                3. Explain details.\
                
                4. Shout for faster help.""");
        int Q4_2_2_1 = scan.nextInt();

        if (Q4_2_2_1 == 1){
            Brave++;
        } else if (Q4_2_2_1 == 2) {
            coward++;
        } else if (Q4_2_2_1 == 3) {
            calm++;
        } else if (Q4_2_2_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_2_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": They say help is coming.");
        System.out.println("""
                1. Wait with courage.\
                
                2. Leave early.\
                
                3. Sit down and breathe.\
                
                4. Prepare to act.""");
        int Q4_2_2_2 = scan.nextInt();

        if (Q4_2_2_2 == 1){
            Brave++;
        } else if (Q4_2_2_2 == 2) {
            coward++;
        } else if (Q4_2_2_2 == 3) {
            calm++;
        } else if (Q4_2_2_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_2_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You're still nervous.");
        System.out.println("""
                1. Face it anyway.\
                
                2. Stay still.\
                
                3. Focus on your breath.\
                
                4. Ready for anything.""");
        int Q4_2_2_3 = scan.nextInt();

        if (Q4_2_2_3 == 1){
            Brave++;
        } else if (Q4_2_2_3 == 2) {
            coward++;
        } else if (Q4_2_2_3 == 3) {
            calm++;
        } else if (Q4_2_2_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_2_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Noise intensifies.");
        System.out.println("""
                1. Move closer.\
                
                2. Run.\
                
                3. Stay composed.\
                
                4. Confront it.""");
        int Q4_2_2_4 = scan.nextInt();

        if (Q4_2_2_4 == 1){
            Brave++;
        } else if (Q4_2_2_4 == 2) {
            coward++;
        } else if (Q4_2_2_4 == 3) {
            calm++;
        } else if (Q4_2_2_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_2_3_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Child cries louder.");
        System.out.println("""
                1. Pick them up.\
                
                2. Stay hidden.\
                
                3. Approach gently.\
                
                4. Rush to them.""");
        int Q4_2_3_1 = scan.nextInt();

        if (Q4_2_3_1 == 1){
            Brave++;
        } else if (Q4_2_3_1 == 2) {
            coward++;
        } else if (Q4_2_3_1 == 3) {
            calm++;
        } else if (Q4_2_3_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_3_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": They scream when they see you.");
        System.out.println("""
                1. Calm them.\
                
                2. Back away.\
                
                3. Ask their name.\
                
                4. Tell them you’ll protect them.""");
        int Q4_2_3_2 = scan.nextInt();

        if (Q4_2_3_2 == 1){
            Brave++;
        } else if (Q4_2_3_2 == 2) {
            coward++;
        } else if (Q4_2_3_2 == 3) {
            calm++;
        } else if (Q4_2_3_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_3_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": They hug you.");
        System.out.println("""
                1. Smile and hug back.\
                
                2. Freeze awkwardly.\
                
                3. Guide them away.\
                
                4. Carry them proudly.""");
        int Q4_2_3_3 = scan.nextInt();

        if (Q4_2_3_3 == 1){
            Brave++;
        } else if (Q4_2_3_3 == 2) {
            coward++;
        } else if (Q4_2_3_3 == 3) {
            calm++;
        } else if (Q4_2_3_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_3_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": A figure appears.");
        System.out.println("""
                1. Stand your ground.\
                
                2. Run with the child.\
                
                3. Watch closely.\
                
                4. Protect the child boldly.""");
        int Q4_2_3_4 = scan.nextInt();

        if (Q4_2_3_4 == 1){
            Brave++;
        } else if (Q4_2_3_4 == 2) {
            coward++;
        } else if (Q4_2_3_4 == 3) {
            calm++;
        } else if (Q4_2_3_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_2_4_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You’re bleeding.");
        System.out.println("""
                1. Keep moving.\
                
                2. Lie down.\
                
                3. Tie a bandage.\
                
                4. Run again.""");
        int Q4_2_4_1 = scan.nextInt();

        if (Q4_2_4_1 == 1){
            Brave++;
        } else if (Q4_2_4_1 == 2) {
            coward++;
        } else if (Q4_2_4_1 == 3) {
            calm++;
        } else if (Q4_2_4_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_4_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Someone helps you up.");
        System.out.println("""
                1. Thank them.\
                
                2. Avoid eye contact.\
                
                3. Explain situation.\
                
                4. Tell them to run too.""");
        int Q4_2_4_2 = scan.nextInt();

        if (Q4_2_4_2 == 1){
            Brave++;
        } else if (Q4_2_4_2 == 2) {
            coward++;
        } else if (Q4_2_4_2 == 3) {
            calm++;
        } else if (Q4_2_4_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_4_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You reach a safe place.");
        System.out.println("""
                1. Rest.\
                
                2. Hide.\
                
                3. Sit quietly.\
                
                4. Plan next move.""");
        int Q4_2_4_3 = scan.nextInt();

        if (Q4_2_4_3 == 1){
            Brave++;
        } else if (Q4_2_4_3 == 2) {
            coward++;
        } else if (Q4_2_4_3 == 3) {
            calm++;
        } else if (Q4_2_4_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_2_4_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You're chased.");
        System.out.println("""
                1. Turn and fight.\
                
                2. Keep running.\
                
                3. Duck into a corner.\
                
                4. Lead them away.""");
        int Q4_2_4_4 = scan.nextInt();

        if (Q4_2_4_4 == 1){
            Brave++;
        } else if (Q4_2_4_4 == 2) {
            coward++;
        } else if (Q4_2_4_4 == 3) {
            calm++;
        } else if (Q4_2_4_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_3_1_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The friend is cornered.");
        System.out.println("""
                1. Step in and help.\
                
                2. Stay out of it.\
                
                3. Advise them calmly.\
                
                4. Run toward the threat.""");

        int Q4_3_1_1 = scan.nextInt();

        if (Q4_3_1_1 == 1){
            Brave++;
        } else if (Q4_3_1_1 == 2) {
            coward++;
        } else if (Q4_3_1_1 == 3) {
            calm++;
        } else if (Q4_3_1_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_1_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You yell, but they're not listening.");
        System.out.println("""
                1. Step closer.\
                
                2. Stay back.\
                
                3. Call their name again.\
                
                4. Grab their arm and move.""");

        int Q4_3_1_2 = scan.nextInt();

        if (Q4_3_1_2 == 1){
            Brave++;
        } else if (Q4_3_1_2 == 2) {
            coward++;
        } else if (Q4_3_1_2 == 3) {
            calm++;
        } else if (Q4_3_1_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_1_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Others are watching.");
        System.out.println("""
                1. Encourage them to help.\
                
                2. Avoid the crowd.\
                
                3. Talk things through.\
                
                4. Command them to act.""");

        int Q4_3_1_3 = scan.nextInt();

        if (Q4_3_1_3 == 1){
            Brave++;
        } else if (Q4_3_1_3 == 2) {
            coward++;
        } else if (Q4_3_1_3 == 3) {
            calm++;
        } else if (Q4_3_1_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_1_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": A teacher arrives.");
        System.out.println("""
                1. Speak honestly.\
                
                2. Stay quiet.\
                
                3. Let them talk first.\
                
                4. Take charge of explaining.""");

        int Q4_3_1_4 = scan.nextInt();

        if (Q4_3_1_4 == 1){
            Brave++;
        } else if (Q4_3_1_4 == 2) {
            coward++;
        } else if (Q4_3_1_4 == 3) {
            calm++;
        } else if (Q4_3_1_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_3_2_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": One gets hit.");
        System.out.println("""
                1. Step in.\
                
                2. Run to get help.\
                
                3. Watch carefully.\
                
                4.Grab the attacker.""");

        int Q4_3_2_1 = scan.nextInt();

        if (Q4_3_2_1 == 1){
            Brave++;
        } else if (Q4_3_2_1 == 2) {
            coward++;
        } else if (Q4_3_2_1 == 3) {
            calm++;
        } else if (Q4_3_2_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_2_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": People are shocked.");
        System.out.println("""
                1. Ask someone to call help.\
                
                2. Back away.\
                
                3. Calm them down.\
                
                4.Take full control.""");

        int Q4_3_2_2 = scan.nextInt();

        if (Q4_3_2_2 == 1){
            Brave++;
        } else if (Q4_3_2_2 == 2) {
            coward++;
        } else if (Q4_3_2_2 == 3) {
            calm++;
        } else if (Q4_3_2_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_2_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The attacker runs.");
        System.out.println("""
                1. Chase.\
                
                2. Stay behind.\
                
                3. Check on the injured.\
                
                4. Rally others to follow.""");

        int Q4_3_2_3 = scan.nextInt();

        if (Q4_3_2_3 == 1){
            Brave++;
        } else if (Q4_3_2_3 == 2) {
            coward++;
        } else if (Q4_3_2_3 == 3) {
            calm++;
        } else if (Q4_3_2_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_2_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": One friend starts crying.");
        System.out.println("""
                1. Comfort them.\
                
                2. Leave them be.\
                
                3. Sit quietly with them.\
                
                4. Demand their attention.""");

        int Q4_3_2_4 = scan.nextInt();

        if (Q4_3_2_4 == 1){
            Brave++;
        } else if (Q4_3_2_4 == 2) {
            coward++;
        } else if (Q4_3_2_4 == 3) {
            calm++;
        } else if (Q4_3_2_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_3_3_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You're called a hero.");
        System.out.println("""
                1. Smile and thank them.\
                
                2. Say it's not true.\
                
                3. Stay humble.\
                
                4. Correct them confidently.""");

        int Q4_3_3_1 = scan.nextInt();

        if (Q4_3_3_1 == 1){
            Brave++;
        } else if (Q4_3_3_1 == 2) {
            coward++;
        } else if (Q4_3_3_1 == 3) {
            calm++;
        } else if (Q4_3_3_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_3_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You feel shaken.");
        System.out.println("""
                1. Breathe deeply.\
                
                2. Run away.\
                
                3. Meditate silently.\
                
                4. Tell yourself to toughen up.""");

        int Q4_3_3_2 = scan.nextInt();

        if (Q4_3_3_2 == 1){
            Brave++;
        } else if (Q4_3_3_2 == 2) {
            coward++;
        } else if (Q4_3_3_2 == 3) {
            calm++;
        } else if (Q4_3_3_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_3_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": A reporter wants to interview you.");
        System.out.println("""
                1. Share the story.\
                
                2. Decline and leave.\
                
                3. Speak thoughtfully.\
                
                4. Take the spotlight.""");

        int Q4_3_3_3 = scan.nextInt();

        if (Q4_3_3_3 == 1){
            Brave++;
        } else if (Q4_3_3_3 == 2) {
            coward++;
        } else if (Q4_3_3_3 == 3) {
            calm++;
        } else if (Q4_3_3_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_3_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You see it all on the news.");
        System.out.println("""
                1. Explain what happened to family.\
                
                2. Stay silent.\
                
                3. Just observe quietly.\
                
                4. Smile with pride.""");

        int Q4_3_3_4 = scan.nextInt();

        if (Q4_3_3_4 == 1){
            Brave++;
        } else if (Q4_3_3_4 == 2) {
            coward++;
        } else if (Q4_3_3_4 == 3) {
            calm++;
        } else if (Q4_3_3_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_3_4_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Another fight starts.");
        System.out.println("""
                1. Intervene again.\
                
                2. Avoid this one.\
                
                3. Call for supervision.\
                
                4. Break it up aggressively.""");

        int Q4_3_4_1 = scan.nextInt();

        if (Q4_3_4_1 == 1){
            Brave++;
        } else if (Q4_3_4_1 == 2) {
            coward++;
        } else if (Q4_3_4_1 == 3) {
            calm++;
        } else if (Q4_3_4_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_4_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Someone says it was your fault");
        System.out.println("""
                1. Defend yourself calmly.\
                
                2. Say nothing.\
                
                3. Hear them out.\
                
                4. Shout back.""");

        int Q4_3_4_2 = scan.nextInt();

        if (Q4_3_4_2 == 1){
            Brave++;
        } else if (Q4_3_4_2 == 2) {
            coward++;
        } else if (Q4_3_4_2 == 3) {
            calm++;
        } else if (Q4_3_4_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_4_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The teacher sides with the other person.");
        System.out.println("""
                1. Plead your case.\
                
                2. Give up.\
                
                3. Stay composed.\
                
                4. Stand firm loudly.""");

        int Q4_3_4_3 = scan.nextInt();

        if (Q4_3_4_3 == 1){
            Brave++;
        } else if (Q4_3_4_3 == 2) {
            coward++;
        } else if (Q4_3_4_3 == 3) {
            calm++;
        } else if (Q4_3_4_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_3_4_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You're suspended.");
        System.out.println("""
                1. Accept and move forward.\
                
                2. Feel defeated.\
                
                3. Reflect silently.\
                
                4. Plan to return stronger.""");

        int Q4_3_4_4 = scan.nextInt();

        if (Q4_3_4_4 == 1){
            Brave++;
        } else if (Q4_3_4_4 == 2) {
            coward++;
        } else if (Q4_3_4_4 == 3) {
            calm++;
        } else if (Q4_3_4_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }


    public static void Q4_4_1_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The dog lunges at someone else.");
        System.out.println("""
                1. Pull it away.\
                
                2. Back off.\
                
                3. Calmly call it.\
                
                4. Wrestle it down.""");

        int Q4_4_1_1 = scan.nextInt();

        if (Q4_4_1_1 == 1){
            Brave++;
        } else if (Q4_4_1_1 == 2) {
            coward++;
        } else if (Q4_4_1_1 == 3) {
            calm++;
        } else if (Q4_4_1_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_1_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": It’s barking loudly.");
        System.out.println("""
                1. Distract it.\
                
                2. Walk slowly backward.\
                
                3. Talk softly.\
                
                4. Roar to assert control.""");

        int Q4_4_1_2 = scan.nextInt();

        if (Q4_4_1_2 == 1){
            Brave++;
        } else if (Q4_4_1_2 == 2) {
            coward++;
        } else if (Q4_4_1_2 == 3) {
            calm++;
        } else if (Q4_4_1_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_1_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The owner appears.");
        System.out.println("""
                1. Apologize and explain.\
                
                2. Stay silent.\
                
                3. Speak calmly.\
                
                4. Confront them.""");

        int Q4_4_1_3 = scan.nextInt();

        if (Q4_4_1_3 == 1){
            Brave++;
        } else if (Q4_4_1_3 == 2) {
            coward++;
        } else if (Q4_4_1_3 == 3) {
            calm++;
        } else if (Q4_4_1_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_1_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You’re praised for your actions.");
        System.out.println("""
                1. Accept graciously.\
                
                2. Shrug it off.\
                
                3. Smile quietly.\
                
                4. Say it was nothing.""");

        int Q4_4_1_4 = scan.nextInt();

        if (Q4_4_1_4 == 1){
            Brave++;
        } else if (Q4_4_1_4 == 2) {
            coward++;
        } else if (Q4_4_1_4 == 3) {
            calm++;
        } else if (Q4_4_1_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_4_2_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": The kid runs.");
        System.out.println("""
                1. Follow.\
                
                2. Stay frozen.\
                
                3. Watch carefully.\
                
                4. Call out confidently.""");

        int Q4_4_2_1 = scan.nextInt();

        if (Q4_4_2_1 == 1){
            Brave++;
        } else if (Q4_4_2_1 == 2) {
            coward++;
        } else if (Q4_4_2_1 == 3) {
            calm++;
        } else if (Q4_4_2_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_2_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You hear shouting.");
        System.out.println("""
                1. Investigate.\
                
                2. Walk away.\
                
                3. Pause and listen.\
                
                4. Rush toward it.""");

        int Q4_4_2_2 = scan.nextInt();

        if (Q4_4_2_2 == 1){
            Brave++;
        } else if (Q4_4_2_2 == 2) {
            coward++;
        } else if (Q4_4_2_2 == 3) {
            calm++;
        } else if (Q4_4_2_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_2_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": A bystander asks if you're okay.");
        System.out.println("""
                1. Say yes and check others.\
                
                2. Avoid the conversation.\
                
                3. Nod quietly.\
                
                4. Ask them to help.""");

        int Q4_4_2_3 = scan.nextInt();

        if (Q4_4_2_3 == 1){
            Brave++;
        } else if (Q4_4_2_3 == 2) {
            coward++;
        } else if (Q4_4_2_3 == 3) {
            calm++;
        } else if (Q4_4_2_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_2_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": A stranger joins in.");
        System.out.println("""
                1. Coordinate with them.\
                
                2. Leave.\
                
                3. Explain the situation.\
                
                4. Give orders.""");

        int Q4_4_2_4 = scan.nextInt();

 

        if (Q4_4_2_4 == 1){
            Brave++;
        } else if (Q4_4_2_4 == 2) {
            coward++;
        } else if (Q4_4_2_4 == 3) {
            calm++;
        } else if (Q4_4_2_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_4_3_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Someone films you.");
        System.out.println("""
                1. Ask them to stop.\
                
                2. Hide your face.\
                
                3. Ignore them.\
                
                4. Speak to the camera.""");

        int Q4_4_3_1 = scan.nextInt();

        if (Q4_4_3_1 == 1){
            Brave++;
        } else if (Q4_4_3_1 == 2) {
            coward++;
        } else if (Q4_4_3_1 == 3) {
            calm++;
        } else if (Q4_4_3_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_3_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You're trending online.");
        System.out.println("""
                1. Clarify your intent.\
                
                2. Disable your account.\
                
                3. Say nothing.\
                
                4. Embrace the fame.""");

        int Q4_4_3_2 = scan.nextInt();

        if (Q4_4_3_2 == 1){
            Brave++;
        } else if (Q4_4_3_2 == 2) {
            coward++;
        } else if (Q4_4_3_2 == 3) {
            calm++;
        } else if (Q4_4_3_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_3_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": You're invited to speak publicly.");
        System.out.println("""
                1. Accept with care.\
                
                2. Decline shyly.\
                
                3. Prepare thoughtfully.\
                
                4. Own the stage.""");

        int Q4_4_3_3 = scan.nextInt();

        if (Q4_4_3_3 == 1){
            Brave++;
        } else if (Q4_4_3_3 == 2) {
            coward++;
        } else if (Q4_4_3_3 == 3) {
            calm++;
        } else if (Q4_4_3_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_3_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Someone misquotes you.");
        System.out.println("""
                1. Correct them respectfully.\
                
                2. Ignore it.\
                
                3. Respond calmly.\
                
                4. Fire back boldly.""");

        int Q4_4_3_4 = scan.nextInt();

        if (Q4_4_3_4 == 1){
            Brave++;
        } else if (Q4_4_3_4 == 2) {
            coward++;
        } else if (Q4_4_3_4 == 3) {
            calm++;
        } else if (Q4_4_3_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }

    public static void Q4_4_4_1(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": Police arrive.");
        System.out.println("""
                1. Step forward to explain.\
                
                2. Stay hidden.\
                
                3. Wait to be called.\
                
                4. Take control of the briefing.""");

        int Q4_4_4_1 = scan.nextInt();

        if (Q4_4_4_1 == 1){
            Brave++;
        } else if (Q4_4_4_1 == 2) {
            coward++;
        } else if (Q4_4_4_1 == 3) {
            calm++;
        } else if (Q4_4_4_1 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_4_2(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": They ask for your name.");
        System.out.println("""
                1. Give it.\
                
                2. Say you forgot.\
                
                3. Speak softly.\
                
                4. Declare it proudly.""");

        int Q4_4_4_2 = scan.nextInt();

        if (Q4_4_4_2 == 1){
            Brave++;
        } else if (Q4_4_4_2 == 2) {
            coward++;
        } else if (Q4_4_4_2 == 3) {
            calm++;
        } else if (Q4_4_4_2 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_4_3(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": They say you're a suspect.");
        System.out.println("""
                1. Ask to speak.\
                
                2. Stay silent.\
                
                3. Clarify politely.\
                
                4. Challenge it.""");

        int Q4_4_4_3 = scan.nextInt();

        if (Q4_4_4_3 == 1){
            Brave++;
        } else if (Q4_4_4_3 == 2) {
            coward++;
        } else if (Q4_4_4_3 == 3) {
            calm++;
        } else if (Q4_4_4_3 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void Q4_4_4_4(int Q, int Brave, int coward, int calm, int fearless, String Run, Scanner scan){
        System.out.println("\nQ"+Q+": They thank you and leave.");
        System.out.println("""
                1. Smile in relief.\
                
                2. Say nothing.\
                
                3. Nod respectfully.\
                
                4. Offer more help.""");

        int Q4_4_4_4 = scan.nextInt();

        if (Q4_4_4_4 == 1){
            Brave++;
        } else if (Q4_4_4_4 == 2) {
            coward++;
        } else if (Q4_4_4_4 == 3) {
            calm++;
        } else if (Q4_4_4_4 == 4) {
            fearless++;
        }else {
            System.out.println("option not available.");
        }
        exit(Brave, coward, calm, fearless, Run);
    }
    public static void exit(int Brave, int coward, int calm, int fearless, String Run){
        Total.Result(Brave, coward, calm, fearless, Run);
    }
}
