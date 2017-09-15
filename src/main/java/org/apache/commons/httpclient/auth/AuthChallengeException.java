/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//httpclient/src/java/org/apache/commons/httpclient/auth/AuthChallengeException.java,v 1.2 2004/04/18 23:51:36 jsdever Exp $
 * $Revision: 480424 $
 * $Date: 2006-11-29 06:56:49 +0100 (Wed, 29 Nov 2006) $
 *
 * ====================================================================
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.commons.httpclient.auth;

/**
 * Signals a failure processing authentication challenge
 *
 * @author <a href="mailto:oleg@ural.ru">Oleg Kalnichevski</a>
 * 
 * @since 3.0
 * @deprecated Jakarta Commons HttpClient 3.x is deprecated in the Jenkins project.
 *             It is not recommended to use it in any new code.
 *             Instead of that, use HTTP client API plugins as a dependency in your code.
 *             E.g. <a href="https://plugins.jenkins.io/apache-httpcomponents-client-4-api">Apache HttpComponents Client API 4.x Plugin</a> or
 *             <a href="https://plugins.jenkins.io/async-http-client">Async HTTP Client Plugin</a>.
 */
//TODO: Restrict all other classes
//TODO: Also add @Restricted once Jenkins core is able to build without the detached component.
// It may require Accmod patches && may break PCT tests, but probably it worth it to highlight the
// deprecated component usage in plugins.
public class AuthChallengeException extends AuthenticationException {

    /**
     * Creates a new AuthChallengeException with a <tt>null</tt> detail message. 
     */
    public AuthChallengeException() {
        super();
    }

    /**
     * Creates a new AuthChallengeException with the specified message.
     * 
     * @param message the exception detail message
     */
    public AuthChallengeException(String message) {
        super(message);
    }

    /**
     * Creates a new AuthChallengeException with the specified detail message and cause.
     * 
     * @param message the exception detail message
     * @param cause the <tt>Throwable</tt> that caused this exception, or <tt>null</tt>
     * if the cause is unavailable, unknown, or not a <tt>Throwable</tt>
     */
    public AuthChallengeException(String message, Throwable cause) {
        super(message, cause);
    }

}
