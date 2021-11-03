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
package com.amazonaws.services.iotevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateAlarmModelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAlarmModelResultJsonUnmarshaller implements Unmarshaller<CreateAlarmModelResult, JsonUnmarshallerContext> {

    public CreateAlarmModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAlarmModelResult createAlarmModelResult = new CreateAlarmModelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createAlarmModelResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    createAlarmModelResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("alarmModelArn", targetDepth)) {
                    context.nextToken();
                    createAlarmModelResult.setAlarmModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alarmModelVersion", targetDepth)) {
                    context.nextToken();
                    createAlarmModelResult.setAlarmModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdateTime", targetDepth)) {
                    context.nextToken();
                    createAlarmModelResult.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    createAlarmModelResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createAlarmModelResult;
    }

    private static CreateAlarmModelResultJsonUnmarshaller instance;

    public static CreateAlarmModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAlarmModelResultJsonUnmarshaller();
        return instance;
    }
}