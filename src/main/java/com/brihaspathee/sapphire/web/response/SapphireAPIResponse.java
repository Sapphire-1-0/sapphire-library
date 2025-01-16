package com.brihaspathee.sapphire.web.response;

import lombok.*;
import org.springframework.http.HttpStatus;


import java.time.LocalDateTime;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 5:53 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.web.response
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SapphireAPIResponse<E> {

    /**
     * Time stamp when the response was generated
     */
    private LocalDateTime timestamp;

    /**
     * The status code of the response
     */
    private int statusCode;

    /**
     * The HttpStatus of the response
     */
    private HttpStatus status;

    /**
     * The reason for the response
     */
    private String reason;

    /**
     * A message returned by the API to the user
     */
    private String message;

    /**
     * A message that can be understood by the developer of the consuming system
     */
    private String developerMessage;

    /**
     * The API Response object
     */
    private E response;

    /**
     * toString method
     * @return - String representation of the API Response object
     */
    @Override
    public String toString() {
        return "SapphireApiResponse{" +
                "timestamp=" + timestamp +
                ", statusCode=" + statusCode +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                ", message='" + message + '\'' +
                ", developerMessage='" + developerMessage + '\'' +
                ", response=" + response +
                '}';
    }
}
