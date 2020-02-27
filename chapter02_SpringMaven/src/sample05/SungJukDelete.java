package sample05;

import java.util.List;
import java.util.Scanner;

import lombok.Data;

@Data
public class SungJukDelete implements SungJuk {

	private List<SungJukDTO2> list;
	private SungJukDTO2 sungJukDTO2;
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제 이름 입력: ");
		String name = scan.next();
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("찾고자하는 이름이 없습니다.");
		}else {
			list.remove(index);
			System.out.println(name+"님의 데이터를 삭제했습니다.");
		}
		
	}

	

}
