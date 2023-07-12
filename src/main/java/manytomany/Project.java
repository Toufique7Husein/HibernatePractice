package manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Project {
    @Id
    private int eid;
    private String name;

    @ManyToMany
    private List<Emp> emps;


    public Project(int eid, String name, List<Emp> emps) {
        this.eid = eid;
        this.name = name;
        this.emps = emps;
    }

    public Project() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Project{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", emps=" + emps +
                '}';
    }
}
