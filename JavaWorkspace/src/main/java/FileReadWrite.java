import org.json.JSONObject;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(new File("/Users/1004678/Desktop/parsingErrorLog/test.log"));
        InputStreamReader isr = new InputStreamReader(fis, "ISO-8859-1");
//        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
//        InputStreamReader isr = new InputStreamReader(fis, "MS949");
//        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bfr = new BufferedReader(isr);

        //FileInputStreamTest파일.txt를 읽어온다.
        int read = 0; //한글자씩 읽어 온다.
        StringBuffer sb = new StringBuffer();

        while ((read = bfr.read()) != -1) { //읽어올 값이 없으면 -1을 반환하여, while문을 나간다.
            System.out.print(read); //숫자를 문자로 변환해서 출력한다.
            sb.append((char)read);
        }

        System.out.println();

        fis.close(); //FileInputStream을 닫아준다. (중요!)


        JSONObject jObject = new JSONObject(sb.toString());
        System.out.println(jObject.get("raw_data"));

        System.out.println(jObject.get("raw_data").toString().length());


    }
}