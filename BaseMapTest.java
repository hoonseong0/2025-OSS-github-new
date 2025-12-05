package ch;
import java.util.HashMap;
import java.util.Map;
public class BaseMapTest {
	public static void main(String[] args) {
		Map<String, Integer> scoreMap = new HashMap<>();
		
		scoreMap.put("홍길동", 90);
		scoreMap.put("김철수", 85);
		scoreMap.put("이영희", 95);
		
		System.out.println("홍길동 점수: " + scoreMap.get("홍길동"));
		
		System.out.println("김철수 존재? " + scoreMap.containsKey("김철수"));
		
		scoreMap.remove("김철수");
		
		System.out.println("모든 학생 목록: ");
		for (String name: scoreMap.keySet()) {
			System.out.println(name + " -> " + scoreMap.get(name));
		}
		
		System.out.println("총 학생 수: " + scoreMap.size());
	}
}
