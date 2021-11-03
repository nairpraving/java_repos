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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * AssignPrivateIpAddressesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignPrivateIpAddressesResultStaxUnmarshaller implements Unmarshaller<AssignPrivateIpAddressesResult, StaxUnmarshallerContext> {

    public AssignPrivateIpAddressesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssignPrivateIpAddressesResult assignPrivateIpAddressesResult = new AssignPrivateIpAddressesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return assignPrivateIpAddressesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("networkInterfaceId", targetDepth)) {
                    assignPrivateIpAddressesResult.setNetworkInterfaceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("assignedPrivateIpAddressesSet", targetDepth)) {
                    assignPrivateIpAddressesResult.withAssignedPrivateIpAddresses(new ArrayList<AssignedPrivateIpAddress>());
                    continue;
                }

                if (context.testExpression("assignedPrivateIpAddressesSet/item", targetDepth)) {
                    assignPrivateIpAddressesResult.withAssignedPrivateIpAddresses(AssignedPrivateIpAddressStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("assignedIpv4PrefixSet", targetDepth)) {
                    assignPrivateIpAddressesResult.withAssignedIpv4Prefixes(new ArrayList<Ipv4PrefixSpecification>());
                    continue;
                }

                if (context.testExpression("assignedIpv4PrefixSet/item", targetDepth)) {
                    assignPrivateIpAddressesResult.withAssignedIpv4Prefixes(Ipv4PrefixSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return assignPrivateIpAddressesResult;
                }
            }
        }
    }

    private static AssignPrivateIpAddressesResultStaxUnmarshaller instance;

    public static AssignPrivateIpAddressesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssignPrivateIpAddressesResultStaxUnmarshaller();
        return instance;
    }
}