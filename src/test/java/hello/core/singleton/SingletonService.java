package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    //항상 이 인스턴스만! 생성자를 프라이빗으로 막구!
    public static SingletonService getInstance(){
        return instance;
    }


    private SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
