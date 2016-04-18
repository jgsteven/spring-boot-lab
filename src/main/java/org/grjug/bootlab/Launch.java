package org.grjug.bootlab;

import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Launch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    int status;
    Instant windowStart;  // map to isostart
    Instant windowEnd;  //map to isoend

    @ManyToOne
    Location location;

    Launch() {
    }
    
    @Override
    public String toString() {
        return "Launch{"
                + "id=" + id
                + ", name=" + name
                + ", status=" + status
                + ", windowStart=" + windowStart
                + ", windowEnd=" + windowEnd
                + ", location=" + location
                + '}';
    }
}
