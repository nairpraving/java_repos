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
package com.amazonaws.services.xray.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetTimeSeriesServiceStatisticsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetTimeSeriesServiceStatisticsRequestMarshaller {

    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> GROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupName").build();
    private static final MarshallingInfo<String> GROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GroupARN").build();
    private static final MarshallingInfo<String> ENTITYSELECTOREXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EntitySelectorExpression").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Period").build();
    private static final MarshallingInfo<Boolean> FORECASTSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForecastStatistics").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NextToken").build();

    private static final GetTimeSeriesServiceStatisticsRequestMarshaller instance = new GetTimeSeriesServiceStatisticsRequestMarshaller();

    public static GetTimeSeriesServiceStatisticsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetTimeSeriesServiceStatisticsRequest getTimeSeriesServiceStatisticsRequest, ProtocolMarshaller protocolMarshaller) {

        if (getTimeSeriesServiceStatisticsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getTimeSeriesServiceStatisticsRequest.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(getTimeSeriesServiceStatisticsRequest.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(getTimeSeriesServiceStatisticsRequest.getGroupName(), GROUPNAME_BINDING);
            protocolMarshaller.marshall(getTimeSeriesServiceStatisticsRequest.getGroupARN(), GROUPARN_BINDING);
            protocolMarshaller.marshall(getTimeSeriesServiceStatisticsRequest.getEntitySelectorExpression(), ENTITYSELECTOREXPRESSION_BINDING);
            protocolMarshaller.marshall(getTimeSeriesServiceStatisticsRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(getTimeSeriesServiceStatisticsRequest.getForecastStatistics(), FORECASTSTATISTICS_BINDING);
            protocolMarshaller.marshall(getTimeSeriesServiceStatisticsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}