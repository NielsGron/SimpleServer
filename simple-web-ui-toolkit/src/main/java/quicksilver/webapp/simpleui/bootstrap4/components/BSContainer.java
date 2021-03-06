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

import quicksilver.webapp.simpleui.HtmlStream;
import quicksilver.webapp.simpleui.html.components.HTMLComponent;

public class BSContainer extends BSComponentContainer {

    private static String padding = "padding: 1px 1px 1px 1px;";

    private boolean isFluid = false;
    private int nRows = 0;
    private int nColumns = 0;

    public BSContainer(int rows, int columns) {
        isFluid = false;
        initRowsAndColumns(rows, columns);
    }

    public BSContainer(boolean fluid, int rows, int columns) {
        isFluid = fluid;
        initRowsAndColumns(rows, columns);
    }

    private void initRowsAndColumns(int rows, int columns) {
        nRows = rows;
        nColumns = columns;
        for ( int i = 0; i < rows; i++ ) {
            add(new BSRow(columns));
        }
    }

    protected void defineAttributes() {

    }

    public void render(HtmlStream stream) {

        if (nRows == 0 || nColumns == 0) {
            super.render(stream);
        } else {
            if (isFluid) {
                stream.write("<div class=\"container-fluid");
            } else {
                stream.write("<div class=\"container");
            }

            stream.writeln("\"");

            stream.write(" style=\"" + padding + "\"");

            stream.writeln(" >");

            // Render all the BSRow children
            super.renderBody(stream);
            stream.writeln("</div>");
        }

    }

    // Override add() method so that we only add BSRow components
    public HTMLComponent add(HTMLComponent component) {
        if (nRows == 0 || nColumns == 0) {
            if (component instanceof BSRow) {
                super.add(component);
                nRows++;
                nColumns = ((BSRow)component).getChildrenCount();
            } else {
                super.add(component);
            }
        } else {
            if (component instanceof BSRow) {
                super.add(component);
                nRows++;
                nColumns = ((BSRow)component).getChildrenCount();
            }
        }
        return component;
    }

    public BSRow getRow(int index) {
        return (BSRow)super.get(index);
    }

}
