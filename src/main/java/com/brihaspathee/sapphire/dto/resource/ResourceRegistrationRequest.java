package com.brihaspathee.sapphire.dto.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 24, February 2025
 * Time: 10:05 AM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.dto.resource
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourceRegistrationRequest {

    /**
     * Represents the URI of the resource that needs to be registered.
     * This field is mandatory and is used to uniquely identify the resource in the system.
     * It specifies the endpoint or path of the resource being registered.
     *
     * Annotated with {@code @JsonProperty(required = true)}, indicating it is a required field
     * during JSON serialization and deserialization.
     *
     * The {@code @Schema} annotation is used for OpenAPI documentation, providing a description,
     * example value, and specifying that the field is required.
     *
     * Validation is enforced with {@code @NotNull}, ensuring the field cannot be null.
     */
    @JsonProperty(required = true)
    @Schema(description = "Resource URI that needs to be registered",
            example = "/api/v1/sapphire/member", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    @NotNull
    private String resourceURI;

    /**
     * Represents the name of the resource being registered.
     * This field is a mandatory attribute used to uniquely identify
     * the resource within the system in a meaningful way.
     *
     * Annotated with {@code @JsonProperty(required = true)} to indicate
     * that the field is required during JSON serialization and deserialization.
     *
     * The {@code @Schema} annotation provides OpenAPI specification details,
     * including a description, example value, and required mode.
     *
     * Validation is enforced using {@code @NotNull}, ensuring that this
     * field cannot be null during validation.
     */
    @JsonProperty(required = true)
    @Schema(description = "The name of the resource",
            example = "GET_ALL_ACCOUNTS", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    @NotNull
    private String resourceName;

    /**
     * Represents a short description of the resource being registered.
     * This field provides a brief summary or explanation regarding the purpose or
     * functionality of the resource in the system. It is a required attribute for
     * resource registration requests.
     *
     * The {@code @JsonProperty} annotation ensures that this field is included and
     * marked as mandatory during JSON serialization and deserialization.
     *
     * The {@code @Schema} annotation is used for OpenAPI documentation, providing a
     * description, example value, required mode, and access mode for the field. The
     * description is intended to be displayed in API specifications to enhance clarity
     * and usability.
     *
     * Validation is enforced with {@code @NotNull}, ensuring that a null value for this
     * field will result in a validation error.
     */
    @JsonProperty(required = true)
    @Schema(description = "A short description for the resource",
            example = "Get all accounts in the system", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    @NotNull
    private String resourceDescription;

    /**
     * Represents the type of the resource in the context of a resource registration request.
     * This field is mandatory and identifies the category or group to which the resource belongs.
     *
     * Annotated with {@code @JsonProperty(required = true)} to indicate its mandatory nature
     * during JSON serialization and deserialization.
     *
     * The {@code @Schema} annotation provides OpenAPI documentation details. It describes the
     * field, sets a required mode, and specifies an example value.
     *
     * Validation is enforced with {@code @NotNull}, ensuring the field cannot be null during validation.
     */
    @JsonProperty(required = true)
    @Schema(description = "The type of the resource being registered",
            example = "ACCOUNT", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    @NotNull
    private String resourceType;

    /**
     * Represents the service that owns the resource being registered.
     * This field is required and specifies the name of the service responsible for managing
     * or operating the resource in question.
     *
     * Annotated with {@code @JsonProperty(required = true)} to indicate that this field is mandatory
     * during JSON serialization and deserialization.
     *
     * The {@code @Schema} annotation is used to define OpenAPI specification details, such as a
     * description, example value, required mode, and access mode. The field supports both read and
     * write operations.
     *
     * Validation is enforced with {@code @NotNull}, ensuring this field cannot be null during validation.
     */
    @JsonProperty(required = true)
    @Schema(description = "The name of the service that owns the resource",
            example = "MEMBER_MANAGEMENT", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    @NotNull
    private String resourceOwner;

    /**
     * Specifies the permission required by a user to access the associated resource.
     * This field is mandatory and must be provided when registering a resource.
     *
     * The value should indicate a specific access permission following the format
     * "resource.operation", such as "account.read".
     *
     * Annotated with {@code @JsonProperty(required = true)}, ensuring the permission
     * field is a required attribute during JSON serialization and deserialization.
     *
     * The {@code @Schema} annotation is used to define OpenAPI documentation for the
     * field, including its description, example value, required mode, and access mode.
     * The {@code accessMode} is set to support both read and write operations.
     *
     * Validation is enforced with {@code @NotNull}, ensuring the permission field
     * cannot be null.
     */
    @JsonProperty(required = true)
    @Schema(description = "The permission that the user should have to access the resource",
            example = "account.read", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    @NotNull
    private String permission;

    /**
     * Returns a string representation of the ResourceRegistrationRequest object.
     * The string includes all the attributes of the object such as resourceURI,
     * resourceName, resourceDescription, resourceType, resourceOwner, and permission.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "ResourceRegistrationRequest{" +
                "resourceURI='" + resourceURI + '\'' +
                ", resourceName='" + resourceName + '\'' +
                ", resourceDescription='" + resourceDescription + '\'' +
                ", resourceType='" + resourceType + '\'' +
                ", resourceOwner='" + resourceOwner + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
