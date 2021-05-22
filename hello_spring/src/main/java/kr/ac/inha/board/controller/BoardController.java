package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class BoardController {
	@RequestMapping("/hello")
	public void hello(String num) {
		for(int i=1;i<=9;i++) {
			int n=Integer.parseInt(num);
			int ans=n*i;
			String m=String.valueOf(i);
			String a=String.valueOf(ans);
			System.out.println(num+"*"+m+"="+a); // return으로 돌리면 계속 오류가 뜨는데 해결을 못 하겠습니다..
		}
	}
}