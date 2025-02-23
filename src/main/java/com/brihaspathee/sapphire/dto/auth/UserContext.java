package com.brihaspathee.sapphire.dto.auth;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 23, February 2025
 * Time: 5:04 AM
 * Project: sapphire
 * Package Name: com.brihaspathee.sapphire.dto.auth
 * To change this template use File | Settings | File and Code Template
 */
public class UserContext {

    /**
     * A ThreadLocal variable that holds a UserDto object for maintaining user-specific
     * data in a thread-safe manner across different threads.
     * <p>
     * This variable is primarily used to provide thread-local storage for user context,
     * ensuring that each thread has its own isolated copy of the user data.
     * <p>
     * Since we want to access user details anywhere in the request lifecycle, we use a ThreadLocal storage.
     */
    private static final ThreadLocal<UserDto> userThreadLocal = new ThreadLocal<>();

    /**
     * Retrieves the UserDto object stored in the thread-local variable for the current thread.
     *
     * @return the UserDto object representing the user associated with the current thread,
     * or null if no user is set for the current thread.
     */
    public static UserDto getUser() {
        return userThreadLocal.get();
    }

    /**
     * Sets the user context for the current thread by storing the given user in a ThreadLocal variable.
     *
     * @param user the UserDto object containing user details to be set for the current thread
     */
    public static void setUser(UserDto user) {
        userThreadLocal.set(user);
    }

    /**
     * Clears the thread-local variable storing the user context.
     *
     * This method removes the UserDto object associated with the current thread
     * from the thread-local storage, ensuring that no user-specific data persists
     * after a thread's lifecycle or when it is no longer needed.
     */
    public static void clear() {
        userThreadLocal.remove();
    }

}
