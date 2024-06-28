package CollectionsAsStreams.CompareMembers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();
        member.add(new Member("mikael", 182));
        member.add(new Member("matti", 187));
        member.add(new Member("ada", 184));

        member.forEach(System.out::println);
        System.out.println();
        // sorting the stream that is to be printed using the sorted method
        member.stream().sorted().forEach(System.out::println);
        System.out.println();
        member.forEach(System.out::println);
        System.out.println();
        // sorting a list with the sort-method of the Collections class
        Collections.sort(member);
        member.forEach(System.out::println);
    }
}
