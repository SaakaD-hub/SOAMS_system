package org.miu.edu.david.springboot.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Patient {
    private int id;
    private String fname;
    private String lname;
    private String phone;
    private String email;
    private String dob;
}
