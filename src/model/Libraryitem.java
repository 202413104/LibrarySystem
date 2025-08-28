package model;


//MINSEO
abstract  class Libraryitem implements Borrowable{
    protected String title;
    public LibraryItem(String title) { this.title = title; }
    public abstract void displayInfo();
}
