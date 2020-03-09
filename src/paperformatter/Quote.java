/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperformatter;

/**
 *
 * @author Asha Karmakar
 */
class Quote {

    private Source source;
    private String text;
    
    public Quote() {
        source = null;
        text = "";
    }
    
    public Quote(String t, Source s){
        source = s;
        text = t;
    } 
    
    public Quote(String t){
        text = t;
    } 

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
}
