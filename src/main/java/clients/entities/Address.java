package clients.entities;

import clients.enums.State;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "addresses")
public class Address {
    private int id;
    private int version;
    private Date created;
    private Date updated;
    private Client client;
    private String line1;
    private String line2;
    private String city;
    private State state;
    private String zip;

    public Address() {
        this.created = new Date();
        this.updated = new Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    @OneToOne
    @JoinColumn(name="client_id")
    public Client getClient() { return client;}
    public void setClient(Client client) {this.client = client;}

//    @ManyToOne
//    @JoinColumn(name="client_id", insertable=false, updatable=false)
//    public Client getClient() { return client;}
//    public void setClient(Client client) {this.client = client;}


    @Version
    public int getVersion() {return version;}
    public void setVersion(int version) {this.version = version;}

    @CreationTimestamp
    public Date getCreated() {return created;}
    public void setCreated(Date created) {this.created = created;}

    @UpdateTimestamp
    public Date getUpdated() {return updated;}
    public void setUpdated(Date updated) {this.updated = updated;}
}
