package tongji.sse.student.domain;

public class StudentInClasses {
    private Integer studentUserId;

    private Integer classesId;

    private Integer classesCollegeId;

    public StudentInClasses(Integer studentUserId, Integer classesId, Integer classesCollegeId) {
        this.studentUserId = studentUserId;
        this.classesId = classesId;
        this.classesCollegeId = classesCollegeId;
    }

    public StudentInClasses() {
        super();
    }

    public Integer getStudentUserId() {
        return studentUserId;
    }

    public void setStudentUserId(Integer studentUserId) {
        this.studentUserId = studentUserId;
    }

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    public Integer getClassesCollegeId() {
        return classesCollegeId;
    }

    public void setClassesCollegeId(Integer classesCollegeId) {
        this.classesCollegeId = classesCollegeId;
    }
}