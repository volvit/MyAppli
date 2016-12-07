package com.example.student2.myapplicationvolv;

public class TrueFalse {

    private String question;
    private boolean answer;

    public TrueFalse(String question, boolean answer) {
        this.question = question;
        this.answer = answer;
    }
    public String getQuestion() {
        return question;
    }
    public boolean isAnswer() {
        return answer;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
