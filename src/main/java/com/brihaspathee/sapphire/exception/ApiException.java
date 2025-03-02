package com.brihaspathee.sapphire.exception;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 25, February 2025
 * Time: 3:07 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.exception
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiException {

    /**
     * Represents the code identifying a specific error condition.
     * Used to categorize and convey the type of error that occurred
     * in the application.
     */
    private String errorCode;

    /**
     * The error message associated with the exception.
     * This message provides details or context about the error
     * that occurred during the execution of the application.
     */
    private String errorMessage;

    /**
     * Returns a string representation of the ApiException object.
     * This includes the error code and error message concatenated together
     * in a formatted output.
     *
     * @return a string representation of the ApiException instance,
     * including the error code and error message.
     */
    @Override
    public String toString() {
        return "ApiException{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
