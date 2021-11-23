package com.github.security.domain.dto;

import lombok.Data;

@Data
public class PasswordDto {

    private String oldPassword;

    private String newPassword;

}
