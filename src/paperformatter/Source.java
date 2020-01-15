/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperformatter;

import java.io.Serializable;

/**
 *
 * @author Asha Karmakar
 */
class Source {
    
    String entry;
    String authors;
    String title;
    String location;

    public Source() {
        this.entry = "";
        this.authors = "";
        this.title = "";
        this.location = "";
    }
    
    public Source(String entry, String authors, String title, String location) {
        this.entry = entry;
        this.authors = authors;
        this.title = title;
        this.location = location;
    }
    
    public Source(String entry) {
        this.entry = entry;
    }      

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public String toString(){
        return "S: " + entry + " :E\n";
    }
    
}
