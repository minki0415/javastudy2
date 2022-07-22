package collection.treeset;

import collection.Member;
import collection.hashset.MemberHashSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member m1 = new Member(1001, "이지원");
        Member m2 = new Member(1002, "손민국");
        Member m3 = new Member(1003, "박서훤");
        Member m4 = new Member(1004, "홍길동");

        memberTreeSet.addMember(m1);
        memberTreeSet.addMember(m2);
        memberTreeSet.addMember(m3);
        memberTreeSet.addMember(m4);
        memberTreeSet.showAllMember();

        Member m5 = new Member(1004, "홍길동");
        memberTreeSet.addMember(m5);
        memberTreeSet.showAllMember();
    }
}
