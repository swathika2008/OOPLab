package library;

public class Member {
    public String name;
    public int memberId;

    public Member(String name, int id) {
        this.name = name;
        this.memberId = id;
    }

    public void displayMember() {
        System.out.println("Member: " + name + " (ID: " + memberId + ")");
    }
}
