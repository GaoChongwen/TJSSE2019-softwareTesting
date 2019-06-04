package tongji.sse.student.domain;

public class Classes {
    private Integer id;

    private Integer collegeId;

    private String major;

    private String classNumber;

    public Classes(Integer id, Integer collegeId, String major, String classNumber) {
        this.id = id;
        this.collegeId = collegeId;
        this.major = major;
        this.classNumber = classNumber;
    }

    public Classes() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber == null ? null : classNumber.trim();
    }
}