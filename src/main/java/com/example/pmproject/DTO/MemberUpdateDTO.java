package com.example.pmproject.DTO;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberUpdateDTO {

    private String email;

    private String recentPassword;

    @Length(min=8, max=16, message = "비밀번호는 8자 이상, 16자 이하로 입력하여 주십시오.")
    private String newPassword;

    private String name;

    private String address;

    private String tel;

}
