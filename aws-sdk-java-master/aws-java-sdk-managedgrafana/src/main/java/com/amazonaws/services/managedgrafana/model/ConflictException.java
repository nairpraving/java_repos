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
package com.amazonaws.services.managedgrafana.model;

import javax.annotation.Generated;

/**
 * <p>
 * A resource was in an inconsistent state during an update or a deletion.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.managedgrafana.model.AmazonManagedGrafanaException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of the resource that is associated with the error.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the resource that is associated with the error.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * The ID of the resource that is associated with the error.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that is associated with the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource that is associated with the error.
     * </p>
     * 
     * @return The ID of the resource that is associated with the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource that is associated with the error.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that is associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the resource that is associated with the error.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that is associated with the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource that is associated with the error.
     * </p>
     * 
     * @return The type of the resource that is associated with the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource that is associated with the error.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that is associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}