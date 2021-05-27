public class FlourPacker {
    
    public static boolean canPack( int bigCount, int smallCount, int goal) {
        
        // bigCount is # of 5kg bags
        // smallCount is # of 1kg bags
        // goal is number of kilos required

        if (bigCount <0 || smallCount < 0 || goal < 0) {
            return false;
        }

        while (goal>0) {
            if (goal-5 >= 0 && bigCount > 0) {
                goal-=5;
                bigCount--;
            } else if (goal-1 >= 0 && smallCount > 0){
                goal--;
                smallCount--;
            } else {
                return false;
            }
        }

        return true;
    }
}
