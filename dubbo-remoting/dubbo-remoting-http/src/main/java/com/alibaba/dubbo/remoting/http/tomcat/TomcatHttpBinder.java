/**
 * Copyright 1999-2014 dangdang.com.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.remoting.http.tomcat;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.remoting.http.HttpBinder;
import com.alibaba.dubbo.remoting.http.HttpHandler;
import com.alibaba.dubbo.remoting.http.HttpServer;
import com.alibaba.dubbo.tracker.http.ServletFilterBuilder;

/**
 * @author lishen
 */
public class TomcatHttpBinder implements HttpBinder {

    private ServletFilterBuilder servletFilterBuilder;

    public void setServletFilterBuilder(ServletFilterBuilder servletFilterBuilder) {
        this.servletFilterBuilder = servletFilterBuilder;
    }

    public HttpServer bind(URL url, HttpHandler handler) {
        return new TomcatHttpServer(url, handler, servletFilterBuilder);
    }

}