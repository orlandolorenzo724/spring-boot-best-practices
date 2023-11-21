package it.orlandolorenzo.springbootbestpractices.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LogDTO {
    private Long id;
    private String date;
    private String message;
    private String level;
}
