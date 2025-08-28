package model;

//MINSEO
class Book extends Libraryitem {
    public Book(String title) { super(title); }
    @Override public void borrow()     { System.out.println("책 \"" + title + "\" 을(를) 대여했습니다."); }
    @Override public void returnItem() { System.out.println("책 \"" + title + "\" 을(를) 반납했습니다."); }
    @Override public void displayInfo(){ System.out.println("[Book] " + title); }
}
