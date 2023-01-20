package com.example.app.classes;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Event")
@Table(name = "Event")
public class Event {
    @Id
    private String sport_event_id;
    @Column(
            nullable = false,
            columnDefinition = "TIMESTAMP WITHOUT TIME ZONE"
    )
    private LocalDateTime start_date;
    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String sport_name;
    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String competition_name;
    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String competition_id;
    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String season_name;
        @OneToMany(
                orphanRemoval = true,
                cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
                fetch = FetchType.LAZY
        )
        private List<Competitor> competitors;
        @OneToOne
        @JoinColumn(name = "venue_id")
        private Venue venue;
    private Double probabilityHomeTeamWinner;
    private Double probabilityDraw;
    private Double probabilityAwayTeamWinner;


}
