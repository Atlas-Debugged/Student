
package student;

/**
 * *comments
 * Added comments to demonstrate pull
 Today is January 24 2023
 * @author Altyn
 */
public class Student {
    
    private String studentId;
    private String studentName;
    private String address;

    public String getAddress() {
        return address;
    }
    

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
}
