package org.hotelPro.domain;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer {


    private Integer customer_id;
    private String name;
    private Integer phoneNumber;
    private String email;



}
