package tongji.sse.student.domain;

import java.util.Date;

public class Examination {
    private Integer courseId;

    private Date date;

    private String arrangement;

    private String place;

    private String infomation;

    private String comment;

    public Examination(Integer courseId, Date date, String arrangement, String place, String infomation, String comment) {
        this.courseId = courseId;
        this.date = date;
        this.arrangement = arrangement;
        this.place = place;
        this.infomation = infomation;
        this.comment = comment;
    }

    public Examination() {
        super();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getArrangement() {
        return arrangement;
    }

    public void setArrangement(String arrangement) {
        this.arrangement = arrangement == null ? null : arrangement.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation == null ? null : infomation.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}