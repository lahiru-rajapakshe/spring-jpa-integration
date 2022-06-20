package lk.lahiru.jpaspringintegration.tasks.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements SuperEntity {
    private String id;
    private String email;
    private String password;
    private String fullName;
    private String profilePic;
}
