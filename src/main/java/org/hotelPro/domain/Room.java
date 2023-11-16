package org.hotelPro.domain;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Room {

    private Integer room_id;
    private Integer room_name;
    private String room_type;
    private String room_price;

}
