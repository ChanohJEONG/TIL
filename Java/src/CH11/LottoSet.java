package CH11;

import java.util.ArrayList;
import java.util.HashSet;

public class LottoSet {

	public static void main(String[] args) {
//			ArrayList<Integer> lotto = new ArrayList<>();
//			while(true){
//				int num =(int) (Math.random() * 45 + 1);
//				lotto.add(num);
//				if(lotto.size() == 6) break;
//			}
//			System.out.println(lotto);
//	}//중복됨!
	int count=0;;
	HashSet<Integer> win = new HashSet<>();
	win.add(8); win.add(14);
	win.add(17);win.add(27);
	win.add(36);win.add(45);
	
	while(true){
		HashSet<Integer> lotto = new HashSet<>();
		while(true){
			int num =(int) (Math.random() * 45 + 1);
			lotto.add(num);
			if(lotto.size() == 6) break;
			}//while
		count++;
		System.out.println(lotto);
		System.out.println(count);
		if(win.containsAll(lotto)) break;//lotto값을 다 갖는지 확인하는 것
		}//while
	
	}//main

}
