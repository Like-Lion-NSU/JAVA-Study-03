package likelion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

class Ex3{
    private String Name;
    private int Level;
    private int Power;

    Ex3(String Name, int Level, int hit){
        this.Name = Name;
        this.Level = Level;
        this.Power = Power;
    }
    public static void main(String[] args) {
    public String getTitleAndContent(){ return this.Name ;}
    public int getHit(){ return this.Power; }

List<Ex3> Ex3s = new ArrayList<>(Arrays.asList(
        new Ex3("James", 10 , 3000),
        new Ex3("Alice", 20, 4000),
        new Ex3("Thomas", 15 , 3500)
       ));} 


//List<String> top3 = 
//Ex3.stream()
//.sorted(Comparator.comparing(Ex3::getHit).reversed())
//.limit(3)
//.map(Ex3::getTitleAndContent)
//.collect(Collectors.toList());
//System.out.println(top3);

/* 제가 착각을 해서 스트림을 안쓰고 map만 이용해서 풀다가
마지막 문제 2번까지 거의 다 풀었을 때 스터디장님께 질문 드리려구
    연락드렸다가 스트림 이용해서 푸는걸 알게됐습니다 .. 
    제가 생각한 여유시간안에 스트림 개념을 적용 안하고 풀기도 
    어려워서 시간이 많이 간 상태였고 예제를 참고해서 해도 
    이해가 도저히 안됩니다,, 제가 천생 문돌이라서 이해가 안되면
    개념적용도 안되고 예제에 적용을 못시키겠어서 엉터리로 작성했습니다 죄송합니다 
    시험이 끝나구 답안을 보며 천천히 이해 해보겠습니다 
    
    저번 과제에도 저만 과제 2번을 못했다고 들었는데 
    혹시 제가 너무 실력이 없어서 힘드신데 나가라고 말을 
    못하고 계신거라면 편하게 연락주세요 ㅠㅠ */
