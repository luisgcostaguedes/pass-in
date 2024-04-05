package cgdev.passin.domain.checkin;

import java.time.LocalDateTime;
import cgdev.passin.domain.attendee.Attendee;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "check_ins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CheckIn {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @OneToOne
  @JoinColumn(name = "attendee_id", nullable = false)
  private Attendee attendee;
}
