package CollectionsAsStreams.CompareMembers;

public class Member implements Comparable<Member> {
    private String name;
    private int height;
    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return String.format("%s (%d)", this.getName(), this.getHeight());
    }
    @Override
    public int compareTo(Member member) {
        if (this.height == member.getHeight()) {
            return 0;
        } else if (this.height > member.getHeight()) {
            return 1;
        } else {
            return -1;
        }
    }
    /*@Override
    public int compareTo(Member member) {
        return Integer.compare(this.height, member.getHeight());
    }*/
}
