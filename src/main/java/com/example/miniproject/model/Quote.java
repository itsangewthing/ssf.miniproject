package com.example.miniproject.model;

public class Quote {
    private String author;      // a
    private String quote;       // q
    private String charCount;       // c
    private String formattedQuote;       // h

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getQuote() {
        return quote;
    }
    public void setQuote(String quote) {
        this.quote = quote;
    }
    public String getCharCount() {
        return charCount;
    }
    public void setCharCount(String charCount) {
        this.charCount = charCount;
    }
    public String getFormattedQuote() {
        return formattedQuote;
    }
    public void setFormattedQuote(String formattedQuote) {
        this.formattedQuote = formattedQuote;
    }
    

    public static Quote create(JsonObject jo) {
        
        Quote quote = new Quote();
        quote.setAuthor(jo.getString("a"));
        quote.setQuote(jo.getString("q"));
        quote.setCharCount(jo.getString("c"));
        quote.setFormattedQuote(jo.getString("h"));
        // System.out.println("Quote Created: " + quote);
        return quote;
    }

    public static Quote createQuote(JsonObject jo) {
        
        Quote quote = new Quote();
        quote.setAuthor(jo.getString("a"));
        quote.setQuote(jo.getString("q"));
        quote.setFormattedQuote(jo.getString("h"));
        // System.out.println("Quote Created: " + quote);
        return quote;

    }
    
}
