# spring-boot-skeleton-pid-port

스프링 부트 에서 application.pid, application.port 를 자동 생성 하자  
리눅스 에서 어플리케이션이 실행이 되면 예) mysql.pid 같은 현재 실행 중인 어플리케이션의 pid 가 기록이 된다.  
스프링 부트 에서는 pid 기록을 자동으로 해준다 우오아! 내가 직접 안해도됭 좋아!~ 새로워 !~
나중에 어플리케이션을 중지 해야 할때 쉽게 kill 할수 있다.
그리고 port 도 기록이 된다 우오앙!!!!!!!  
두기능 모두 spring boot 2.0 에서 추가됨  

## 목차

1. 개발환경
1. 실행하기
1. tag 예제 2가지 에 대한 소스 변경 방법
1. Programmatically
1. Configuration
1. 참조

## 1. 개발환경

- spring boot 2.1.2
- java 8

## 2. 실행하기

```bash
# gradlew bootRun
```

## 3. tag

예제를 2가지 형태로 제공 합니다.

```bash
git checkout Programmatically
git checkout Configuration
```

## 4. Programmatically

application.addListeners(ApplicationListener) 직접 소스를 추가 해서 사용 하는 방법 [WebServerPortFileWriter](https://docs.spring.io/spring-boot/docs/2.1.2.RELEASE/api/org/springframework/boot/web/context/WebServerPortFileWriter.html),[ApplicationPidFileWriter](https://docs.spring.io/spring-boot/docs/2.1.2.RELEASE/api/org/springframework/boot/context/ApplicationPidFileWriter.html)  

## 5. Configuration

resources/META-INF/spring.factories

## 6. 참조

- [59. Process Monitoring](https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-process-monitoring.html)
- [Spring boot write current port to file](https://javadeveloperzone.com/spring-boot/spring-boot-write-current-port-to-file/)
- [Spring boot ApplicationPidFileWriter Example – Process ID writer example](https://javadeveloperzone.com/spring-boot/spring-boot-applicationpidfilewriter-example-process-id-writer-example/)