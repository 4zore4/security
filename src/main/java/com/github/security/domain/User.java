package com.github.security.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

//@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {


    private static final long serialVersionUID = 194736782819271958L;
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NotNull
    @Size(max = 50)
    private String username;

    @Getter
    @Setter
    @NotNull
    @Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$")
    @Size(min = 11, max = 11)
    private String mobile;

    @Getter
    @Setter
    @NotNull
    @Size(max = 50)
    private String name;

//    *//**
//     * 是否激活，默认激活
//     *//*
//    @Builder.Default
    @Setter
    @NotNull
    private Boolean enabled = true;

//    ***
//     * 账户是否未过期，默认未过期
//     *//*
//    @Builder.Default
    @Setter
    @NotNull
    private Boolean accountNonExpired = true;


//    @Builder.Default
    @Setter
    @NotNull
    private Boolean accountNonLocked = true;


//    @Builder.Default
    @Setter
    @NotNull
    private Boolean credentialsNonExpired = true;


    @Getter
    @Setter
    @JsonIgnore
    @NotNull
    @Size(min = 40, max = 80)
    private String password;



    @Getter
    @Setter
    @Email
    @Size(min = 5, max = 254)
    private String email;


}
