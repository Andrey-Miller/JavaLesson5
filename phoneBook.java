import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class phoneBook {
    Map<String, ArrayList<Integer>> phoneBook;

    public phoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addPhone(String phoneOwner, int phoneNumber) {
        if (phoneBook.containsKey(phoneOwner)) {
            phoneBook.get(phoneOwner).add(phoneNumber);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phoneNumber);
            phoneBook.put(phoneOwner, list);
        }
    }

    public String getPhone(String phoneOwner) {
        
        return "Телефоны " + phoneOwner + ": " + phoneBook.get(phoneOwner).toString();
    }

    public void printBook(){

        for (var item : phoneBook.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + " ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        phoneBook book = new phoneBook();
        book.addPhone("Mark", 80001);
        book.addPhone("Sam", 80002);
        book.addPhone("Mark", 80003);
        book.addPhone("Mark", 80004);
        book.addPhone("Sam", 80005);
        book.addPhone("Peter", 80007);
        book.addPhone("John", 80008);
        System.out.println(book.getPhone("Sam")); // вывести телефоны контакта Sam
        book.printBook(); // вывести книгу

    }


}
   