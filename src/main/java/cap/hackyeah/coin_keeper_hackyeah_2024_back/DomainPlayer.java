package cap.hackyeah.coin_keeper_hackyeah_2024_back;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class DomainPlayer {
    private String playerName;
    private String password;
    private String firstName;
    private String lastName;
    private Long balance;
    private Long goal;

}
