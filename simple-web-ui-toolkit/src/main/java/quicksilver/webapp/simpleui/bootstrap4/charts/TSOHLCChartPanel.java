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

package quicksilver.webapp.simpleui.bootstrap4.charts;

import quicksilver.webapp.simpleui.bootstrap4.charts.plots.TSOHLCPlot;
import quicksilver.webapp.simpleui.html.components.HTMLText;
import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;

public class TSOHLCChartPanel extends TSFigurePanel {

    public TSOHLCChartPanel(Layout layout, Table table, String divName, String xCol, String openCol, String highCol, String lowCol, String closeCol) {
        super(divName);

        Figure figure = null;

        try {
            //figure = OHLCPlot.create("", table, xCol, openCol, highCol, lowCol, closeCol);
            TSOHLCPlot plot = new TSOHLCPlot(layout, table, xCol, openCol, highCol, lowCol, closeCol);
            figure = plot.getFigure();
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        HTMLText divS = new HTMLText(figure.divString(divName));
        HTMLText divJS = new HTMLText(figure.asJavascript(divName));

        this.add(divS);
        this.add(divJS);

    }

    public static Layout.LayoutBuilder createLayoutBuilder(int width, int height, boolean enabledLegend) {
        return createLayoutBuilder(width, height, 5, 5, 5, 5, enabledLegend);
    }

}
