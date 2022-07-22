package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member m1 = new Member(1001, "이지원");
        Member m2 = new Member(1002, "손민국");
        Member m3 = new Member(1003, "박서훤");
        Member m4 = new Member(1004, "홍길동");

        memberArrayList.addMember(m1);
        memberArrayList.addMember(m2);
        memberArrayList.addMember(m3);
        memberArrayList.addMember(m4);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(m4.getMemberId());
        memberArrayList.showAllMember();
    }
}
