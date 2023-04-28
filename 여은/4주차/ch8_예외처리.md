## 예외처리
### 프로그램 오류

    컴파일 에러 | 컴파일 시에 발생하는 에러
    런타임 에러 | 실행 시에 발생하는 에러
    논리적 에러 | 실행은 되지만, 의도와 다르게 동작하는 것
    
    에러(error)     프로그램 코드에 의해서 수습될 수 없는 심각한 오류
    예외(exception) 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
    
### 예외처리하기 - try-catch문

    예외처리(exception handling)
       정의 - 프로그램 실행 시 발생할 수 있는 예외에 대비한 코드를 작성하는 것
       목적 - 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
       
       ex) 
       try { 
            // 예외가 발생할 가능성이 있는 문장들을 넣는다
       } catch (Exception1 e1) {
            // Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 적는다
       }  catch (Exception2 e2) {
            // Exception2이 발생했을 경우, 이를 처리하기 위한 문장을 적는다
       }  catch (ExceptionN eN) {
            // ExceptionN이 발생했을 경우, 이를 처리하기 위한 문장을 적는다
       } 
       
### 예외 발생시키기

    1. 먼저, 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
       Exception e = new Exception("고의로 발생시켰음");
       
    2. 키워드 throw를 이용해서 예외를 발생시킨다
       throw e;
       
###  연결된 예외 
예외 A가 예외 b를 발생시켰다면, A를 B의 '원인 예외(cause exception)'라고 한다

    Throwable initCause (Throwable cause)  - 지정한 예외를 원인 예외로 등록
    Throwable getCause()                   - 원인 예외를 반환
    
