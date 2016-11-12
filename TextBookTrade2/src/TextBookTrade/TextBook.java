package TextBookTrade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owenm
 */
public class TextBook {
    private String authorLastName, authorFirstName, title, isbn13, courseUsed, condition;
    private int edition;
    
    public TextBook(String t, String ln, String fn, String i, String course, int e, String c){
        title = t;
        authorLastName = ln;
        authorFirstName = fn;
        isbn13 = i;
        courseUsed = course;
        edition = e;
        condition = c;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn) {
        this.isbn13 = isbn;
    }

    public String getCourseUsed() {
        return courseUsed;
    }

    public void setCourseUsed(String courseUsed) {
        this.courseUsed = courseUsed;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
