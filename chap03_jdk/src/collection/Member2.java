package collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
    private int memberId;
    private String memberName;

    public Member2(int id, String name) {
        memberId = id;
        memberName = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public int compare(Member2 member1, Member2 member2) {
        return member1.getMemberId() - member2.getMemberId();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member2) {
            Member2 member = (Member2)obj;
            if(this.memberId == member.memberId) return true;
            else return false;
        }
        return false;
    }

}

