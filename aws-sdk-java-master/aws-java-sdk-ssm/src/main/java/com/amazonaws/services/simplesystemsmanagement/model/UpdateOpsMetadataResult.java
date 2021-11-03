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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateOpsMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOpsMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpsMetadata Object that was updated.
     * </p>
     */
    private String opsMetadataArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpsMetadata Object that was updated.
     * </p>
     * 
     * @param opsMetadataArn
     *        The Amazon Resource Name (ARN) of the OpsMetadata Object that was updated.
     */

    public void setOpsMetadataArn(String opsMetadataArn) {
        this.opsMetadataArn = opsMetadataArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpsMetadata Object that was updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the OpsMetadata Object that was updated.
     */

    public String getOpsMetadataArn() {
        return this.opsMetadataArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the OpsMetadata Object that was updated.
     * </p>
     * 
     * @param opsMetadataArn
     *        The Amazon Resource Name (ARN) of the OpsMetadata Object that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpsMetadataResult withOpsMetadataArn(String opsMetadataArn) {
        setOpsMetadataArn(opsMetadataArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOpsMetadataArn() != null)
            sb.append("OpsMetadataArn: ").append(getOpsMetadataArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOpsMetadataResult == false)
            return false;
        UpdateOpsMetadataResult other = (UpdateOpsMetadataResult) obj;
        if (other.getOpsMetadataArn() == null ^ this.getOpsMetadataArn() == null)
            return false;
        if (other.getOpsMetadataArn() != null && other.getOpsMetadataArn().equals(this.getOpsMetadataArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpsMetadataArn() == null) ? 0 : getOpsMetadataArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOpsMetadataResult clone() {
        try {
            return (UpdateOpsMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}