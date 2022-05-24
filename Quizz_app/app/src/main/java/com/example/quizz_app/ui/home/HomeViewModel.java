package com.example.quizz_app.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    private String docID;
    private  String name;
    private String noOfTests;

    public HomeViewModel(String docID, String name, String noOfTests) {
        this.docID = docID;
        this.name = name;
        this.noOfTests = noOfTests;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoOfTests() {
        return noOfTests;
    }

    public void setNoOfTests(String noOfTests) {
        this.noOfTests = noOfTests;
    }

    public HomeViewModel() {

    }


}