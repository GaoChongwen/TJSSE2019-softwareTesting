package tongji.sse.student.domain;

public class UserStudyCourse {
    private Integer userId;

    private Integer courseId;

    private Double score;

    public UserStudyCourse(Integer userId, Integer courseId, Double score) {
        this.userId = userId;
        this.courseId = courseId;
        this.score = score;
    }

    public UserStudyCourse() {
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}