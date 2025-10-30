public class Walking {
    public static void main(String[] args) {
        String memo = "";
        int numMemo = 0;
        
        for (int i = 0; i <= 50; i++) {
            int curr = 0;
            int time = 0;
            while (curr != -4 && curr != 4) {
                int step = (int) (Math.random() * 2);
                if (step == 1) {
                    curr++;
                }
                else {
                    curr--;
                }
                time++;
            }
            memo = memo + "\n Trial "+i+" took "+time+" steps";
            numMemo += time;
        }
        System.out.println(memo);
        System.out.println("Average is: "+ (int) numMemo/50);
    }
    
}
