/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperformatter;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Asha Karmakar
 */
class Source {
    
    private String entry;
    private String authors;
    private String title;
    private String url;

    public Source() {
        this.entry = "";
        this.authors = "";
        this.title = "";
        this.url = "";
    }
    
    public Source(String entry, String authors, String title, String url) {
        this.entry = entry;
        this.authors = authors;
        this.title = title;
        this.url = url;
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
        if(entry.contains("et. al")){
           int first = entry.indexOf(".");
           authors = entry.substring(0, first+1);
        }else{
           int first = entry.indexOf(",");
           authors = entry.substring(0, first+1);
        }
        
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        if (!authors.contains(",")){
            title = authors;
            authors = null;
        }else{
            try {
                title = entry.split("\"")[1];
            }catch(ArrayIndexOutOfBoundsException e){
                
            }
            
        }
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public boolean isWebsite(){
        if (entry.contains("www.")){
            return true;
        }else{
            return false;
        }
    }
    
    public String getDate(){
        String date = "";
        Pattern p = Pattern.compile(("[0-9]"));
            Matcher m = p.matcher(entry);
            System.out.println("matcher to string: " + m.toString());
        return date;
    }
    
    public void clear(){
        entry = null;
        authors = null;
        title = null;
        url = null;
    }
    
    @Override
    public String toString(){
        return "S: " + entry + " :E\n";
    }
    
}
