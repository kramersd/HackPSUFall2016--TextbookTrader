package TextBookTrade;


import java.util.ArrayList;

/**
 *
 * @author owenm
 */
public class Customer {
    private String fName;
    private String lName;
    private String username;
    private String password;
    private ArrayList<TextBook> myBooks;
    
    public Customer(String first, String last, String user, String pass){
        fName = first;
        lName = last;
        username = user;
        password = pass;
        myBooks = new ArrayList<TextBook>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    public void addBook(TextBook tb){
        myBooks.add(tb);
    }
    
    public void removeBook(TextBook tb){
        String ISBN = tb.getIsbn13();
        for(int i = 0; i < myBooks.size(); i++){
            if(myBooks.get(i).equals(ISBN))
                myBooks.remove(i);
        }
        
    }
}
