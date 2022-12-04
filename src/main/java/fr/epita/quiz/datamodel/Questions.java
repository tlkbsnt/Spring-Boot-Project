package fr.epita.quiz.datamodel;

public class Questions {
    private Integer questionNumber;
    private String question;
    private String questionTypes;

    public Questions(Integer questionNumber, String question, String questionTypes) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.questionTypes = questionTypes;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestionTypes() {
        return questionTypes;
    }

    public void setQuestionTypes(String questionTypes) {
        this.questionTypes = questionTypes;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questionNumber=" + questionNumber +
                ", question='" + question + '\'' +
                ", questionTypes='" + questionTypes + '\'' +
                '}';
    }

    public void questionForComputerScience(){

    }
    public void questionForMathematics(){

    }
    public void questionForGeology(){

    }
    public void questionForCountry(){

    }
    public void questionForHistory(){

    }
    public void questionForOther(){

    }
}
