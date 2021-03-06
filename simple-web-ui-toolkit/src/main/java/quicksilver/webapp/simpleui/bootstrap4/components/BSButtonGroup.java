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

package quicksilver.webapp.simpleui.bootstrap4.components;

/*
    Example :

    <div class="btn-group" role="group" aria-label="Basic example">
        <button type="button" class="btn btn-secondary">Left</button>
        <button type="button" class="btn btn-secondary">Middle</button>
        <button type="button" class="btn btn-secondary">Right</button>
    </div>

    W3Schools : https://www.w3schools.com/bootstrap4/bootstrap_button_groups.asp
    Bootstrap Docs : https://getbootstrap.com/docs/4.1/components/button-group/
 */

public class BSButtonGroup extends BSComponentContainer {

    private boolean bToggle = false;

    public BSButtonGroup() {

    }

    public BSButtonGroup(boolean bToggle) {
        this.bToggle = bToggle;

    }

    protected void defineAttributes() {

        putComponentAttribute(COMPONENT_ATTRIB_NAME, "Button Group");
        putComponentAttribute(COMPONENT_ATTRIB_TAG_CLOSE, Boolean.TRUE);
        putComponentAttribute(COMPONENT_ATTRIB_TAG_NAME, "div");

        if ( bToggle ) {
            addTagAttribute("class", "btn-group btn-group-toggle mr-2");
            addTagAttribute("data-toggle", "buttons");
        } else {
            addTagAttribute("class", "btn-group mr-2");
        }
        addTagAttribute("role", "group");

    }

}
