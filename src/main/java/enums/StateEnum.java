package enums;

import lombok.Getter;

@Getter
public enum StateEnum {
    DELETE(0),
    ACTIVE(1);

    private int value;

    StateEnum(int value) {
        this.value = value;
    }
}