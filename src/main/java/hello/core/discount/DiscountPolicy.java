package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    //F2 누르면 오류난곳으로 이동해준다 꿀팁
    int discount(Member member, int price);

    /*
    @Return 할인 대상 금액
     */


}
