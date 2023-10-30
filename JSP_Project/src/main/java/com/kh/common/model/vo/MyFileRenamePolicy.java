package com.kh.common.model.vo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.oreilly.servlet.multipart.FileRenamePolicy;

public class MyFileRenamePolicy implements FileRenamePolicy{

	//미완성된 rename 메소드를 오버라이딩 하여 구현한다.
	//기존의 파일명을 전달받아 수정작업을 거친 후 파일객체를 돌려준다.
	
	@Override
	public File rename(File origin) {
		
		//원본 파일명 추출
		String originName = origin.getName();
		//원본 파일명 : 예찬이욕설(중국어로 패드립).jpg
		//원본에서 .txt(확장자)와 같이 확장자는 꼭 추출하여 변경된 이름에 추가해서 작성해야한다.
		//수정할 파일명 : 파일 업로드시간 + 랜덤값 5자리 + 확장자
		
		//1.업로드 시간 추출
		String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
		//2. 5자리 랜덤값 뽑기
		int random = (int)(Math.random()*90000)+10000;
		
		//3.원본파일명에서 확장자 추출하기
		//확장자는 가장 마지막에 붙고 .xxx 형식이기 때문에 뒤에서부터 . 위치를 찾아 가장 먼저 찾아지는 . 을 기준으로
		//나머지 부분을 잘라내면 된다 lastIndexOf로 뒤에서부터 위치찾고 substring으로 잘라내기
		String txt = originName.substring(originName.lastIndexOf("."));
		
		//변경한 이름 형식 합치기
		String changeName = time+random+txt;
		
		//변경한 파일이름을 갖는 파일 객체반환하기
		return new File(origin.getParent(),changeName);
		
	}
	
}
