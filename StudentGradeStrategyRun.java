/**Some students take a class for a grade, others take the class pass/fail
 * how do we accommodate this scenario yet still keep some flexibility for
 * additional types of grading methods in the future? The answer is using 
 * Java interfaces, of course!
 *
 
EXAMPLE OUTPUT FROM RUN:

NAME	GRADE	DISTRIBUTION
Kelly	78	C
Tommy	50	Fail
Chuck	92	A
Sarah	85	Pass 
* 
*/



import java.util.ArrayList;

public class StudentGradeStrategyRun {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();
        
        //TODO: Add 4 students with appropriate name, grades & strategies to the students collection
        students.add(new Student("Kelly", 78, new LetterGradeStrategy()));
        students.add(new Student("Tommy", 50, new PassFailStrategy()));
        students.add(new Student("Chuck", 92, new LetterGradeStrategy()));
        students.add(new Student("Sarah", 85, new PassFailStrategy()));
        
        //TODO: Print out names, grade, and distribution looping over the collection
        System.out.println("NAME\tGRADE\tDISTRIBUTION\n");
        for(Student s : students)
        {
           System.out.printf("%s\t%d\t%s\n", s.getName(), s.getGrade(), s.getDistribution());
        
        }
    }
}
