package clients.entities;

import clients.entities.Address;
import java.util.Date;
import java.util.List;

import com.sun.tools.javah.Gen;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@Data
public class Client {
    private int id;
    private int version;
    private String name;
    private String homePhone;
    private String workPhone;
    private String company;
    private String profileImage;
    private String email;
    private Date birthDate;
    private Address address;
//    private List<Address> addresses;
    private Date created;
    private Date updated;

    public Client() {
        this.created = new Date();
        this.updated = new Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "client")
    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}

//    @OneToMany
//    @JoinColumn(name="client_id") //we need to duplicate the physical information
//    public List<Address> getAddresses() {return addresses;}
//    public void setAddresses(List<Address> addresses) {this.addresses = addresses;}

    @Version
    public int getVersion() {return version;}
    public void setVersion(int version) {this.id = version;}

    @CreationTimestamp
    public Date getCreated() {return created;}
    public void setCreated(Date created) {this.created = created;}

    @UpdateTimestamp
    public Date getUpdated() {return updated;}
    public void setUpdated(Date updated) {this.updated = updated;}
}