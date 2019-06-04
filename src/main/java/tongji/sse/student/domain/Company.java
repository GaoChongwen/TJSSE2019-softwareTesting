package tongji.sse.student.domain;

public class Company {
    private String description;

    private Integer userId;

    private String companyCode;

    public Company(String description, Integer userId, String companyCode) {
        this.description = description;
        this.userId = userId;
        this.companyCode = companyCode;
    }

    public Company() {
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }
}