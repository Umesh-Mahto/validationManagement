package com.geekster.validation.userManagementSystem.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Email;

@Data
@AllArgsConstructor
public class userModel {
     @NotNull

    private int userId;
     @NotEmpty
     @NotBlank
     @Pattern(regexp = "[A-Za-z]+\\s+[A-Za-z]+")
    private String userName;

    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
    private String dateOfBirth;

    @Email
    @NotEmpty
    private String emailId;

    @Pattern(regexp = "[0-9]+")
    private String phoneNumber;

    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
    private String date;

    @Pattern(regexp ="^[0-2][0-3]:[0-5][0-9]$")
    private String time;


}
