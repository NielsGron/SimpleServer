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

package quicksilver.webapp.simpleui.bootstrap4.layouts;

import quicksilver.webapp.simpleui.HtmlStream;
import quicksilver.webapp.simpleui.bootstrap4.components.BSComponent;
import quicksilver.webapp.simpleui.html.components.HTMLComponent;

import java.util.ArrayList;

public class BSFlowLayout implements BSLayoutManager {

    public static final BSFlowLayout INSTANCE = new BSFlowLayout();

    protected BSComponent.Alignment alignment;

    protected ArrayList<HTMLComponent> children = new ArrayList<HTMLComponent>();

    public BSFlowLayout() {
        this(BSComponent.Alignment.HORIZONTAL);
    }

    public BSFlowLayout(BSComponent.Alignment alignment) {
        this.alignment = alignment;
    }

    public HTMLComponent add(HTMLComponent component) {
        return add(component, null);
    }

    public HTMLComponent add(HTMLComponent component, Object constraint) {
        children.add(component);
        return component;
    }

    @Override
    public void render(HtmlStream stream) {

        for ( int i = 0; i < children.size(); i++ ) {
            HTMLComponent c = children.get(i);
            c.render(stream);
            if ( alignment == BSComponent.Alignment.VERTICAL ) {
                stream.writeln("<BR>");
            }
        }

    }

}
