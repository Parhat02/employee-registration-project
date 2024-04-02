package org.cydeo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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


    @NotEmpty
    @Size(max = 12, min = 2)
    private String firstName;
    @NotEmpty
    @Size(max = 12, min = 2)
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    @NotEmpty
    @Size(max = 12, min = 2)
    private String email;
    @NotEmpty
    @Size(max = 12, min = 2)
    private String password;
    @NotEmpty
    @Size(max = 12, min = 2)
    private String address;
    @NotEmpty
    @Size(max = 12, min = 2)
    private String address2;
    @NotEmpty
    @Size(max = 12, min = 2)
    private String city;
    @NotEmpty
    @Size(max = 12, min = 2)
    private String state;
    @NotEmpty
    @Size(max = 12, min = 2)
    private String zipCode;

}
