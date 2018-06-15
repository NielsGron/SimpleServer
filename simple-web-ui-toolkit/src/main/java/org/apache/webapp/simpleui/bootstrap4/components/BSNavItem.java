/*
 * Copyright 2018 Niels Gron All Rights Reserved.
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

package org.apache.webapp.simpleui.bootstrap4.components;

import org.apache.webapp.simpleui.HtmlStream;

public class BSNavItem extends BSComponent {

    private String itemName;
    private String urlReference;
    private boolean isActive;

    public BSNavItem(String name, String url) {
        itemName = name;
        urlReference = url;
    }

    @Override
    public void render(HtmlStream stream) {
        stream.writeln("<li class=\"nav-item\">");
        if ( isActive ) {
            stream.writeln("  <a class=\"nav-link active\" href=\"" + urlReference + "\">" + itemName + "</a>");
        } else {
            stream.writeln("  <a class=\"nav-link\" href=\"" + urlReference + "\">" + itemName + "</a>");
        }
        stream.writeln("</li>");
    }

    public String getName() {
        return itemName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

}
