public class Total {
    public static void Result(int Brave, int coward, int calm, int fearless, String Run){
        float BraveP = (float) (Brave * 100) /4;
        float cowardP = (float) (coward * 100) /4;
        float calmP = (float) (calm * 100) /4;
        float fearlessP = (float) (fearless * 100) /4;

        System.out.println("\nBrave = " + BraveP + "%");
        System.out.println("coward = " + cowardP + "%");
        System.out.println("calm = " + calmP + "%");
        System.out.println("fearless = " + fearlessP + "%");

        int ShowRun = 0;

        if (ShowRun == 1){
            System.out.println("Program Ended on " + Run);
        }
    }
}
