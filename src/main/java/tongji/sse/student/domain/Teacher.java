package tongji.sse.student.domain;

public class Teacher {
    private Integer userId;

    private Integer collegeId;

    private Integer teacherNumber;

    private Integer gender;

    private String age;

    private String identityNumber;

    private String title;

    public Teacher(Integer userId, Integer collegeId, Integer teacherNumber, Integer gender, String age, String identityNumber, String title) {
        this.userId = userId;
        this.collegeId = collegeId;
        this.teacherNumber = teacherNumber;
        this.gender = gender;
        this.age = age;
        this.identityNumber = identityNumber;
        this.title = title;
    }

    public Teacher() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(Integer teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber == null ? null : identityNumber.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}