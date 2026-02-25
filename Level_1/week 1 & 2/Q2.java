class Q2 {
    public static void main(String[] args) {
        
        // Create a string variable name and assign value Sam
        String name = "Sam";
        
        // Create int variables for marks in Maths, Physics, and Chemistry out of 100 
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        
        // Create a variable for the number of subjects 
        int numberOfSubjects = 3;
        
        // Calculate the total marks 
        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        
        // Calculate the average mark. Using double to ensure precision 
        double averageMark = (double) totalMarks / numberOfSubjects;
        
        // Display the result following the required O/P format 
        System.out.println(name + "’s average mark in PCM is " + averageMark);
    }
}