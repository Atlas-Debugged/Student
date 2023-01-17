
package student;

/**
 *
 * @author altyn
 */
public class StudentList {
    public static void main(String[] args){
       // Student s1 = new Student("s1","Altyn");
        Student[] studentList = new Student [3];
        studentList[0] = new Student("s1","Altyn");
        studentList[1] = new Student("s2","Bob");
        studentList[2] = new Student("s3","Jimmy");
        
        for(int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
        }
        
    }//end of main 
    }//end of class 
