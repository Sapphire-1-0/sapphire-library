package com.brihaspathee.sapphire.dto.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, February 2025
 * Time: 4:58 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.dto.resource
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DomainRegistrationRequest {

    /**
     * Represents the name of the domain in the context of a domain registration request.
     * This field is mandatory and uniquely identifies the domain being registered.
     *
     * Annotated with {@code @JsonProperty}, it ensures that domainName is a required field
     * for JSON serialization and deserialization processes.
     *
     * The {@code @Schema} annotation provides OpenAPI documentation details, including a
     * description, an example usage value, required mode, and access mode. This field supports
     * both read and write operations, as defined by {@code Schema.AccessMode.READ_WRITE}.
     *
     * Validation is enforced using {@code @NotNull}, ensuring that domainName cannot be null
     * during validation.
     */
    @JsonProperty(required = true)
    @Schema(description = "The name of the domain",
            example = "MEMBER_MANAGEMENT", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    @NotNull
    private String domainName;

    /**
     * Represents a short textual description of the domain being registered.
     * This field provides a concise summary or overview of the domain's purpose,
     * functionality, or associated resources.
     *
     * The {@code @JsonProperty} annotation ensures that this field is mandatory during
     * JSON serialization and deserialization. It enforces the presence of this field
     * in API requests and responses.
     *
     * The {@code @Schema} annotation adds OpenAPI documentation details, specifying
     * the description, a usage example, and its requirement status. It also defines
     * the read/write access mode, indicating that this field can be both read and updated.
     *
     * The {@code @NotNull} annotation ensures validation, disallowing null values
     * for this field, which guarantees that every domain registration request
     * includes a description.
     */
    @JsonProperty(required = true)
    @Schema(description = "A short description of the domain. This is typically a microservice",
            example = "Contains resources of member accounts", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    @NotNull
    private String domainDescription;

    /**
     * Represents the list of resources that are associated with a specific domain registration request.
     * Each resource within the list is defined and described using the {@link ResourceRegistrationRequest} class.
     * This field is mandatory and cannot be null, ensuring that every domain registration request
     * includes at least one resource definition.
     *
     * The {@code @JsonProperty} annotation specifies that the field is required for JSON serialization
     * and deserialization operations. It indicates that this field must be present in API requests
     * and responses.
     *
     * The {@code @Schema} annotation provides OpenAPI documentation details. It describes the purpose
     * of the field, the access mode, and its read/write capabilities.
     *
     * Validation is enforced using {@code @NotNull}, ensuring that a null value for this field will result
     * in a validation error. This constraint guarantees that resource definitions are always provided
     * during the domain registration process.
     */
    @JsonProperty(required = true)
    @Schema(description = "The list of resources of the domain",
            accessMode = Schema.AccessMode.READ_WRITE)
    @NotNull
    private List<ResourceRegistrationRequest> resourceRegistrationRequests;

    /**
     * Returns a string representation of the DomainRegistrationRequest object.
     *
     * @return A string containing the values of domainName, domainDescription,
     *         and resourceRegistrationRequests fields, formatted in a descriptive
     *         and human-readable way.
     */
    @Override
    public String toString() {
        return "DomainRegistrationRequest{" +
                "domainName='" + domainName + '\'' +
                ", domainDescription='" + domainDescription + '\'' +
                ", resourceRegistrationRequests=" + resourceRegistrationRequests +
                '}';
    }
}
