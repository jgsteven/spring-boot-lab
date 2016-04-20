package org.grjug.bootlab.domain;

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
    private Long id;

    private String name;
    private int status;
    private Instant windowStart;  // map to isostart
    private Instant windowEnd;    // map to isoend

    @ManyToOne
    private Location location;

    public Launch() {
    }

    public Launch(String name, LaunchStatus status) {
        this.name = name;
        this.status = status.intValue();
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

    public LaunchStatus getStatusEnum() {
        return LaunchStatus.valueOf(status);
    }
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Instant getWindowStart() {
        return windowStart;
    }

    public void setWindowStart(Instant windowStart) {
        this.windowStart = windowStart;
    }

    public Instant getWindowEnd() {
        return windowEnd;
    }

    public void setWindowEnd(Instant windowEnd) {
        this.windowEnd = windowEnd;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Launch{"
                + "id=" + id
                + ", name=" + name
                + ", status=" + status 
                + " (" + LaunchStatus.valueOf(status) + ')'
                + ", windowStart=" + windowStart
                + ", windowEnd=" + windowEnd
                + ", location=" + location
                + '}';
    }
}
