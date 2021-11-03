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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationVpcConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationVpcConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an existing application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The version of the application to which you want to add the VPC configuration. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned. For better concurrency support,
     * use the <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * Description of the VPC to add to the application.
     * </p>
     */
    private VpcConfiguration vpcConfiguration;
    /**
     * <p>
     * A value you use to implement strong concurrency for application updates. You must provide the
     * <code>ApplicationVersionID</code> or the <code>ConditionalToken</code>. You get the application's current
     * <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     */
    private String conditionalToken;

    /**
     * <p>
     * The name of an existing application.
     * </p>
     * 
     * @param applicationName
     *        The name of an existing application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an existing application.
     * </p>
     * 
     * @return The name of an existing application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an existing application.
     * </p>
     * 
     * @param applicationName
     *        The name of an existing application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationVpcConfigurationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The version of the application to which you want to add the VPC configuration. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned. For better concurrency support,
     * use the <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The version of the application to which you want to add the VPC configuration. You must provide the
     *        <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You can use the
     *        <a>DescribeApplication</a> operation to get the current application version. If the version specified is
     *        not the current version, the <code>ConcurrentModificationException</code> is returned. For better
     *        concurrency support, use the <code>ConditionalToken</code> parameter instead of
     *        <code>CurrentApplicationVersionId</code>.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * The version of the application to which you want to add the VPC configuration. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned. For better concurrency support,
     * use the <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @return The version of the application to which you want to add the VPC configuration. You must provide the
     *         <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You can use the
     *         <a>DescribeApplication</a> operation to get the current application version. If the version specified is
     *         not the current version, the <code>ConcurrentModificationException</code> is returned. For better
     *         concurrency support, use the <code>ConditionalToken</code> parameter instead of
     *         <code>CurrentApplicationVersionId</code>.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * The version of the application to which you want to add the VPC configuration. You must provide the
     * <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned. For better concurrency support,
     * use the <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The version of the application to which you want to add the VPC configuration. You must provide the
     *        <code>CurrentApplicationVersionId</code> or the <code>ConditionalToken</code>. You can use the
     *        <a>DescribeApplication</a> operation to get the current application version. If the version specified is
     *        not the current version, the <code>ConcurrentModificationException</code> is returned. For better
     *        concurrency support, use the <code>ConditionalToken</code> parameter instead of
     *        <code>CurrentApplicationVersionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationVpcConfigurationRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * Description of the VPC to add to the application.
     * </p>
     * 
     * @param vpcConfiguration
     *        Description of the VPC to add to the application.
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Description of the VPC to add to the application.
     * </p>
     * 
     * @return Description of the VPC to add to the application.
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Description of the VPC to add to the application.
     * </p>
     * 
     * @param vpcConfiguration
     *        Description of the VPC to add to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationVpcConfigurationRequest withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * A value you use to implement strong concurrency for application updates. You must provide the
     * <code>ApplicationVersionID</code> or the <code>ConditionalToken</code>. You get the application's current
     * <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @param conditionalToken
     *        A value you use to implement strong concurrency for application updates. You must provide the
     *        <code>ApplicationVersionID</code> or the <code>ConditionalToken</code>. You get the application's current
     *        <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     *        <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     */

    public void setConditionalToken(String conditionalToken) {
        this.conditionalToken = conditionalToken;
    }

    /**
     * <p>
     * A value you use to implement strong concurrency for application updates. You must provide the
     * <code>ApplicationVersionID</code> or the <code>ConditionalToken</code>. You get the application's current
     * <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @return A value you use to implement strong concurrency for application updates. You must provide the
     *         <code>ApplicationVersionID</code> or the <code>ConditionalToken</code>. You get the application's current
     *         <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     *         <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     */

    public String getConditionalToken() {
        return this.conditionalToken;
    }

    /**
     * <p>
     * A value you use to implement strong concurrency for application updates. You must provide the
     * <code>ApplicationVersionID</code> or the <code>ConditionalToken</code>. You get the application's current
     * <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     * <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * </p>
     * 
     * @param conditionalToken
     *        A value you use to implement strong concurrency for application updates. You must provide the
     *        <code>ApplicationVersionID</code> or the <code>ConditionalToken</code>. You get the application's current
     *        <code>ConditionalToken</code> using <a>DescribeApplication</a>. For better concurrency support, use the
     *        <code>ConditionalToken</code> parameter instead of <code>CurrentApplicationVersionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationVpcConfigurationRequest withConditionalToken(String conditionalToken) {
        setConditionalToken(conditionalToken);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getCurrentApplicationVersionId() != null)
            sb.append("CurrentApplicationVersionId: ").append(getCurrentApplicationVersionId()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getConditionalToken() != null)
            sb.append("ConditionalToken: ").append(getConditionalToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationVpcConfigurationRequest == false)
            return false;
        AddApplicationVpcConfigurationRequest other = (AddApplicationVpcConfigurationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getConditionalToken() == null ^ this.getConditionalToken() == null)
            return false;
        if (other.getConditionalToken() != null && other.getConditionalToken().equals(this.getConditionalToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getConditionalToken() == null) ? 0 : getConditionalToken().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationVpcConfigurationRequest clone() {
        return (AddApplicationVpcConfigurationRequest) super.clone();
    }

}