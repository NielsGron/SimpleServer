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

package quicksilver.webapp.simpleui.bootstrap4.components;

/**
 * @see <a href='https://getbootstrap.com/docs/4.1/components/dropdowns/'>Bootstrap Docs</a>
 */
public class BSDropdownMenuHeader extends BSComponentContainer {

    private int headerSize;

    public BSDropdownMenuHeader(String headerName) {
        this(headerName, 6);
    }

    public BSDropdownMenuHeader(String headerName, int headerSize) {
        this.headerSize = headerSize;
        if (headerSize < 1 || headerSize > 6) {
            throw new IllegalArgumentException("Header size must be between 1-6");
        }

        add(new BSText(headerName));
    }

    @Override
    protected void defineAttributes() {

        putComponentAttribute(COMPONENT_ATTRIB_NAME, "Dropdown-Menu-Header");
        putComponentAttribute(COMPONENT_ATTRIB_TAG_CLOSE, Boolean.TRUE);
        putComponentAttribute(COMPONENT_ATTRIB_TAG_NAME, "h" + headerSize);

        addTagAttribute("class", getClassNames());

    }

    @Override
    protected String getClassNames() {
        StringBuilder cNames = new StringBuilder();

        cNames.append("dropdown-header");

        return cNames.toString();
    }

}
