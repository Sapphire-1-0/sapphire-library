package com.brihaspathee.sapphire.dto.auth;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 25, February 2025
 * Time: 5:07 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.dto.auth
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizationRequest {

    /**
     * Represents the URI of the resource being accessed or requested.
     *
     * This variable typically contains the endpoint or location of the
     * target resource within the system and is used to define the scope
     * of access or authorization in the context of the request.
     */
    private String resourceUri;

    /**
     * Converts the AuthorizationRequest object into a string representation.
     *
     * @return a string containing the values of jwtToken and resourceUri properties in a structured format.
     */
    @Override
    public String toString() {
        return "AuthorizationRequest{" +
                ", resourceUri='" + resourceUri + '\'' +
                '}';
    }
}
