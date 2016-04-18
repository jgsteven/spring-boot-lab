package org.grjug.bootlab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {

    @Id
    Long id;

    String name;
    String country;

    Location() {
    }
    
    @Override
    public String toString() {
        return "Location{"
                + "id=" + id
                + ", name=" + name
                + ", country=" + country
                + '}';
    }
}
