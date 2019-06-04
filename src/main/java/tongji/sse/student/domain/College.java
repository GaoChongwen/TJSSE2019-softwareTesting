package tongji.sse.student.domain;

public class College {
    private Integer id;

    private String address;

    private String email;

    private String homePage;

    private Integer establishedDate;

    private String departmentHead;

    private String contact;

    public College(Integer id, String address, String email, String homePage, Integer establishedDate, String departmentHead, String contact) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.homePage = homePage;
        this.establishedDate = establishedDate;
        this.departmentHead = departmentHead;
        this.contact = contact;
    }

    public College() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage == null ? null : homePage.trim();
    }

    public Integer getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(Integer establishedDate) {
        this.establishedDate = establishedDate;
    }

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead == null ? null : departmentHead.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }
}