public class gradeCalculation {
    public static void main(String[] args) {
        int eng = 78;
        int odia = 75;
        int phy = 85;
        int chem = 69;
        int math = 75;
        int bio = 89;
        int total = eng + odia + phy + chem + math + bio;
        int percentage = (int) total / 6;
        // System.out.println(total);
        // System.out.println(percentage);

        char grade = 'X';

        if (percentage >= 90 && percentage <= 100) {
            grade = 'O';
        } else if (percentage >= 80 && percentage <= 89) {
            grade = 'A';
        } else if (percentage >= 70 && percentage <= 79) {
            grade = 'B';
        } else if (percentage >= 60 && percentage <= 69) {
            grade = 'C';
        } else if (percentage >= 50 && percentage <= 59) {
            grade = 'D';
        } else if (percentage >= 40 && percentage <= 49) {
            grade = 'E';
        } else if (percentage <= 30) {
            grade = 'F';
        }
        System.out.println(grade);
    }
}