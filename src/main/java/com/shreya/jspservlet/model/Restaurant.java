package com.shreya.jspservlet.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
public class Restaurant {
    private int registerNo;
    private String name;
    private String City;
    private String Area;
}
