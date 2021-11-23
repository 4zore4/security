package com.github.security.domain.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Data
public class UserDto implements Serializable {
    @NotNull
    @Size(min = 1)
    private String name;


    private String password;

    @NotNull
    @Size(min = 1)
    private String matchingPassword;

    @Email
    @NotNull
    @Size(min = 1)
    private String email;

    private boolean isUsing2FA;

}