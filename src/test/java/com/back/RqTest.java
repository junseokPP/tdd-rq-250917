package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RqTest {

    @Test
    @DisplayName("getActionName(\"삭제?id=1\") : 삭제")
    public void t1() {

        Rq rq = new Rq("삭제?id=1");

        String actionName = rq.getActionName(); // 삭제
        assertThat(actionName).isEqualTo("삭제");
    }

    @Test
    @DisplayName("getActionName(\"수정?id=1\") : 수정")
    public void t2() {

        Rq rq = new Rq("수정?id=1");

        String actionName = rq.getActionName(); // 삭제
        assertThat(actionName).isEqualTo("수정");
    }

    @Test
    @DisplayName("입력값 : \"등록?이름=홍길동\" : getParam(\"이름\"): 홍길동")
    public void t3() {

        Rq rq = new Rq("등록?이름=홍길동");

        String actionName = rq.getParam("이름",""); // 삭제
        assertThat(actionName).isEqualTo("홍길동");
    }

    @Test
    @DisplayName("입력값 : \"등록?고향=서울\" : getParam(\"고향\"): 서울")
    public void t4() {

        Rq rq = new Rq("등록?고향=서울");

        String actionName = rq.getParam("고향",""); // 삭제
        assertThat(actionName).isEqualTo("서울");
    }

    @Test
    @DisplayName("입력값 : \"등록?고향=서울\" : getParam(\"고향\"): 서울")
    public void t5() {

        Rq rq = new Rq("등록?고향=서울");

        String actionName = rq.getParam("이름",""); // 삭제
        assertThat(actionName).isEqualTo("");
    }

    @Test
    @DisplayName("입력값 : \"등록?고향=서울&이름=홍길동\" : getParam(\"고향\"): 서울")
    public void t6() {

        Rq rq = new Rq("등록?고향=서울&이름=홍길동");

        String actionName = rq.getParam("고향",""); // 삭제
        assertThat(actionName).isEqualTo("서울");
    }

    @Test
    @DisplayName("입력값 : \"등록?고향=서울&이름=홍길동\" : getParam(\"이름\"): 홍길동")
    public void t7() {

        Rq rq = new Rq("등록?고향=서울&이름=홍길동");

        String actionName = rq.getParam("이름",""); // 삭제
        assertThat(actionName).isEqualTo("홍길동");
    }
}
