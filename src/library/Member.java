package library;

public class Member {
    private String name;
    private String membershipId;


    public Member(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
    }


    public String getName() {
        return name;
    }

    public String getMembershipId() {
        return membershipId;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }


    public void displayMemberInfo() {
        System.out.println("Member Name: " + name + ", Membership ID: " + membershipId);
    }
}
