/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kafkaconnect.model;

import javax.annotation.Generated;

/**
 * <p>
 * HTTP Status Code 503: Service Unavailable. Retrying your request in some time might resolve the issue.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceUnavailableException extends com.amazonaws.services.kafkaconnect.model.AWSKafkaConnectException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ServiceUnavailableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceUnavailableException(String message) {
        super(message);
    }

}