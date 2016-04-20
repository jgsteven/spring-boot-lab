package org.grjug.bootlab.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mission {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String type;

    @ManyToOne
    private Launch launch;

    protected Mission() {
    }

    public Mission(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Mission(String name, String type, Launch launch) {
        this.name = name;
        this.type = type;
        this.launch = launch;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Launch getLaunch() {
        return launch;
    }

    public void setLaunch(Launch launch) {
        this.launch = launch;
    }

    @Override
    public String toString() {
        return "Mission{"
                + "id=" + id
                + ", name=" + name
                + ", type=" + type
                + ", launch=" + launch
                + '}';
    }
}
