package hrmsSystem.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    public Users(){

    }

    public Users(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
