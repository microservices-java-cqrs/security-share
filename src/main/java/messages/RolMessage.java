package messages;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
public class RolMessage {
    private Long id;
    private String name;
    private String description;
    private String logCreationUser;
    private String logUpdateUser;
    private Date logCreationDate;
    private Date logUpdateDate;
    private int logState;
}
