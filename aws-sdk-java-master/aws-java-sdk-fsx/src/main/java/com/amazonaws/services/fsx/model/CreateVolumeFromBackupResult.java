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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolumeFromBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVolumeFromBackupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returned after a successful <code>CreateVolumeFromBackup</code> API operation, describing the volume just
     * created.
     * </p>
     */
    private Volume volume;

    /**
     * <p>
     * Returned after a successful <code>CreateVolumeFromBackup</code> API operation, describing the volume just
     * created.
     * </p>
     * 
     * @param volume
     *        Returned after a successful <code>CreateVolumeFromBackup</code> API operation, describing the volume just
     *        created.
     */

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    /**
     * <p>
     * Returned after a successful <code>CreateVolumeFromBackup</code> API operation, describing the volume just
     * created.
     * </p>
     * 
     * @return Returned after a successful <code>CreateVolumeFromBackup</code> API operation, describing the volume just
     *         created.
     */

    public Volume getVolume() {
        return this.volume;
    }

    /**
     * <p>
     * Returned after a successful <code>CreateVolumeFromBackup</code> API operation, describing the volume just
     * created.
     * </p>
     * 
     * @param volume
     *        Returned after a successful <code>CreateVolumeFromBackup</code> API operation, describing the volume just
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeFromBackupResult withVolume(Volume volume) {
        setVolume(volume);
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
        if (getVolume() != null)
            sb.append("Volume: ").append(getVolume());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVolumeFromBackupResult == false)
            return false;
        CreateVolumeFromBackupResult other = (CreateVolumeFromBackupResult) obj;
        if (other.getVolume() == null ^ this.getVolume() == null)
            return false;
        if (other.getVolume() != null && other.getVolume().equals(this.getVolume()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode());
        return hashCode;
    }

    @Override
    public CreateVolumeFromBackupResult clone() {
        try {
            return (CreateVolumeFromBackupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}