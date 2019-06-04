package tongji.sse.student.domain;

public class Experience {
    private Integer id;
    private Integer userId;

    private String name;

    private String detail;

    private String certificate;

    private Integer status;

    private String type;

    public Experience(Integer id, Integer userId, String name, String detail, String certificate, Integer status, String type) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.detail = detail;
        this.certificate = certificate;
        this.status = status;
        this.type = type;

    }



    public Experience() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}