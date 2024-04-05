package cgdev.passin.domain.attendee;

import java.time.LocalDateTime;

import cgdev.passin.domain.event.Event;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "attendees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendee {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String email;

  @ManyToOne
  @JoinColumn(name = "event_id", nullable = false)
  private Event event;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

}
