package tongji.sse.student.domain;


import javax.persistence.Transient;

public class Student {
    private Integer userId;

    private String studentNumber;

    private Integer gender;

    private Integer age;

    private String studentStatus;

    private String nationality;

    private String bloodType;

    private String region;

    private String belief;

    private Double gpa;

    private String avator;

    private String nation;

    private String recruitWay;

    private Integer commitYear;

    private String identityNumber;

    private String permanentAddress;

    private String currentAddress;

    private Integer collegeId;

    @Transient
    private String name;

    public Student(Integer userId, String studentNumber, Integer gender, Integer age, String studentStatus, String nationality, String bloodType, String region, String belief, Double gpa, String avator, String nation, String recruitWay, Integer commitYear, String identityNumber, String permanentAddress, String currentAddress, Integer collegeId) {
        this.userId = userId;
        this.studentNumber = studentNumber;
        this.gender = gender;
        this.age = age;
        this.studentStatus = studentStatus;
        this.nationality = nationality;
        this.bloodType = bloodType;
        this.region = region;
        this.belief = belief;
        this.gpa = gpa;
        this.avator = avator;
        this.nation = nation;
        this.recruitWay = recruitWay;
        this.commitYear = commitYear;
        this.identityNumber = identityNumber;
        this.permanentAddress = permanentAddress;
        this.currentAddress = currentAddress;
        this.collegeId = collegeId;
    }

    public Student() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber == null ? null : studentNumber.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus == null ? null : studentStatus.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType == null ? null : bloodType.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getBelief() {
        return belief;
    }

    public void setBelief(String belief) {
        this.belief = belief == null ? null : belief.trim();
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator == null ? null : avator.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getRecruitWay() {
        return recruitWay;
    }

    public void setRecruitWay(String recruitWay) {
        this.recruitWay = recruitWay == null ? null : recruitWay.trim();
    }

    public Integer getCommitYear() {
        return commitYear;
    }

    public void setCommitYear(Integer commitYear) {
        this.commitYear = commitYear;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber == null ? null : identityNumber.trim();
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress == null ? null : permanentAddress.trim();
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress == null ? null : currentAddress.trim();
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    @Transient
    public void setName(String name) {
        this.name = name;
    }
    @Transient
    public String getName() {
        return name;
    }
}