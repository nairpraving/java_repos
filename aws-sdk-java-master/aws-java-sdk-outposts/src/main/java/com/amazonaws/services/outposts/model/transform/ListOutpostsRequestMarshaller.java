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
package com.amazonaws.services.outposts.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.outposts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListOutpostsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListOutpostsRequestMarshaller {

    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("NextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("MaxResults").build();
    private static final MarshallingInfo<List> LIFECYCLESTATUSFILTER_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("LifeCycleStatusFilter").build();
    private static final MarshallingInfo<List> AVAILABILITYZONEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("AvailabilityZoneFilter").build();
    private static final MarshallingInfo<List> AVAILABILITYZONEIDFILTER_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("AvailabilityZoneIdFilter").build();

    private static final ListOutpostsRequestMarshaller instance = new ListOutpostsRequestMarshaller();

    public static ListOutpostsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListOutpostsRequest listOutpostsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listOutpostsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listOutpostsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listOutpostsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listOutpostsRequest.getLifeCycleStatusFilter(), LIFECYCLESTATUSFILTER_BINDING);
            protocolMarshaller.marshall(listOutpostsRequest.getAvailabilityZoneFilter(), AVAILABILITYZONEFILTER_BINDING);
            protocolMarshaller.marshall(listOutpostsRequest.getAvailabilityZoneIdFilter(), AVAILABILITYZONEIDFILTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}