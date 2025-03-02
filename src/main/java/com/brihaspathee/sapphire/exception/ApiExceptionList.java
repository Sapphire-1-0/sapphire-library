package com.brihaspathee.sapphire.exception;

import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 25, February 2025
 * Time: 3:08 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.exception
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiExceptionList {

    /**
     * A list of ApiException instances that represent exceptions captured
     * during the application's execution. Each ApiException object in the
     * list provides detailed information about a specific error condition,
     * including an error code and an error message.
     */
    private List<ApiException> apiExceptions;

    /**
     * Returns a string representation of the ApiExceptionList object.
     * This includes the list of ApiException instances, represented in a
     * formatted output.
     *
     * @return a string representation of the ApiExceptionList instance,
     * including the list of ApiException objects.
     */
    @Override
    public String toString() {
        return "ApiExceptionList{" +
                "apiExceptions=" + apiExceptions +
                '}';
    }
}
