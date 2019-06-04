package tongji.sse.student.domain;

public class CourseHasMaterial {
    private Integer courseId;

    private Integer materialId;

    public CourseHasMaterial(Integer courseId, Integer materialId) {
        this.courseId = courseId;
        this.materialId = materialId;
    }

    public CourseHasMaterial() {
        super();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }
}