class TvTest4 {
  public staticvoid main (String args[]) {
    Tv[] tvArr = new Tv[3];    // 길이가 3인 Tv 객체 배열
    
    // Tv 객첼를 생성해서 Tv객체 배열의 각 요소에 저장
    for (int i=0; i < trArr.length; i++) {
      tvArr[i] = new tv();      // 객체 배열 생성
      tvArr[i].channel = i+10;  // tvArr[i]의 channel에 i+10을 저장
    }
    
    for (int i=0; i < tvArr.length; i++) {   // i가 배열의 길이보다 작을 때 증가
      tvArr[i].channelUp();     // tvArr[i]의 메서드를 호출 채널이 1증가
      System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
    }
  }
}
class Tv { 
  String color;
  boolean power;
  int channel;
  
  void power()  {power = !power; }
  void channelUp()  { ++channel; }
  void channelDown() { --channel; }
}
