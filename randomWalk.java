public class randomWalk {

    
    public static void main(String[] args) {
        
    }
    private static String storage = "";
    private static  int time = 0;
    public static void algo(int n) {
        if (time == 50) {
            return;
        }
        time++;
        n = (int) (Math.random()*2);
        int curr = 0;
        int count = 0;
        while (!(curr == 4) || !(curr == -4)) {
            if (n == 1) {
                curr++;
            }
            else {
                curr--;
            }
            count++;
            n = (int) (Math.random()*2);
        }
        storage = storage + " " + count;
        algo(n);
    }
    
}
