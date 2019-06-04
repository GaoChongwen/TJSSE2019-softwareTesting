package tongji.sse.student.domain;

public class CourseExamination {
    private Integer userId;

    private Integer courseId;

    private String section;

    private String examType;

    private Integer score;

    public CourseExamination(Integer userId, Integer courseId, String section, String examType, Integer score) {
        this.userId = userId;
        this.courseId = courseId;
        this.section = section;
        this.examType = examType;
        this.score = score;
    }

    public CourseExamination() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section == null ? null : section.trim();
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType == null ? null : examType.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}