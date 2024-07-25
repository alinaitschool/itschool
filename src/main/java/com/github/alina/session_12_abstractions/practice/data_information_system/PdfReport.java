package com.github.alina.session_12_abstractions.practice.data_information_system;

import java.util.List;

public class PdfReport extends  Report implements PDFexportable{
    public PdfReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {

    }
}
