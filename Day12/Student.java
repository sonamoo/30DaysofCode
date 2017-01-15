class Student extends Person{
	private int[] testScores;
  
    public Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    public char calculate() {
        double scoreSum = 0;
        double avgGrade;
        
        for (int i = 0; i < testScores.length; i++) {
            scoreSum += testScores[i];
        }
        avgGrade = scoreSum / testScores.length;
        if (avgGrade <= 100 && avgGrade >= 90) {
            return 'O';
        }
        else if (avgGrade < 90 && avgGrade >= 80) {
            return 'E';
        }
        else if (avgGrade < 80 && avgGrade >= 70) {
            return 'A';
        }
        else if (avgGrade < 70 && avgGrade >= 55) {
            return 'P';
        }
        else if (avgGrade < 55 && avgGrade >= 40) {
            return 'D';
        }
        else {
            return 'T';
        }
           
    }
}