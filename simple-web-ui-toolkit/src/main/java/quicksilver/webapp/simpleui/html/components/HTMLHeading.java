/*
 * Copyright 2018-2020 Niels Gron and Contributors All Rights Reserved.
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

package quicksilver.webapp.simpleui.html.components;

public class HTMLHeading extends HTMLComponentContainer {

    private final int level;

    public HTMLHeading(String text, int level) {
        this.level = level;
        if (level < 1 || level > 6) {
            throw new IllegalArgumentException("Heading size must be between 1-6");
        }
        add(new HTMLText(text));
    }

    @Override
    protected void defineAttributes() {
        putComponentAttribute(COMPONENT_ATTRIB_NAME, "Heading");
        putComponentAttribute(COMPONENT_ATTRIB_TAG_CLOSE, Boolean.TRUE);
        putComponentAttribute(COMPONENT_ATTRIB_TAG_NAME, "h" + level);

        if (getClassNames() != null) {
            addTagAttribute("class", getClassNames());
        }
        //addTagAttribute("style", getStyle());
    }

}
