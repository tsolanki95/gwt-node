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
package org.cretz.gwtnode.client.node.tls;

import org.cretz.gwtnode.client.node.NodeJsError;
import org.cretz.gwtnode.client.node.stream.Stream;

/**
 * @author Chad Retz
 * @since 0.2.0
 */
public class CryptoStream extends Stream {

    protected CryptoStream() {
    }
    
    public final native boolean authorized() /*-{
        return this.authorized;
    }-*/;
    
    public final native NodeJsError authorizationError() /*-{
        return this.authorizationError;
    }-*/;
}