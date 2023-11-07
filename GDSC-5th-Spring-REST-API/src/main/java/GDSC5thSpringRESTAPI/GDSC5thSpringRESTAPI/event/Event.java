package GDSC5thSpringRESTAPI.GDSC5thSpringRESTAPI.event;

import lombok.*;

import java.time.LocalDateTime;

@Builder //객체 생성시 필요한 필드를 메서드 체인을 통해 지정 가능, 가독성 높아짐
@AllArgsConstructor @NoArgsConstructor //모든 필드 or 매개변수 없는 생성자를 자동으로 생성
@Getter @Setter @EqualsAndHashCode(of = "id") //id 필드만 객체의 동등성과 해시 코드를 비교
public class Event {
    private Integer id;
    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDateTime;
    private LocalDateTime endEventDateTime;
    private String location; // (optional) 이게 없으면 온라인 모임
    private int basePrice; // (optional)
    private int maxPrice; // (optional)
    private int limitOfEnrollment;
    private boolean offline;
    private boolean free;
    private EventStatus eventStatus;

}
