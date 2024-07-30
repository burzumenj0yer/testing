package edu.utsa.cs3443.project.model;

import java.util.ArrayList;

public class Quiz {
    private String question;
    private String answer;
    private static Quiz instance;
    ArrayList<Quiz> flashcards = new ArrayList<Quiz>();
    ArrayList<Quiz> quizSet = new ArrayList<Quiz>();
    public Quiz(String question,String answer){
        this.question = question;
        this.answer = answer;
    }
    public static synchronized Quiz getInstance() {
        if (instance == null) {
            instance = new Quiz(null,null);
        }
        return instance;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
    public ArrayList<Quiz> getQuiz(){
        return quizSet;
    }
    public void addQuizQuestion(Quiz quiz){
        quizSet.add(quiz);
    }
    public ArrayList<Quiz> getFlashcardList() {
        return flashcards;
    }

    public void addFlashcard(Quiz flashcard) {
        flashcards.add(flashcard);
    }

    public void clearFlashcards(){
        flashcards.clear();
    }

    public void loadQuestions(){}

}
