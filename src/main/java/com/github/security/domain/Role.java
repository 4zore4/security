//package com.github.security.domain;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.springframework.security.core.GrantedAuthority;
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import java.io.Serializable;
//
//@AllArgsConstructor
//@NoArgsConstructor
//public class Role implements GrantedAuthority, Serializable {
//
//    /**
//     * 自增长 ID，唯一标识
//     */
//    @Getter
//    @Setter
//    private Long id;
//
//    /**
//     * 角色名称，有唯一约束，不能重复
//     */
//    @NotNull
//    @Size(max = 50)
//    private String authority;
//
//    @Override
//    public String getAuthority() {
//        return null;
//    }
//}
