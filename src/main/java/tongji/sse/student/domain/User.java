package tongji.sse.student.domain;

public class User {
    private Integer id;

    private String phone;

    private String username;

    private String password;

    private String email;

    private Integer userType;

    private String instituteCode;

    private Integer instituteId;

    public User(Integer id, String phone, String username, String password, String email, Integer userType, String instituteCode, Integer instituteId) {
        this.id = id;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.email = email;
        this.userType = userType;
        this.instituteCode = instituteCode;
        this.instituteId = instituteId;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getInstituteCode() {
        return instituteCode;
    }

    public void setInstituteCode(String instituteCode) {
        this.instituteCode = instituteCode == null ? null : instituteCode.trim();
    }

    public Integer getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(Integer instituteId) {
        this.instituteId = instituteId;
    }
}