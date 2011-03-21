/*
 * Copyright 2011 Chad Retz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.cretz.gwtnode.dev.debug.client.jdwp.er.mod;

import org.cretz.gwtnode.client.node.buffer.Buffer;
import org.cretz.gwtnode.dev.debug.client.jdwp.BufferUtils;

public class FieldOnlyModifier extends Modifier {

    private int referenceTypeId;
    private int fieldId;
    
    public int getReferenceTypeId() {
        return referenceTypeId;
    }
    
    public void setReferenceTypeId(int referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
    }
    
    public int getFieldId() {
        return fieldId;
    }
    
    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }
    
    @Override
    public int buildFromBuffer(Buffer buffer, int startIndex) {
        referenceTypeId = BufferUtils.toInteger(buffer.slice(startIndex, startIndex + 4));
        fieldId = BufferUtils.toInteger(buffer.slice(startIndex + 4, startIndex + 8));
        return startIndex + 8;
    }
}