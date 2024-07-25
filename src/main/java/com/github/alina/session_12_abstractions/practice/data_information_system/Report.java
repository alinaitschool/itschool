package com.github.alina.session_12_abstractions.practice.data_information_system;

import java.util.List;

public abstract class Report {
    protected String title;
    protected List<String> data;

    public Report(String title, List<String> data) {
        this.title = title;
        this.data = data;
    }

    public abstract void showPreview();
    public void displayMetadata(){

    }
}
