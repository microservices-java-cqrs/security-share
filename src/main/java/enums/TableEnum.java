package enums;

import lombok.Getter;

@Getter
public enum TableEnum {
    USERS("users"),
    ENTITIES("entities"),
    ENTITY_TYPES("entity_types");

    private String value;

    TableEnum(String value) {
        this.value = value;
    }
}
