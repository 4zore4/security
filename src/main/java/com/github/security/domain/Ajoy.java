package com.github.security.domain;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Ajoy implements Serializable {

    private static final long serialVersionUID = 7431467212331553238L;
    @Getter
    @Setter
    private Long Id;

    @Getter
    @Setter
    @NotNull
    @Size(max = 50)

    private String name;

    @Getter
    @Setter
    @NotNull
    @Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$")
    @Size(min = 11, max = 11)
    private String mobile;
}
