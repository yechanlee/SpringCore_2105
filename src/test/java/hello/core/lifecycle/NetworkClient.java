package hello.core.lifecycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient  {

    private String url;

    public NetworkClient(){
        System.out.println("생성자 호출, url = " + url);


    }

    public void setUrl(String url){
        this.url= url;

    }

    //서비스 시작 시 호출

    public void connect(){
        System.out.println("Connect = " + url);
    }

    public void call(String message){
        System.out.println("Call: " + url + "message=" + message);
    }

    //서비스 종료 시 호출
    public void disconnect(){
        System.out.println("close");

    }

    @PostConstruct
    public void init() throws Exception {
        //의존관계 주입 끝나고 그때
        connect();
        System.out.println(" init");
        call("초기화 연결메세지");
    }

    @PreDestroy
    public void close() throws Exception {
        System.out.println(" close");
        disconnect();
    }
}
