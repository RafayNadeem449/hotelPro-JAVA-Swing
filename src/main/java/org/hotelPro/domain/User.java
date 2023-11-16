package org.hotelPro.domain;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {

    private Integer user_id;
    private String user_name;
    private Integer user_phoneNumber;
    private String user_email;
    private String userPassword;



}
