public class Question1 {
    public static void executeGradeReport(double[] score) {
        boolean isValid = validateScore(score);
        
        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }
        char grade = calculateLetterGrade(score);

        displayPerformanceMessage(grade);
    }
}
