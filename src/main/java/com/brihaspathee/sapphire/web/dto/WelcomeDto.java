package com.brihaspathee.sapphire.web.dto;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 1/15/25
 * Time: 6:09 PM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.web.dto
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WelcomeDto {

    /**
     * A simple welcome message
     */
    private String welcomeMessage;
}
