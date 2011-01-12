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
package org.cretz.gwtnode.client.node.process;

import org.cretz.gwtnode.client.JavaScriptFunction;
import org.cretz.gwtnode.client.JavaScriptFunctionWrapper;
import org.cretz.gwtnode.client.node.event.EventEmitter;
import org.cretz.gwtnode.client.node.event.ErrorEventHandler;
import org.cretz.gwtnode.client.node.event.ParameterlessEventHandler;
import org.cretz.gwtnode.client.node.stream.ReadableStream;
import org.cretz.gwtnode.client.node.stream.WriteableStream;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class Process extends EventEmitter {
    
    public static final native Process get() /*-{
        return process;
    }-*/;
    
    protected Process() {
    }
    
    public final void onExit(ParameterlessEventHandler handler) {
        on("exit", handler);
    }
    
    public final void onUncaughtException(ErrorEventHandler handler) {
        on("uncaughtException", handler);
    }
    
    public final void onSignal(String signal, ParameterlessEventHandler handler) {
        on(signal, handler);
    }
    
    public final native WriteableStream stdout() /*-{
        return this.stdout;
    }-*/;
    
    public final native ReadableStream openStdin() /*-{
        return this.openStdin();
    }-*/;
    
    public final native JsArrayString argv() /*-{
        return this.argv;
    }-*/;
    
    public final native String execPath() /*-{
        return this.execPath;
    }-*/;
    
    public final native void chdir(String dir) /*-{
        this.chdir(dir);
    }-*/;
    
    public final native <T extends JavaScriptObject> T compile(String code, String filename) /*-{
        return this.compile(code, filename);
    }-*/;
    
    public final native String cwd() /*-{
        return this.cwd();
    }-*/;
    
    public final native JsArrayString env() /*-{
        return this.env();
    }-*/;
    
    public final native void exit() /*-{
        process.exit();
    }-*/;
    
    public final native void exit(int code) /*-{
        process.exit(code);
    }-*/;
    
    public final native int getgid() /*-{
        return process.getgid();
    }-*/;
    
    public final native void setgid(int id) /*-{
        process.setgid(id);
    }-*/;
    
    public final native void setgid(String id) /*-{
        process.setgid(id);
    }-*/;
    
    public final native int getuid() /*-{
        return process.getuid();
    }-*/;
    
    public final native void setuid(int id) /*-{
        process.setuid(id);
    }-*/;
    
    public final native void setuid(String id) /*-{
        process.setuid(id);
    }-*/;
    
    public final native String version() /*-{
        return process.version;
    }-*/;
    
    public final native String installPrefix() /*-{
        return process.installPrefix;
    }-*/;
    
    public final native void kill(int pid) /*-{
        process.kill(pid);
    }-*/;
    
    public final void kill(int pid, String signal) {
        kill(pid, signal);
    }
    
    public final native int pid() /*-{
        return process.pid;
    }-*/;
    
    public final native String title() /*-{
        return process.title;
    }-*/;
    
    public final native void title(String title) /*-{
        process.title = title;
    }-*/;
    
    public final native String platform() /*-{
        return process.platform;
    }-*/;
    
    public final native MemoryUsage memoryUsage() /*-{
        return process.memoryUsage();
    }-*/;
    
    public final void nextTick(ParameterlessEventHandler handler) {
        nextTick(handler.getNativeFunction());
    }
    
    public final void nextTick(JavaScriptFunctionWrapper wrapper) {
        nextTick(wrapper.getNativeFunction());
    }
    
    public final native void nextTick(JavaScriptFunction func) /*-{
        process.nextTick(func);
    }-*/;
    
    public final native int umask() /*-{
        return process.umask();
    }-*/;
    
    public final native int umask(int mask) /*-{
        return process.umask(mask);
    }-*/;
}