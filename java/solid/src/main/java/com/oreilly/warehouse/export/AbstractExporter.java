package oreilly.com.example.warehouse.export;


import oreilly.com.example.warehouse.Report;

import java.io.PrintStream;
import java.util.List;

public abstract class AbstractExporter {

    private final Report report;
    private final PrintStream out;

    AbstractExporter(Report report, PrintStream out) {
        this.report = report;
        this.out = out;
    }

    public final void export() {
        beforeLabels(out);
        handleLabels(out, report.getLabels());
        afterLabels(out);

        beforeRecords(out);
        handleRecords();
        afterRecords(out);
    }

    protected void beforeLabels(PrintStream out) {
    }

    protected abstract void handleLabels(PrintStream out, List<String> labels);

    protected void afterLabels(PrintStream out) {
    }

    protected void beforeRecords(PrintStream out) {
    }

    private void handleRecords() {
        List<List<String>> records = report.getRecords();
        if (records.size() == 1) {
            handleRecord(out, records.get(0), true, true);
        } else if (records.size() >= 2) {
            handleRecord(out, records.get(0), true, false);
            for (List<String> record : records.subList(1, records.size() - 1)) {
                handleRecord(out, record, false, false);
            }
            handleRecord(out, records.get(records.size() - 1), false, true);
        }
    }

    protected abstract void handleRecord(PrintStream out, List<String> record, boolean first, boolean last);

    protected void afterRecords(PrintStream out) {
    }
}
