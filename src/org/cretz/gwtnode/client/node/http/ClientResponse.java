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
package org.cretz.gwtnode.client.node.http;

import org.cretz.gwtnode.client.JsonStringObjectMap;
import org.cretz.gwtnode.client.node.stream.ReadableStream;

import com.google.gwt.core.client.JavaScriptObject;

public class ClientResponse extends ReadableStream {

    protected ClientResponse() {
    }
    
    public final native int statusCode() /*-{
        return this.statusCode;
    }-*/;
    
    public final native String httpVersion() /*-{
        return this.httpVersion;
    }-*/;
    
    public final native int httpVersionMajor() /*-{
        return this.httpVersionMajor;
    }-*/;

    public final native int httpVersionMinor() /*-{
        return this.httpVersionMinor;
    }-*/;
    
    public final JsonStringObjectMap<String> headerMap() {
        return new JsonStringObjectMap<String>(headers());
    }

    public final native JavaScriptObject headers() /*-{
        return this.headers;
    }-*/;
    
    public final native Client client() /*-{
        return this.client;
    }-*/;
}