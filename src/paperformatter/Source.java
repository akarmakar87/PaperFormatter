/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperformatter;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 *
 * @author Asha Karmakar
 */
class Source {
    
    private String entry;
    private String authors;
    private String title;
    private String url;
    private XWPFParagraph paragraph;

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
    
    public XWPFParagraph getParagraph() {
        return paragraph;
    }

    public void setParagraph(XWPFParagraph p) {
        this.paragraph = p;
    }

    public String getAuthors() {
        if(entry.contains("et. al")){
           int first = entry.indexOf(".");
           authors = entry.substring(0, first);
        }else{
           int first = entry.indexOf(",");
           authors = entry.substring(0, first);
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
        /*String date = "";
        Pattern p = Pattern.compile(("[0-9]"));
            Matcher m = p.matcher(entry);
            System.out.println("matcher to string: " + m.toString());*/
        String date = null;
        for(String d: entry.split(" ")){
            try{
                System.out.println("look for num: " + d.substring(0, d.length()-1));
                if(Integer.parseInt(d.substring(0, d.length()-1)) > 1000){
                    date = d.substring(0, d.length()-1);
                    break;
                }
            }catch(NumberFormatException e){
                
            }
        }
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
