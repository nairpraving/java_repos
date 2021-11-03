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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetArchitectureRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchitectureRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /** The time a Recovery Group was last assessed for recommendations in UTC ISO-8601 format. */
    private java.util.Date lastAuditTimestamp;
    /** A token that can be used to resume pagination from the end of the collection */
    private String nextToken;
    /** A list of recommendations for the customer's application */
    private java.util.List<Recommendation> recommendations;

    /**
     * The time a Recovery Group was last assessed for recommendations in UTC ISO-8601 format.
     * 
     * @param lastAuditTimestamp
     *        The time a Recovery Group was last assessed for recommendations in UTC ISO-8601 format.
     */

    public void setLastAuditTimestamp(java.util.Date lastAuditTimestamp) {
        this.lastAuditTimestamp = lastAuditTimestamp;
    }

    /**
     * The time a Recovery Group was last assessed for recommendations in UTC ISO-8601 format.
     * 
     * @return The time a Recovery Group was last assessed for recommendations in UTC ISO-8601 format.
     */

    public java.util.Date getLastAuditTimestamp() {
        return this.lastAuditTimestamp;
    }

    /**
     * The time a Recovery Group was last assessed for recommendations in UTC ISO-8601 format.
     * 
     * @param lastAuditTimestamp
     *        The time a Recovery Group was last assessed for recommendations in UTC ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchitectureRecommendationsResult withLastAuditTimestamp(java.util.Date lastAuditTimestamp) {
        setLastAuditTimestamp(lastAuditTimestamp);
        return this;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection
     * 
     * @return A token that can be used to resume pagination from the end of the collection
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchitectureRecommendationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * A list of recommendations for the customer's application
     * 
     * @return A list of recommendations for the customer's application
     */

    public java.util.List<Recommendation> getRecommendations() {
        return recommendations;
    }

    /**
     * A list of recommendations for the customer's application
     * 
     * @param recommendations
     *        A list of recommendations for the customer's application
     */

    public void setRecommendations(java.util.Collection<Recommendation> recommendations) {
        if (recommendations == null) {
            this.recommendations = null;
            return;
        }

        this.recommendations = new java.util.ArrayList<Recommendation>(recommendations);
    }

    /**
     * A list of recommendations for the customer's application
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendations(java.util.Collection)} or {@link #withRecommendations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendations
     *        A list of recommendations for the customer's application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchitectureRecommendationsResult withRecommendations(Recommendation... recommendations) {
        if (this.recommendations == null) {
            setRecommendations(new java.util.ArrayList<Recommendation>(recommendations.length));
        }
        for (Recommendation ele : recommendations) {
            this.recommendations.add(ele);
        }
        return this;
    }

    /**
     * A list of recommendations for the customer's application
     * 
     * @param recommendations
     *        A list of recommendations for the customer's application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchitectureRecommendationsResult withRecommendations(java.util.Collection<Recommendation> recommendations) {
        setRecommendations(recommendations);
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
        if (getLastAuditTimestamp() != null)
            sb.append("LastAuditTimestamp: ").append(getLastAuditTimestamp()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetArchitectureRecommendationsResult == false)
            return false;
        GetArchitectureRecommendationsResult other = (GetArchitectureRecommendationsResult) obj;
        if (other.getLastAuditTimestamp() == null ^ this.getLastAuditTimestamp() == null)
            return false;
        if (other.getLastAuditTimestamp() != null && other.getLastAuditTimestamp().equals(this.getLastAuditTimestamp()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null && other.getRecommendations().equals(this.getRecommendations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastAuditTimestamp() == null) ? 0 : getLastAuditTimestamp().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        return hashCode;
    }

    @Override
    public GetArchitectureRecommendationsResult clone() {
        try {
            return (GetArchitectureRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}