public class control {

	public static void main(String[] args) {
		// 기상 JSON데이터를 얻기위해 필요한 요청변수를 입력해줍니다.
		// baseDate : 기준날짜, baseTime : 기준시간, x : 경도, y : 위도 참고문서를 확인하세요
	    String baseDate = "20220811"; // 어제,오늘,내일 3일 조회 가능
	    String baseTime = "0500"; // 0200, 0500, 0800, 1100, 1400, 1700, 2000, 2300
		int x = 55; 
		int y = 127;
	    
	    // 기상데이터를 얻어오는 객체를 생성
		weatherJSON vwJson = new weatherJSON();
		// 기상데이터를 JSON형태로 받아 weather에 저장
		weather vw = vwJson.getweather(baseDate, baseTime, x, y);
		// 데이터베이스에 접속에 관련하는객체를 만들고 데이터베이스에 입력
		weatherDAO vwDao = new weatherDAO();
		vwDao.intertweather(1, vw);
	}
}