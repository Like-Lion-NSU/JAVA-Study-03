## HTTP(Hypertext Transfer Protocol)
텍스트 기반의 통신 규약으로 인터넷에서 데이터를 주고받을 수 있는 통신   
4계층 응용 계층 프로토콜 

> 웹에서는 브라우저와 서버 간에 데이터를 주고받기 위한 방식으로 HTTP 프로토콜을 사용하고 있다.

### HTTP 프로토콜 특징
🟡 상태가 없는(stateless) 프로토콜   
> ▫️데이터를 주고 받기 위한 긱긱의 데이터 요청이 서로 독립적으로 관리가 된다        
> ▫️이전 데이터 요청과 다음 데이터 요정이 서로 관련이 없다  
  
🟡 TCP/IP를 이용하는 응용 계층 프로토콜    
🟡 연결 상태를 유지하지 않는 비연결성 프로토콜


### HTTP 프로토콜 동작방식
> 클라이언트(Client) : 요청(requests)을 보내는 쪽 (웹 관점에서는 브라우저)   
> 서버(Sever) : 요청을 받고 응답(responses)을 보내는 쪽 (데이터를 보내주는 원격지)   
 
![이미지 이름](https://t1.daumcdn.net/cfile/tistory/99836D4C5E4D1E1F05?original)    

    1) 클라이언트가 HTTP 메시지를 통해 서버에 요청을 보낸다 
    2) 서버가 클라이언트 요청에 대한 결과를 만들어서 응답을 준다
    3) 응답을 받은 클라이언트는 응답 결과를 열어서 동작을 하게 된다
    
### HTTP 메세지
✉️메세지 타입    
- 요청 (Request)    
  - 사용자가 서버에게 원하는 데이터를 요구할 때 사용
- 응답 (Response)
  - 서버가 요청받은 대로 사용자에게 데이터를 줄 때 사용

✉️메세지 구조
- 시작줄/헤더/바디 로 나눌 수 있다.    
- 시작줄
  - 요청시, 메서드와 요청 URL,HTTP 버저
  - 응답시, HTTP 버전, 상태 코드 및 사유 구절
- 헤더
  - 요청과 응답 메세지에 대한 추가적인 정보를 담고 있다.
  - Key/Value 형식으로 나타낸다
- 바디
  - 전송하고 싶은 실질적인 데이터를 나타낸다
  - 헤더를 마치고 \n 후에 나타난다   


     #### 요청 메세지 구조 예제  
        /hello.txt HTTP/1.1  // 시작줄
        User-Agent: curl/7.16.3 libcurl/7.16.3 OpenSSL/0.9.7l zlib/1.2.3  // 헤더
        Host: www.example.com					// 헤더							
        Accept-Language: en, mi			  // 헤더							
       
       
     #### 응답 메세지 구조 예제
        HTTP/1.1 200 OK
        Date: Mon, 27 Jul 2009 12:28:53 GMT
        Server: Apache
        Last-Modified: Wed, 22 Jul 2009 19:15:56 GMT
        ETag: "34aa387-d-1568eb00"
        Accept-Ranges: bytes
        Content-Length: 51
        Vary: Accept-Encoding
        Content-Type: text/plain

        Hello World! My payload includes a trailing CRLF.	// 바디
        

✉️HTTP 요청 메서드    
- GET : 존재하는 자원에 대한 요청    
- POST : 새로운 자원을 생성    
- PUT : 존재하는 자원에 대한 변경    
- DELETE : 존재하는 자원에 대한 삭제  

#### GET

    이름 그대로 어떠한 데이타를 서버로 부터 받아(GET)올때 주로 사용하는 Method.
    데이터 생성/수정/삭제 없이 받아오기만 할때 사용된다.
    가장 간단하고 많이 사용되는 HTTP Method
    
#### POST
  
     데이터를 생성/수정/삭제 할때 주로 사용되는 Method

#### PUT
  
     POST와 비슷하다. 데이터를 생성 할때 사용되는 Method.
     POST와 겹치기 때문에 PUT을 사용하는 곳도 있고 POST로 통일해서 사용하는 곳도 있는데, 
     최근 몇년 사이에 POST에 밀려서 잘 사용안되는 추세.

#### DELETE

    특정 데이터를 서버에서 삭제 요청을 보낼때 쓰이는 Method
    PUT과 마찬가지로 POST에 밀려서 잘 사용안되는 추세.




    

    


