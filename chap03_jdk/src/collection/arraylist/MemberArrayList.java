package collection.arraylist;

import collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arr;

    public MemberArrayList() {
        arr = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arr.add(member);
    }

//    public boolean removeMember(int memberId) {
//        for(int i = 0 ; i < arr.size(); i++) {
//            if(arr.get(i).getMemberId() == memberId) {
//                arr.remove(i);
//                return true;
//            }
//        }
//        System.out.println(memberId+" 가 존재하지 않습니다." );
//        return false;
//    }

    //iterator 활용
    public boolean removeMember(int memberId) {
        Iterator<Member> ir = arr.iterator();
        while (ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId) {
                arr.remove(member);
                return true;
            }
        }
        System.out.println(memberId+" 가 존재하지 않습니다." );
        return false;
    }

    public void showAllMember() {
        for(Member member : arr) {
            System.out.println(member);
        }
        System.out.println();
    }
}
