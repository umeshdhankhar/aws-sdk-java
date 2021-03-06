/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Placeholder documentation for AvailConfiguration
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AvailConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** Ad avail settings. */
    private AvailSettings availSettings;

    /**
     * Ad avail settings.
     * 
     * @param availSettings
     *        Ad avail settings.
     */

    public void setAvailSettings(AvailSettings availSettings) {
        this.availSettings = availSettings;
    }

    /**
     * Ad avail settings.
     * 
     * @return Ad avail settings.
     */

    public AvailSettings getAvailSettings() {
        return this.availSettings;
    }

    /**
     * Ad avail settings.
     * 
     * @param availSettings
     *        Ad avail settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailConfiguration withAvailSettings(AvailSettings availSettings) {
        setAvailSettings(availSettings);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAvailSettings() != null)
            sb.append("AvailSettings: ").append(getAvailSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailConfiguration == false)
            return false;
        AvailConfiguration other = (AvailConfiguration) obj;
        if (other.getAvailSettings() == null ^ this.getAvailSettings() == null)
            return false;
        if (other.getAvailSettings() != null && other.getAvailSettings().equals(this.getAvailSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailSettings() == null) ? 0 : getAvailSettings().hashCode());
        return hashCode;
    }

    @Override
    public AvailConfiguration clone() {
        try {
            return (AvailConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AvailConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
