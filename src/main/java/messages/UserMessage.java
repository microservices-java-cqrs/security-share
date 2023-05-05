package messages;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
public class UserMessage {
    private Long id;
    private Long entityId;
    private String username;
    private String password;
    private String status;
    private String logCreationUser;
    private String logUpdateUser;
    private Date logCreationDate;
    private Date logUpdateDate;
    private Integer logState;
}
