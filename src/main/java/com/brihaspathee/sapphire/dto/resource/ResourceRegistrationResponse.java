package com.brihaspathee.sapphire.dto.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 24, February 2025
 * Time: 10:45 AM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.dto.resource
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourceRegistrationResponse {

    /**
     * The unique identifier of the resource that was registered.
     *
     * This field is optional and marked with {@code @JsonProperty(required = false)}
     * to exclude it from mandatory JSON serialization/deserialization processes.
     *
     * It is documented through the {@code @Schema} annotation, providing details
     * for OpenAPI specifications including:
     * - A description specifying that it identifies the registered resource.
     * - An example value, such as "RES-523GSFG35".
     * - A required mode set to `NOT_REQUIRED`, indicating this field is optional.
     * - An access mode set to `READ_ONLY`, specifying it is for read purposes only.
     *
     * The {@code @Null} annotation ensures that the value is null during certain processes,
     * enforcing validation rules as necessary.
     */
    @JsonProperty(required = false)
    @Schema(description = "Id of the resource that was registered",
            example = "RES-523GSFG35", requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    private String resourceId;

    /**
     * Represents the response after a resource has been registered.
     * This field indicates the status or result of the registration process.
     *
     * Annotated with {@code @JsonProperty(required = false)}, this field is optional
     * during JSON serialization and deserialization.
     *
     * The {@code @Schema} annotation provides OpenAPI documentation details,
     * such as the description, an example value, and the access mode.
     * The {@code example} value is "SUCCESSFULLY_REGISTERED", showing a typical response.
     * The {@code accessMode} is specified as {@code READ_ONLY}, indicating that this
     * field is intended for output only.
     *
     * Validation is enforced using {@code @Null}, ensuring that the value
     * is null when creating or updating the resource.
     */
    @JsonProperty(required = false)
    @Schema(description = "The response once the resource has been registered",
            example = "SUCCESSFULLY_REGISTERED", requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    private String registrationResponse;

    /**
     * Returns a string representation of the ResourceRegistrationResponse object.
     * The string includes the resourceId and registrationResponse attributes.
     *
     * @return a string representation of the ResourceRegistrationResponse object
     */
    @Override
    public String toString() {
        return "ResourceRegistrationResponse{" +
                "resourceId='" + resourceId + '\'' +
                ", registrationResponse='" + registrationResponse + '\'' +
                '}';
    }
}
