package it.orlandolorenzo.springbootbestpractices.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "logs")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "message", length = 1000, nullable = false)
    private String message;

    @Column(name = "level", length = 10, nullable = false)
    private String level;
}
