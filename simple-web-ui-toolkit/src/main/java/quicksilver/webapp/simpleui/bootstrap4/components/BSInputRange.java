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

/**
 * @see <a href='https://getbootstrap.com/docs/4.1/components/forms/#range'>Bootstrap forms</a>
 */
public class BSInputRange extends BSInput {

    public BSInputRange(String placeholder) {
        super("range", placeholder);
    }

    public BSInputRange(String placeholder, String aria_label, String aria_describedby, String id) {
        super("range", placeholder, aria_label, aria_describedby, id);
    }

    @Override
    protected String getClassNames() {
        return "form-control-range";
    }

}
