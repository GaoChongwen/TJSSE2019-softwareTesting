package tongji.sse.student.domain;

public class Semester {
    private Integer id;

    private Integer year;

    private String season;

    public Semester(Integer id, Integer year, String season) {
        this.id = id;
        this.year = year;
        this.season = season;
    }

    public Semester() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season == null ? null : season.trim();
    }
}