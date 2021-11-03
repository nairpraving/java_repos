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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides user and group information for document access filtering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Principal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Principal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the user or group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of principal.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     */
    private String access;
    /**
     * <p>
     * The identifier of the data source the principal should access documents from.
     * </p>
     */
    private String dataSourceId;

    /**
     * <p>
     * The name of the user or group.
     * </p>
     * 
     * @param name
     *        The name of the user or group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the user or group.
     * </p>
     * 
     * @return The name of the user or group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the user or group.
     * </p>
     * 
     * @param name
     *        The name of the user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @param type
     *        The type of principal.
     * @see PrincipalType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @return The type of principal.
     * @see PrincipalType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @param type
     *        The type of principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public Principal withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of principal.
     * </p>
     * 
     * @param type
     *        The type of principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public Principal withType(PrincipalType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     * 
     * @param access
     *        Whether to allow or deny access to the principal.
     * @see ReadAccessType
     */

    public void setAccess(String access) {
        this.access = access;
    }

    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     * 
     * @return Whether to allow or deny access to the principal.
     * @see ReadAccessType
     */

    public String getAccess() {
        return this.access;
    }

    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     * 
     * @param access
     *        Whether to allow or deny access to the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadAccessType
     */

    public Principal withAccess(String access) {
        setAccess(access);
        return this;
    }

    /**
     * <p>
     * Whether to allow or deny access to the principal.
     * </p>
     * 
     * @param access
     *        Whether to allow or deny access to the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadAccessType
     */

    public Principal withAccess(ReadAccessType access) {
        this.access = access.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the data source the principal should access documents from.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source the principal should access documents from.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source the principal should access documents from.
     * </p>
     * 
     * @return The identifier of the data source the principal should access documents from.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source the principal should access documents from.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source the principal should access documents from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAccess() != null)
            sb.append("Access: ").append(getAccess()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Principal == false)
            return false;
        Principal other = (Principal) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAccess() == null ^ this.getAccess() == null)
            return false;
        if (other.getAccess() != null && other.getAccess().equals(this.getAccess()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAccess() == null) ? 0 : getAccess().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        return hashCode;
    }

    @Override
    public Principal clone() {
        try {
            return (Principal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.PrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}