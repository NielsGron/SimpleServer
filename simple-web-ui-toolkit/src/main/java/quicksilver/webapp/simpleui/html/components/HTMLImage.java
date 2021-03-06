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

package quicksilver.webapp.simpleui.html.components;

public class HTMLImage extends HTMLComponent {

    protected String url;
    protected String alt;

    public HTMLImage(String url, String alt) {
        this.url = url;
        this.alt = alt;

    }

    protected void defineAttributes() {

        putComponentAttribute(COMPONENT_ATTRIB_NAME, "Image");
        putComponentAttribute(COMPONENT_ATTRIB_TAG_CLOSE, Boolean.FALSE);
        putComponentAttribute(COMPONENT_ATTRIB_TAG_NAME, "img");

        addTagAttribute("width", "16");
        addTagAttribute("height", "16");
        addTagAttribute("src", url);
        addTagAttribute("alt", alt);

    }

    public String getURL() {
        return url;
    }

    public String getALT() {
        return alt;
    }

}
