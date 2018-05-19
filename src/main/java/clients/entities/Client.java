package clients.entities;

import java.util.Date;
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

    @Data
    private class Name {
        private String first;
        private String middle;
        private String last;
    };
//    @Data
//    public class PhoneNumber{
//        private String home;
//        private String work;
//    };

    private String company;
    private String profileImage;
    private String email;
    private Date birthDate;

    private Address address;

    private Date created;
    private Date modified;

    @Id
    @GeneratedValue
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    @Version
    public int getVersion() {return version;}
    public void setVersion(int version) {this.id = version;}

    @CreationTimestamp
    public Date getCreated() {return created;}
    public void setCreated(Date created) {this.created = created;}

    @UpdateTimestamp
    public Date getModified() {return modified;}
    public void setModified(Date modified) {this.modified = modified;}
}