package HW_01_Gradle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Root implements Serializable {
    private String name;
    private List<People> people = new ArrayList<>();


    public String getName() {
        return name;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }
    public void addPeople(People people){
        this.people.add(people);
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", people=" + people +
                '}';
    }
}
