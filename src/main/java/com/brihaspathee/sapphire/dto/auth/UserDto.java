package com.brihaspathee.sapphire.dto.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

import java.util.Set;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2025
 * Time: 3:59 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.dto.auth
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    /**
     * UserId of the user
     */
    @JsonProperty(required = false)
    @Schema(description = "User id of the user",
            example = "1001", requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private Long userId;

    /**
     * The username of the user
     */
    @JsonProperty(required = true)
    @Schema(description = "The username of the user",
            example = "johndoe", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    private String username;

    /**
     * The password of the user
     */
    @JsonProperty(required = true)
    @Schema(description = "The password of the user",
            example = "$sef2s4%%@%%#@#", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    private String password;

    /**
     * Represents the service identifier assigned to the user.
     *
     * This variable is a unique identifier used to associate a user with a specific service within the application.
     *
     * Attributes:
     * - Required: True
     * - Access Mode: Read/Write
     * - Example Value: "SP223806", "MMS-SERVICE"
     */
    @JsonProperty(required = true)
    @Schema(description = "The service id of the user",
            example = "SP223806", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    private String serviceId;

    /**
     * Represents the type of account associated with the user.
     *
     * This variable defines the role or category of the user's account within the application.
     * For example, it can specify whether the user is an admin, a regular user, or another type of account.
     *
     * Attributes:
     * - Required: True
     * - Access Mode: Read/Write
     * - Example Values: "user", "service"
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of account of the user",
            example = "user", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    private String accountType;

    /**
     * The roles associated with the user
     */
    @JsonProperty(required = true)
    @Schema(description = "The roles that are associated with the user")
    private Set<RoleDto> roles;

    /**
     * toString method
     * @return - String version of the user object
     */
    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", accountType='" + accountType + '\'' +
                ", roles=" + roles +
                '}';
    }
}
