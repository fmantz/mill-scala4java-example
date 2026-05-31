/**
 * Copyright (c) 2026 Florian Mantz
 * under MIT - License (see LICENSE file)
 */
import example.ExampleJavaLibFacade;
import example.ExampleScalaLib;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // pure java:
        var rs1 = ExampleJavaLibFacade.generateHtmlHeadLine("<hello>");

        var data = new ExampleJavaLibFacade.TableData(
                List.of("alpha", "beta", "gamma"),
                List.of(
                        List.of("1", "2", "3"),
                        List.of("10", "20", "30")
                )
        );

        // scala class used as java class:
        var rs2 = ExampleJavaLibFacade.generateHtmlTable(data);

        // can be used as well (but not with scala classes as parameters)
        // since all scala code is shaded
        var rs3 = ExampleScalaLib.generateHtmlHeadLine("<test>");
        var rs4 = ExampleScalaLib.generateHtmlTable(new String[]{"A", "B", "C"}, new String[][]{new String[]{"1", "2", "3"}, new String[]{"10", "20", "30"}});

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
        System.out.println(rs4);
    }
}
