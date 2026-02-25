class Q5 {
    public static void main(String[] args) {
        
        // Create variables for the number of pens and number of students
        int totalPens = 14;
        int numberOfStudents = 3;
        
        // Use Division Operator to find the Quantity of pens per student
        int pensPerStudent = totalPens / numberOfStudents;
        
        // Use Modulus Operator (%) to find the remaining non-distributed pens
        int remainingPens = totalPens % numberOfStudents;
        
        // Display the results following the required O/P format
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}