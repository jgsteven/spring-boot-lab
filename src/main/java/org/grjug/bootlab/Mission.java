package org.grjug.bootlab;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    String type;
    
    Mission() {
    }
    
    Mission(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "Mission{" + "id=" + id
                + ", name=" + name
                + ", type=" + type
                + '}';
    }
}
