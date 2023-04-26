# BDD FOR JAVA USING CUCUMBER

BDD trong Java là một phương pháp phát triển phần mềm tập trung vào hành vi của hệ thống, thay vì tập trung vào các tính
năng riêng lẻ của hệ thống. BDD sử dụng các đặc tả được viết bằng một ngôn ngữ dễ đọc và hiểu, để tạo ra các kịch bản
kiểm thử tự động để kiểm tra hành vi của hệ thống. BDD giúp đảm bảo tính đúng đắn của hệ thống và cung cấp tài liệu rõ
ràng về hành vi của hệ thống cho các thành viên trong dự án.

### Tóm tắt:

hiểu đơn giản thì BDD cũng mang ý tưởng tương tự như TDD.
Đều mong muốn được viết các test trước hay ở đây sẽ gọi là các Scenario.
Sau khi đã có các Scenario thì sẽ convert các Scenario đó với dev sử dụng Gherkin để impl các test.
các Scenario ở đây sẽ được viết theo dạng common như thế này

```
  Scenario: Adding two numbers
    Given I have a calculator
    When I add 4 and 2
    Then I should get 6
```

sau đó Gherkin sẽ phụ trách covert những thông tin này thành các test file sử dụng Cucumber

vì tổng thể cái này sẽ cần bên phía BA hoặc QA phải chắc chẽ hơn về vần Scenario

## Features

- demo tóm tắt cách sử dụng bdd trong java

## Prerequisites

- Java 1.8
- Maven

## Maven Dependency

```
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>4.2.0</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>4.2.0</version>
    <scope>test</scope>
</dependency>
```

- bời vì BDD được sử dụng chính cho việc viết Test nên sẽ cần thêm dependence liên quan đến unit test

```
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.12.1</version>
</dependency>
```

## Testing

run test

```shell
mvn clean test
```