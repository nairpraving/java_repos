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
package com.amazonaws.services.managedgrafana.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.managedgrafana.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteWorkspaceRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteWorkspaceRequestProtocolMarshaller implements Marshaller<Request<DeleteWorkspaceRequest>, DeleteWorkspaceRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.REST_JSON).requestUri("/workspaces/{workspaceId}")
            .httpMethodName(HttpMethodName.DELETE).hasExplicitPayloadMember(false).hasPayloadMembers(false).serviceName("AmazonManagedGrafana").build();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory;

    public DeleteWorkspaceRequestProtocolMarshaller(com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteWorkspaceRequest> marshall(DeleteWorkspaceRequest deleteWorkspaceRequest) {

        if (deleteWorkspaceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<DeleteWorkspaceRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(SDK_OPERATION_BINDING,
                    deleteWorkspaceRequest);

            protocolMarshaller.startMarshalling();
            DeleteWorkspaceRequestMarshaller.getInstance().marshall(deleteWorkspaceRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}