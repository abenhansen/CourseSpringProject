package studentcourses.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String dkName;
    private String engName;
    private String studyProgram;
    private String mandatory;
    private int ECTS;
    private String language;
    private int minStud;
    private int expStud;
    private int maxStud;
    private String prerequisites;
    private String learningOutcome;
    private String content;
    private String acitivities;
    private String examForm;
    @ManyToMany
    @JoinColumn(name = "id")
    private List<Teacher> teachers;

    public Course(String dkName, String engName, String studyProgram, String mandatory, int ECTS, String language, int minStud, int expStud, int maxStud, String prerequisites, String learningOutcome, String content, String acitivities, String examForm, List<Teacher> teachers) {
        this.dkName = dkName;
        this.engName = engName;
        this.studyProgram = studyProgram;
        this.mandatory = mandatory;
        this.ECTS = ECTS;
        this.language = language;
        this.minStud = minStud;
        this.expStud = expStud;
        this.maxStud = maxStud;
        this.prerequisites = prerequisites;
        this.learningOutcome = learningOutcome;
        this.content = content;
        this.acitivities = acitivities;
        this.examForm = examForm;
        this.teachers = teachers;
    }

    public Course() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDkName() {
        return dkName;
    }

    public void setDkName(String dkName) {
        this.dkName = dkName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getMinStud() {
        return minStud;
    }

    public void setMinStud(int minStud) {
        this.minStud = minStud;
    }

    public int getExpStud() {
        return expStud;
    }

    public void setExpStud(int expStud) {
        this.expStud = expStud;
    }

    public int getMaxStud() {
        return maxStud;
    }

    public void setMaxStud(int maxStud) {
        this.maxStud = maxStud;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getLearningOutcome() {
        return learningOutcome;
    }

    public void setLearningOutcome(String learningOutcome) {
        this.learningOutcome = learningOutcome;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAcitivities() {
        return acitivities;
    }

    public void setAcitivities(String acitivities) {
        this.acitivities = acitivities;
    }

    public String getExamForm() {
        return examForm;
    }

    public void setExamForm(String examForm) {
        this.examForm = examForm;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
