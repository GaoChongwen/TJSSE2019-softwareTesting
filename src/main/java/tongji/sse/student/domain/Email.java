package tongji.sse.student.domain;

public class Email {
    private Integer userIdSent;

    private Integer userIdRecive;

    private Integer id;

    private String title;

    private String content;

    private Integer status;

    public Email(Integer userIdSent, Integer userIdRecive, Integer id, String title, String content, Integer status) {
        this.userIdSent = userIdSent;
        this.userIdRecive = userIdRecive;
        this.id = id;
        this.title = title;
        this.content = content;
        this.status = status;
    }

    public Email() {
        super();
    }

    public Integer getUserIdSent() {
        return userIdSent;
    }

    public void setUserIdSent(Integer userIdSent) {
        this.userIdSent = userIdSent;
    }

    public Integer getUserIdRecive() {
        return userIdRecive;
    }

    public void setUserIdRecive(Integer userIdRecive) {
        this.userIdRecive = userIdRecive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}