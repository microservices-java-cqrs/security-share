package messages;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
public class MessagePersistence<T> {
    private char operation;
    private String tableName;
    private T message;
}
