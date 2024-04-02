package org.cydeo.model;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

//    @NotNull -> @NotNull
//    @NotEmpty -> @NotNull + @NotEmpty
//    @NotBlank -> @NotNull + @NotEmpty + @NotBlank


    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;

//    @NotBlank
//    @Size(max = 12, min = 2)
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

//    @NotBlank
//    @Email
    private String email;

//    @NotBlank
//    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;

//    @NotBlank
//    @Size(max = 12, min = 2)
    private String address;

//    @NotBlank
//    @Size(max = 12, min = 2)
    private String address2;

//    @NotBlank
//    @Size(max = 12, min = 2)
    private String city;

//    @NotBlank
//    @Size(max = 12, min = 2)
    private String state;

//    @NotBlank
//    @Size(max = 12, min = 2)
    private String zipCode;

}
