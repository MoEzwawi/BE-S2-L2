package es3;

import java.util.*;

public class PhoneRoster {
    Map<String, String> contactsMap =  new HashMap<>();

    public PhoneRoster() {
    }

    public PhoneRoster(Map<String, String> contactsMap) {
        this.contactsMap = contactsMap;
    }
    public void addNewContact(String name, String phoneNumber){
        this.contactsMap.putIfAbsent(name,phoneNumber);
    }
    public void deleteContact(String name){
        this.contactsMap.remove(name);
    }
    public String getName(String number){
        List<String> namesList = new ArrayList<>(this.contactsMap.keySet().stream().toList());
        String name = "";
        for (String s : namesList) {
            String currentNumber = contactsMap.get(s);
            if (currentNumber.equals(number)) name = s;
        }
        return name;
    }
    public String getNumber(String name){
        return this.contactsMap.get(name);
    }
    public void printAllContacts(){
        Set<String> keySet = this.contactsMap.keySet();
        System.out.println("Your contacts:");
        for(String key: keySet){
            System.out.println(" ");
            System.out.println("Name: "+key);
            System.out.println("Number: "+this.contactsMap.get(key));
        }
    }
}
