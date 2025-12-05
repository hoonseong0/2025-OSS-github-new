package ch;
import java.util.Map;
import java.util.HashMap;
public class MapTest1 {
	public static void main(String[] args) {
		Map<String, Integer> student = new HashMap<>();
		
		student.put("홍길동", 90);
		student.put("배철수", 85);
		student.put("강호동", 95); 
		
		System.out.println("홍길동 점수: " + student.get("홍길동"));
		
		System.out.println("배철수 exist? " + student.containsKey("배철수") );
		if (student.containsKey("배철수")) {
			student.remove("배철수");
		}
		System.out.println("모든 학생 목록: ");
		int sum = 0;
		for (String name : student.keySet() ) {
			System.out.println(name + " -> "+ student.get(name));
			sum += student.get(name);
		}
		System.out.println("총 학생 수: "+ student.size() + " 평균 : " + sum / student.size() );
	}
}
