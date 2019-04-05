package javaLec.ExFileIO.ex18RelativePath;

import java.io.File;

/* 절대 경로: D:\\destination\\putty.exe
 * 		    C:\\Program Files\\AhnLab\\V3Lite40
 * 상대 경로: 현재 기준 폴더(eclipsse에서는 현재 프로젝트 폴더)
 * 			File subDir = new File("source");
 * 			//현재 기준 폴더 아래에 source 폴더 아래 src 폴더
 * 		    File subDir = new File("source\\src");
 * 			//현재 기준 폴더 상위 폴더에 있는 putty.exe 파일
 * 			File upDir = new File("..\\putty.exe");
 * 			//현재 기준 폴더 상위 폴더에 있는 temp 폴더 내의 putty 파일
 * 			File upDir = new File("..\\temp\\putty.exe")
 * 			//현재 기준경로
 * 			File thisDir = new File(".\\temp\\putty.exe");
 */
public class RelativePath {
	public static void main(String[] args) {
		File curDir = new File(""); //현재 폴더
		System.out.println(curDir.getAbsolutePath()); //절대 경로
		File subDir = new File("src" + File.separator+"aaa");
		subDir.mkdir();
		System.out.println(subDir.getAbsolutePath()); //절대경로
		File upperDir = new File(".."+File.separator+"bbb");
		upperDir.mkdir();
		String path = upperDir.getAbsolutePath();
		System.out.println(path);
		File uDir = new File(path+File.separator +"BURT's BEES");
		uDir.mkdir();
	}

}
