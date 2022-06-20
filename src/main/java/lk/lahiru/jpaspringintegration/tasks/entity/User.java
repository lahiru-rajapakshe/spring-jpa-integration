package lk.lahiru.jpaspringintegration.tasks.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User implements SuperEntity {
    @Id
    private String id;
    private String email;
    private String password;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "profile_pic")
    private String profilePic;
}
