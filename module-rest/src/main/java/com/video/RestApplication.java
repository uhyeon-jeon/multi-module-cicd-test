package com.video;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {
    private final TestBean testBean;
    private final SubRestBean subRestBean;

    @Autowired
    public RestApplication(TestBean testBean, SubRestBean subRestBean) {
        this.testBean = testBean;
        this.subRestBean = subRestBean;
    }

    @PostConstruct
    public void dependencyTest() {
        testBean.dependencyTest();
        subRestBean.dependencyTest();
    }
    // 의존성 확인을 위한 코드 - 끝

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
}