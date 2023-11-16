package org.hotelPro.domain;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Booking {


    private Integer booking_id;
    private String user_name;
    private Integer noOfPersons;

}
