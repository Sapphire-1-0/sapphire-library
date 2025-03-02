package com.brihaspathee.sapphire.dto.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 28, February 2025
 * Time: 5:06 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.dto.resource
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DomainRegistrationResponse {

    /**
     * Represents the unique identifier of a registered domain.
     *
     * This field is annotated with {@code @JsonProperty}, indicating it is optional during JSON
     * serialization and deserialization processes.
     *
     * The {@code @Schema} annotation provides OpenAPI documentation details, describing the field
     * as a read-only property with an example value. It is not a mandatory field and serves to uniquely
     * identify a domain once it has been successfully registered.
     */
    @JsonProperty(required = false)
    @Schema(description = "Id of the domain that was registered",
            example = "DOM-523GSFG35", requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    private String domainId;

    /**
     * Represents the response status after a domain registration action is performed.
     *
     * This field is optional and indicates the outcome of the domain registration process.
     * Annotated with {@code @JsonProperty}, this enables serialization and deserialization
     * without requiring the field to be present in JSON data.
     *
     * The {@code @Schema} annotation provides OpenAPI documentation, specifying a description,
     * an example response value, optional field behavior, and read-only access mode.
     * An example value for this field is "SUCCESSFULLY_REGISTERED".
     */
    @JsonProperty(required = false)
    @Schema(description = "The response once the domain has been registered",
            example = "SUCCESSFULLY_REGISTERED", requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    private String domainRegistrationResponse;

    /**
     * Returns a string representation of the DomainRegistrationResponse object.
     *
     * @return A string containing the values of domainId and domainRegistrationResponse fields,
     *         formatted in a descriptive and human-readable way.
     */
    @Override
    public String toString() {
        return "DomainRegistrationResponse{" +
                "domainId='" + domainId + '\'' +
                ", domainRegistrationResponse='" + domainRegistrationResponse + '\'' +
                '}';
    }
}
