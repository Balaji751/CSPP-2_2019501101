
class Solution{
    public static void main(String[] args) {
        ContactsManager contactManager = new ContactsManager();
		contactManager.addContact(new Contact("Bob Sedgewick", "bob@gmail.com", "9999912345"));
		contactManager.addContact(new Contact("Alice", "alice@gmail.com", "9999912344"));
		contactManager.addContact(new Contact("Peter Norvig", "norvig@gmail.com", "9999912343"));
		contactManager.addContact(new Contact("Kevin Wayne", "kevin@gmail.com", "9999912342"));
        contactManager.addContact(new Contact("Greg Kedsen", "greg@gmail.com", "9999912341"));
        
        for(int i = 0; i < 5; i++){
            System.out.println(contactManager.myFriends[i]);
        }

        System.out.println("------->");

        System.out.println(contactManager.searchContactByEmail("greg@gmail.com").getPhoneNumber());
    }
}