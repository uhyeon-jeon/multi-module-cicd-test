package com.video;

import org.springframework.stereotype.Component;

@Component
public class SubWebSocketBean {
    public void dependencyTest() {
        System.out.println("common 모듈 로딩완료");
    }
}
