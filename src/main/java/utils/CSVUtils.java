package utils;

import models.Sneaker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVUtils<inventory> {
    private static final char DEFAULT_SEPARATOR = ',';  // (1)

    // (2)
    public static void writeLine(Writer w, List<String> values) throws IOException {
        boolean first = true;

        StringBuilder sb = new StringBuilder();

        // (3)
        for (String value : values) {
            if (!first) {
                sb.append(DEFAULT_SEPARATOR);
            }
            sb.append(value);
            first = false;
        }
        sb.append("\n");

        w.append(sb.toString());  // (4)
    }


   }
