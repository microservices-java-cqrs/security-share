package messages;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
public class EntityMessage {
    private Long id;
    private Long parentId;
    private Long entityTypeId;
    private String numberDocument;
    private String bussinessName;
    private String name;
    private String lastname;
    private String logCreationUser;
    private String logUpdateUser;
    private Date logCreationDate;
    private Date logUpdateDate;
    private Integer logState;
}
