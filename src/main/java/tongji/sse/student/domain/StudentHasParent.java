package tongji.sse.student.domain;

public class StudentHasParent {
    private Integer studentUserId;

    private Integer parentId;

    private String relationship;

    public StudentHasParent(Integer studentUserId, Integer parentId, String relationship) {
        this.studentUserId = studentUserId;
        this.parentId = parentId;
        this.relationship = relationship;
    }

    public StudentHasParent() {
        super();
    }

    public Integer getStudentUserId() {
        return studentUserId;
    }

    public void setStudentUserId(Integer studentUserId) {
        this.studentUserId = studentUserId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }
}