# 변수(Variable)   
값(data)을 저장할 수 있는 메모리상의 공간  

### ✏️변수의 선언
변수 타입 변수명;   
    
    ex) int age; // 변수타입 int , 변수명 age 선언   
변수타입은 변수에 저장될 값이 어떤 타입(type)인지를 지정
변수이름은 변수에 붙인 이름   

### ✏️변수의 초기화   
대입연산자 '=' 통해 초기화   
오른쪽의 값을 왼쪽(변수)에 저장하라는 뜻 

    ex) int age = 25; // 변수 age를 선언하고 25로 초기화 , 25를 age에 저장

타입이 같은 경우 콤마','를 구분자로 여러 변수를 한 줄에 선언

    ex) int a;            
        int b;               int a, b;
        int x = 0;    <=>    int x = 0, y = 0;
        int y = 0;

### ✏️변수의 타입   
#### 기본형   
실제 값(data)을 저장   

논리형 | boolean 

    ex) boolean a = true;
        blooean b = false;
        
    true와 false 중 하나를 값으로 갖으며, 조건식과 논리적 계산에 사용
    
문자형 | char   

    ex) char ch = 'A';
    
    문자를 저장하는데 사용되며, 변수에 하나의 문자만 저장가능
정수형 | byte, short, int, long   

    ex) 
    - 정수를 저장하는데 사용, 주로 int가 사용   
    - byte는 이진 데이터를 다룰 때 사용   
    - short은 C언어와의 호환을 위해서 추가   
실수형 | float, double

    실수를 저장하는데 사용되며, 주로 double 사용
#### 참조형   
어떤 값이 저장되어 있는 주소(memory address)를 값으로 갖는다   

    클래스이름 변수이름; // 변수의 타입이 기본형이 아닌 것들은 모두 참조변수이다 
    Data today = new Data(); // Data객체를 생성해서, 그 주소를 today에 저장  
