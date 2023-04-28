# 예외처리
## 프로그램 오류
<pre>
컴파일 에러 : 컴파일 시에 발생하는 에러
런타임 에러 : 실행 시에 발생하는 에러
논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것1

에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 요류
예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
</pre>

## 예외 클래스의 계층 구조
> exception 클래스들 : 사용자의 실수와 같은 외적인 요인에 의해서 발생하는 예외     
> RuntimeException클래스들 :  프로그래머의 실수로 발생하는 예외

## 예외 처리하기 - Try - catch문

<pre>
예외처리
정의 - 프로그램 실행시 발생할 수 있는 예외에 대비한 코드를 자성하는 것
목적 - 프로그램의 비정상 종룔르 막고, 정상저긴 실생항태를 유지하는 것


try { 
   // 예외가 발생할 가능성이 있는 문장들을 넣는다
} catch (Exception1 e1) {
   // Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 적는다
}  catch (Exception2 e2) {
   // Exception2이 발생했을 경우, 이를 처리하기 위한 문장을 적는다
}  catch (ExceptionN eN) {
   // ExceptionN이 발생했을 경우, 이를 처리하기 위한 문장을 적는다
} 
</pre>

## try-catch문에서의 흐름
<pre>
>>try블럭 내에서 예외가 발생한 경우,
1. 발생한 예외와 일치하는 catch블럭이 있는지 확인한다.
2. 일치하는 catch블럭을 찾게 되면, 그 catch 블럭 내의 문장들을 수행하고 전체 try-catch문을 빠져나가서 그 다음 문자을 계속해서 수행한다. 
만일 일치하는 catch블럭을 찾지 못하면, 예외는 처리되지 못한다.

>>try블럭 내에서 예외가 발생하지 않은 경우,
1. catch블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다.
</pre>

## 예외의 발생과 catch블럭
### printStackTrace()와 getMessage()
> printStackTrace() 예외발생 당시의 호출스택에 있었던 메서드의 정보와 에외 메시지를 화면에 출력한다.
> getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.

## 예외 발생시키기
<pre>
1. 먼저, 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
      Exception e = new Exception("고의로 발생 시켰음");
2. 키워드 throw를 이용해서 에외를 발생시킨다.
      throw e;
</pre>

## 연결된 예외
> Throwable initCause (Throwable cause) : 지정한 예외를 원인 예외로 등록
Throwable getCause() : 원인 예외를 반환
