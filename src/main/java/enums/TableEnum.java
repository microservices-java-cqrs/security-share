package enums;

import lombok.Getter;

@Getter
public enum TableEnum {
    USERS("users"),
    ENTITIES("entities"),
    ENTITY_TYPES("entity_types"),
    ROLES("roles"),
    USERS_ROLES("users_roles");

    private String value;

    TableEnum(String value) {
        this.value = value;
    }
}
