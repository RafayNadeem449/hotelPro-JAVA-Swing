package org.hotelPro.domain;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Room {

    private Integer room_id;
    private Integer room_no;
    private String room_type;
    private Integer room_price;

}
