// Code from "Thinking Recursively in Java", by Eric Roberts
// A recursive class for Strings
//
// This class duplicates many of the properties of the ordinary String class
// in Java, but is based on linked lists of characters; this need not be visible 
// to the client.

public class CLString {
    
// Private state for the class
    private CharCell list;

// Constructor: creates a new CLString from a standard Java String
    public CLString(String str) {
        list = toCLString(str);
    }
    
// Private constructor: CLString(list) - creates a new CLString from a character list
    private CLString(CharCell listIn) {
        this.list = listIn;
    }
    
// Method: toString()
    public String toString() {
        return toString(list);
    }
    
// Private method: toString(list) - recursively converts the character
// list to a Java String
    private String toString(CharCell list) {
        if (list == null) {
            return "";
        } else {
            return list.ch + toString(list.link);
        }
    }
    
// Method: length() - returns the number of characters in the string
    public int length() {
        return length(list);
    }
    
// Private method: length(list) - recursively calculates the length of
// the character list
    private int length(CharCell list) {
        if (list == null) {
            return 0;
        } else {
            return 1 + length(list.link);
        }
    }
    
// Method: concat(s2) - concatenates a second string onto the end of this one
    public CLString concat(CLString s2) {
        return new CLString(concat(list, s2.list));
    }

// Private method: concat(s1, s2) - creates a new list by concatenating
// CLStrings s1 and s2
    private CharCell concat(CharCell s1, CharCell s2) {
        if (s1 == null) {
            return s2;
        } else {
            CharCell newCell = new CharCell();
            newCell.ch = s1.ch;
            newCell.link = concat(s1.link, s2);
            return newCell;
        }
    }
    
// Private method: toCLString(str) - recursively creates a character list
// corresponding to the Java String input
    private CharCell toCLString(String str) {
        if (str.length() == 0) {
            return null;
        } else {
            CharCell newCell = new CharCell();
            newCell.ch = str.charAt(0);
            newCell.link = toCLString(str.substring(1));
            return newCell;
        }
    }
}

// Private class: CharCell - This class provides the structure definition
// necessary to store individual Character cells in a character list
class CharCell {
    char ch;
    CharCell link;
}                    
    