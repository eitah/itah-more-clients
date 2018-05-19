package clients.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "addresses")
public class Address {

    @Id
    private int id;

    @Version
    private int version;

    private Date created;
    private Date modified;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Client client;

    @CreationTimestamp
    public Date getCreated() {return created;}
    public void setCreated(Date created) {this.created = created;}

    @UpdateTimestamp
    public Date getModified() {return modified;}
    public void setModified(Date modified) {this.modified = modified;}

    private String line1;
    private String line2;
    private String city;
    private State state;
    private String zip;
}
