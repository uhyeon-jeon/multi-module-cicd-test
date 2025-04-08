package com.video;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebSocketApplication {
    private final TestBean testBean;
    private final SubWebSocketBean subWebSocketBean;

    @Autowired
    public WebSocketApplication(TestBean testBean, SubWebSocketBean subWebSocketBean) {
        this.testBean = testBean;
        this.subWebSocketBean = subWebSocketBean;
    }

    @PostConstruct
    public void dependencyTest() {
        testBean.dependencyTest();
        subWebSocketBean.dependencyTest();
    }
    // 의존성 확인을 위한 코드 - 끝

    public static void main(String[] args) {
        SpringApplication.run(WebSocketApplication.class, args);
    }
}