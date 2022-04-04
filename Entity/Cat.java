package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String catName;


    @OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
    private List<Catalog> listt = new ArrayList<Catalog>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public List<Catalog> getListt() {
        return listt;
    }

    public void setListt(List<Catalog> catList) {
        this.listt = catList;
    }
}
