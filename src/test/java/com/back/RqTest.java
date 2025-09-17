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

    @Test
    @DisplayName("입력값 : \"등록?고향=서울&이름=홍길동&성별=남자\" : getParam(\"이름\"): 홍길동")
    public void t8() {

        Rq rq = new Rq("등록?고향=서울&이름=홍길동&성별=남자");

        String actionName = rq.getParam("이름",""); // 삭제
        assertThat(actionName).isEqualTo("홍길동");
    }

    @Test
    @DisplayName("입력값 : \"등록?고향=서울&이름=홍길동&성별=남자\" : getParam(\"성별\"): 남자")
    public void t9() {

        Rq rq = new Rq("등록?고향=서울&이름=홍길동&성별=남자");

        String actionName = rq.getParam("성별",""); // 삭제
        assertThat(actionName).isEqualTo("남자");
    }

    @Test
    @DisplayName("입력값 : \"목록?page=1\" : getParam(\"page\"): 1")
    public void t10() {

        Rq rq = new Rq("목록?page=1");

        int actionName = rq.getParamAsInt("page",-1); // 삭제
        assertThat(actionName).isEqualTo(1);
    }

    @Test
    @DisplayName("입력값 : \"목록?page=2번\" : getParam(\"page\"): -1")
    public void t11() {

        Rq rq = new Rq("목록?page=2번");

        int actionName = rq.getParamAsInt("page",-1); // 삭제
        assertThat(actionName).isEqualTo(-1);
    }
}
