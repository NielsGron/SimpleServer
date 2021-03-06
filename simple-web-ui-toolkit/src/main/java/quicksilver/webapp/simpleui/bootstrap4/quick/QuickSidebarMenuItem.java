/*
 * Copyright 2018-2019 Niels Gron and Contributors All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package quicksilver.webapp.simpleui.bootstrap4.quick;

import quicksilver.webapp.simpleui.HtmlStream;
import quicksilver.webapp.simpleui.bootstrap4.components.BSNavItem;

public class QuickSidebarMenuItem extends BSNavItem {

    public QuickSidebarMenuItem(String name, String url) {
        super(name, url);
    }

    @Override
    public void renderBody(HtmlStream stream) {

        stream.writeln("  <a class=\"nav-link");

        if ( isActive() ) {
            stream.writeln(" active\"");
        } else {
            stream.writeln("\"");
        }

        stream.writeln(" href=\"" + getURL() + "\"");

        StringBuilder style = new StringBuilder("padding: 2px 7px 2px 7px;");
        if ( isActive() ) {
            //style.append("background-color: #00a3cc;");
            style.append("background-color: #08c;");
        }
        style.append("border-radius: 0px;");

        if ( style != null ) {
            stream.writeln(" style=\"" + style + "\"");
        }

        stream.writeln(" >" + getName() + "</a>");

    }

    protected String getStyle() {
        StringBuilder s = new StringBuilder();

        s.append("padding: 1px 1px 1px 1px;");

        return s.toString();
    }

}
