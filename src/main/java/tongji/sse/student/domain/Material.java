package tongji.sse.student.domain;

public class Material {
    private Integer id;

    private String isbn;

    private String publishingHouse;

    public Material(Integer id, String isbn, String publishingHouse) {
        this.id = id;
        this.isbn = isbn;
        this.publishingHouse = publishingHouse;
    }

    public Material() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse == null ? null : publishingHouse.trim();
    }
}