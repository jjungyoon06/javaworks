package collection.member;

import java.util.ArrayList;

//DAO (data access object)
public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가 메서드
	public void addMember(Member member) { //Member member = new Member(1001, "장마")
		arrayList.add(member);
	}
	
	//회원 전체 조회
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int dbMemberId = member.getMemberId(); //이미 저장한 회원 아이디
			if(dbMemberId == memberId) {
				arrayList.remove(i);
				return true;
			}
			
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
}
