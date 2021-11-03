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
package com.amazonaws.services.opsworks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Deployment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentJsonUnmarshaller implements Unmarshaller<Deployment, JsonUnmarshallerContext> {

    public Deployment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Deployment deployment = new Deployment();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DeploymentId", targetDepth)) {
                    context.nextToken();
                    deployment.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackId", targetDepth)) {
                    context.nextToken();
                    deployment.setStackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AppId", targetDepth)) {
                    context.nextToken();
                    deployment.setAppId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    deployment.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompletedAt", targetDepth)) {
                    context.nextToken();
                    deployment.setCompletedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    context.nextToken();
                    deployment.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("IamUserArn", targetDepth)) {
                    context.nextToken();
                    deployment.setIamUserArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Comment", targetDepth)) {
                    context.nextToken();
                    deployment.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Command", targetDepth)) {
                    context.nextToken();
                    deployment.setCommand(DeploymentCommandJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    deployment.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomJson", targetDepth)) {
                    context.nextToken();
                    deployment.setCustomJson(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceIds", targetDepth)) {
                    context.nextToken();
                    deployment.setInstanceIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deployment;
    }

    private static DeploymentJsonUnmarshaller instance;

    public static DeploymentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentJsonUnmarshaller();
        return instance;
    }
}