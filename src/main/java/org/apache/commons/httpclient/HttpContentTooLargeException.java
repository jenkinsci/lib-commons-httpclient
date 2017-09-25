package org.apache.commons.httpclient;

/**
 * Signals that the response content was larger than anticipated. 
 * 
 * @author Ortwin Glueck
 * @deprecated Jakarta Commons HttpClient 3.x is deprecated in the Jenkins project.
 *  It is not recommended to use it in any new code.
 *  Instead, use HTTP client API plugins as a dependency in your code.
 *  E.g. <a href="https://plugins.jenkins.io/apache-httpcomponents-client-4-api">
 *      Apache HttpComponents Client API 4.x Plugin</a> or
 *  <a href="https://plugins.jenkins.io/async-http-client">Async HTTP Client Plugin</a>.
 */
@Deprecated
public class HttpContentTooLargeException extends HttpException {
    private int maxlen;

    public HttpContentTooLargeException(String message, int maxlen) {
        super(message);
        this.maxlen = maxlen;
    }
    
    /**
     * @return the maximum anticipated content length in bytes.
     */
    public int getMaxLength() {
        return maxlen;
    }
}
