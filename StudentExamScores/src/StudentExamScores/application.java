package StudentExamScores;

public class StudentExamAnalyzer {
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
 
    public static int findHighestScore(int[] scores) {
        int maxScore = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        return maxScore;
    }
 
    
public class application {
	public static void main(String[] args) {
        int[] examScores = {85, 90, 92, 78, 88};
        double average = calculateAverage(examScores);
        int highestScore = findHighestScore(examScores);
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highestScore);
    }
}


