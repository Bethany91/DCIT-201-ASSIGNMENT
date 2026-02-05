public class Question2 {
    public double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }
    public double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    public double calculateClassAverage(double[] scores) {
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }
        return total / scores.length;
    }
}


