package messages;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
public class PersistenceMessage<T> {
    private char operation;
    private String tableName;
    private T message;
}
