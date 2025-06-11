public class LargestScore {
    public static void main(String[] args) {
        int score1 = 85;
        int score2 = 67;
        int score3 = 92;
        int largest;

        if (score1 >= score2 && score1 >= score3) {
            largest = score1;
        } else if (score2 >= score1 && score2 >= score3) {
            largest = score2;
        } else {
            largest = score3;
        }

        System.out.println("The highest score is: " + largest);
    }
}