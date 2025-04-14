package com.shreya.jspservlet.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class Order {
    private int id;
    private String type;
    private String note;
    private String paymentMethod;
}
