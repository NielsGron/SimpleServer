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

package quicksilver.webapp.simpleserver.controllers.components.navs;

import quicksilver.webapp.simpleui.bootstrap4.components.BSNavItem;
import quicksilver.webapp.simpleui.bootstrap4.components.BSNavTab;

public class NavComponents extends BSNavTab {

    public NavComponents() {

        BSNavItem bootstrap = new BSNavItem("Bootstrap", "/components/bootstrap");
        bootstrap.setActive(true);
        this.add(bootstrap);
        this.add(new BSNavItem("Tables", "/components/tables"));
        this.add(new BSNavItem("Charts", "/components/charts"));
        this.add(new BSNavItem("Data Explorer", "/components/explorer"));
        //this.add(new BSNavItem("Custom Forms", "/components/customforms"));
        //this.add(new BSNavItem("Extras", "/components/extras"));

    }

}
