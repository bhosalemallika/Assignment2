package entity;

import javax.persistence.*;

@Entity
public class Catalogue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    String catalogueName;

    String status;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getCatalogueName() {
        return catalogueName;
    }

    public void setCatalogueName(String catalogueName) {
        this.catalogueName = catalogName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
