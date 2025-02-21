package com.brihaspathee.sapphire.dto.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Null;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 21, February 2025
 * Time: 3:58 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.dto.auth
 * To change this template use File | Settings | File and Code Template
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorityDto {

    /**
     * The unique id assigned to an authority
     */
    @JsonProperty(required = false)
    @Schema(description = "The unique id of the role",
            example = "1001", requiredMode = Schema.RequiredMode.NOT_REQUIRED,
            accessMode = Schema.AccessMode.READ_ONLY)
    @Null
    private Long authorityId;

    /**
     * The permission string used
     */
    @JsonProperty(required = true)
    @Schema(description = "The permission",
            example = "product.read", requiredMode = Schema.RequiredMode.REQUIRED,
            accessMode = Schema.AccessMode.READ_WRITE)
    private String permission;
}
