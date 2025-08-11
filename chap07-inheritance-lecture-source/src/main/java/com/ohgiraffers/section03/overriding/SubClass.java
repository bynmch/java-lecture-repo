package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    /* 설명.
     *  @Override
     *  1. 오버리이딩 메소드를 확인하기 용이하도록 하는 가독성의 측면
     *  2. 오버라이딩 문법 위반 시 컴파일 에러를 발생시켜 이를 명시적으로 확인하도록 하기 위함(feat. 개발 시 오류 감소)
    * */
    /* 설명. 부모 클래스의 메소드와 헤드부 완전 일치 */
    @Override
    public void method(int num) {}

    /* 설명. 부모 클래스의 메소드와 반환형 달라도 되는 경우(feat. 부모 클래스 메소드의 반환형의 자식 타입으로는 가능 */
    @Override
    public String method2(int num) {
        return null;
    }
    
    /* 설명. 부모 메소드가 private이면 오버라이딩 할 수 없다. */
//    @Override
//    private void privateMethod() {}

    /* 설명. 부모 메소드가 final이면 오버라이딩 할 수 없다. */
//    public final void finalMethod() {}

    /* 설명. protected */
    protected void protectedMethod() {}

    /* 설명. default */
    void defaultMethod() {}

}
/* 필기.
 *  클래스는 public, default 만 가능.
 *  생성자, 필드, 메소드에 접근제한자 모두 사용 가능.
 *  public: 모든 곳에서 접근 가능.
 *  protected: 같은 패키지에 있거나 다른 패키지여도 자식 클래스에서 접근 가능.
 *  default: 같은 패키지에 있는 클래스들에서 접근 가능.
 *  private: 같은 클래스에서만 접근 가능
* */