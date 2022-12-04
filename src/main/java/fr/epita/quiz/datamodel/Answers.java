package fr.epita.quiz.datamodel;

public class Answers {
    private String answer;
    private String answerOptionA;
    private String answerOptionB;
    private String answerOptionC;
    private String answerOptionD;

    public Answers(String answer, String answerOptionA, String answerOptionB, String answerOptionC, String answerOptionD) {
        this.answer = answer;
        this.answerOptionA = answerOptionA;
        this.answerOptionB = answerOptionB;
        this.answerOptionC = answerOptionC;
        this.answerOptionD = answerOptionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswerOptionA() {
        return answerOptionA;
    }

    public void setAnswerOptionA(String answerOptionA) {
        this.answerOptionA = answerOptionA;
    }

    public String getAnswerOptionB() {
        return answerOptionB;
    }

    public void setAnswerOptionB(String answerOptionB) {
        this.answerOptionB = answerOptionB;
    }

    public String getAnswerOptionC() {
        return answerOptionC;
    }

    public void setAnswerOptionC(String answerOptionC) {
        this.answerOptionC = answerOptionC;
    }

    public String getAnswerOptionD() {
        return answerOptionD;
    }

    public void setAnswerOptionD(String answerOptionD) {
        this.answerOptionD = answerOptionD;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "answer='" + answer + '\'' +
                ", answerOptionA='" + answerOptionA + '\'' +
                ", answerOptionB='" + answerOptionB + '\'' +
                ", answerOptionC='" + answerOptionC + '\'' +
                ", answerOptionD='" + answerOptionD + '\'' +
                '}';
    }
    public void answerForComputerScience(){

    }
    public void answerForMathematics(){

    }
    public void answerForGeology(){

    }
    public void answerForCountry(){

    }
    public void answerForHistory(){

    }
    public void answerForOther(){

    }
}
