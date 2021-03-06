package javaLec.ExFileIO.ex04ByteBufferedFileCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 필터 클래스 중에 버퍼(큐 구조로 되어있는 임시 저장소)를 제공하는 클래스
 * ex)택배기사가 집합소에서 차에 택배들을 싣고 이동한다.
 * 장점 : 전송 속도가 빨라진다.
 */
public class ByteBufferedFiledCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("putty.exe");
		OutputStream out = new FileOutputStream("푸티.exe");
		BufferedInputStream bin = new BufferedInputStream(in); //디폴트로 2메가 담아둔다
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		//(어제처럼) 1바이트씩 읽어서 1바이트씩 저장하기
		//그런데 버퍼필터를 사용하기 때문에 일단 버퍼에 담는 것까지는 빨리 채워지게 된다(속도 향상을 위해 자주쓴다 ->파일이 클수록 시간차가 커진다)
		
		int copyByte = 0;
		int bData;
		
		long stime = System.currentTimeMillis();
		
		while(true) {
			bData = bin.read();
			if(bData == -1) {
				break;
			}
			bout.write(bData);
			copyByte++;
		}
		long etime = System.currentTimeMillis();
		System.out.println("복사 시간: "+ (etime - stime));
		bin.close();
		bout.close();
		System.out.println("복사된 바이트 크기: "+copyByte);
	}
}
