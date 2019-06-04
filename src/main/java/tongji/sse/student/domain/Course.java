package tongji.sse.student.domain;

import org.bcos.web3j.abi.datatypes.Int;

import javax.persistence.Transient;

public class Course {
    private Integer id;

    private String name;

    private String language;

    private Integer major;

    private String comment;

    private String examinationType;

    private String scoreRules;

    private String campus;

    private String courseType;

    private String schedule;

    private Integer courseHour;

    private Integer credits;

    private Integer semesterId;

    private Integer teacherUserId;

    private Integer teacherCollegeId;

    private String day;

    private String dayTime;

    @Transient
    private String teacherName;
    @Transient
    private Double score;

    public Course(Integer id, String name, String language, Integer major, String comment, String examinationType, String scoreRules, String campus, String courseType, String schedule, Integer courseHour, Integer credits, Integer semesterId, Integer teacherUserId, Integer teacherCollegeId, String day, String dayTime) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.major = major;
        this.comment = comment;
        this.examinationType = examinationType;
        this.scoreRules = scoreRules;
        this.campus = campus;
        this.courseType = courseType;
        this.schedule = schedule;
        this.courseHour = courseHour;
        this.credits = credits;
        this.semesterId = semesterId;
        this.teacherUserId = teacherUserId;
        this.teacherCollegeId = teacherCollegeId;
        this.day = day;
        this.dayTime = dayTime;
    }

    public Course() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getExaminationType() {
        return examinationType;
    }

    public void setExaminationType(String examinationType) {
        this.examinationType = examinationType == null ? null : examinationType.trim();
    }

    public String getScoreRules() {
        return scoreRules;
    }

    public void setScoreRules(String scoreRules) {
        this.scoreRules = scoreRules == null ? null : scoreRules.trim();
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus == null ? null : campus.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule == null ? null : schedule.trim();
    }

    public Integer getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(Integer courseHour) {
        this.courseHour = courseHour;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Integer getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Integer semesterId) {
        this.semesterId = semesterId;
    }


    public Integer getTeacherCollegeId() {
        return teacherCollegeId;
    }

    public Integer getTeacherUserId() {
        return teacherUserId;
    }

    public void setTeacherCollegeId(Integer teacherCollegeId) {
        this.teacherCollegeId = teacherCollegeId;
    }

    public void setTeacherUserId(Integer teacherUserId) {
        this.teacherUserId = teacherUserId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }


    @Transient
    public String getTeacherName() {
        return teacherName;
    }
    @Transient
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    @Transient
    public Double getScore() {
        return score;
    }
    @Transient
    public void setScore(Double score) {
        this.score = score;
    }
}