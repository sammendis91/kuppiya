package com.kuppiya.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "Question-Answer-Map", schema = "kuppiya")
public class QAMappingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "question", referencedColumnName = "id", nullable = false)
    private QuestionEntity question;
    @ManyToOne
    @JoinColumn(name = "answer", referencedColumnName = "id", nullable = false)
    private AnswerEntity answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public QuestionEntity getQuestion() {
        return question;
    }

    public void setQuestion(QuestionEntity question) {
        this.question = question;
    }

    public AnswerEntity getAnswer() {
        return answer;
    }

    public void setAnswer(AnswerEntity answer) {
        this.answer = answer;
    }
}
