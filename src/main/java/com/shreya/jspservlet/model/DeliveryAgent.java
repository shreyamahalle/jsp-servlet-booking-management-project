package com.shreya.jspservlet.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class DeliveryAgent {
    private int id;
    private String name;
    private String city;
    public int mobileNo;
}
