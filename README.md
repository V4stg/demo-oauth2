# demo-oauth2

## Tutorials:
* https://www.tutorialspoint.com/spring_boot/spring_boot_google_oauth2_sign_in.htm
* https://dzone.com/articles/getting-started-with-google-sign-in-in-spring-boot

## Imponrtat notes:
* Use environmental variables for client informations in application.properties
* In a new project don't forget to set the version of 'spring-security-oauth2-autoconfigure' to '2.1.0.RELEASE':
```
<dependency>
    <groupId>org.springframework.security.oauth.boot</groupId>
    <artifactId>spring-security-oauth2-autoconfigure</artifactId>
    <version>2.1.0.RELEASE</version>
</dependency>
```
