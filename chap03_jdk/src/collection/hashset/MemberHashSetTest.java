package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member m1 = new Member(1001, "이지원");
        Member m2 = new Member(1002, "손민국");
        Member m3 = new Member(1003, "박서훤");
        Member m4 = new Member(1004, "홍길동");

        memberHashSet.addMember(m1);
        memberHashSet.addMember(m2);
        memberHashSet.addMember(m3);
        memberHashSet.addMember(m4);
        memberHashSet.showAllMember();

        Member m5 = new Member(1004, "홍길동");
        memberHashSet.addMember(m5);
        memberHashSet.showAllMember();
    }
}
