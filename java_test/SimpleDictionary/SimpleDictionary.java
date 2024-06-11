package SimpleDictionary;

import java.util.ArrayList;

public class SimpleDictionary {
  private ArrayList<String> books;
  private ArrayList<String> translations;
  public SimpleDictionary() {
    this.books = new ArrayList<String>();
    this.translations = new ArrayList<String>();
  }
  public void add(String book, String translation) {
    this.books.add(book);
    this.translations.add(translation);
  }
  public String translate(String book) {
    int index = this.books.indexOf(book);
    if (index != -1) {
      return this.translations.get(index);
      
    } else {
      return null;
    }    
  }
}