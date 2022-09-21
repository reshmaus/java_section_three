public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

        //one of the condition has to be true
        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")){
            System.out.println(" congratulations, you got the scholarship");
        }else {
            System.out.println("we're sorry, you didn't get the scholarship");
        }

        int credits = 56;
        double GPA = 1.4;

        //BOth condition should be true
        if (credits >= 40 && GPA >= 2.0){
            System.out.println("You earned your diploma!");
        }else{
            System.out.println("sorry, you need least 40 credits and a minimum GPA of 2.0");
        }
    }
}
