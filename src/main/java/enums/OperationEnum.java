package enums;

import lombok.Getter;

@Getter
public enum OperationEnum {
    CREATE('c'),
    UPDATE('u'),
    DELETE('d');

    private char value;

    private OperationEnum(char value) {
        this.value = value;
    }
}
