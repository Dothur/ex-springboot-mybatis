package com.example.mybatis.model;

import lombok.*;

//@Getter
//@Setter
//@RequiredArgsConstructor
//@ToString
//@EqualsAndHashCode
// 위의 5개를 @Data 가 다 처리해줌
@Data
public class Student {
    // int가 아닌 Integer같은 참조 타입으로 선언하는 이유
    // Integer는 참조타입이기때문에 null값을 넣을수 있음
    private Long id;
    private String name;
    private Integer age;
    private String phone;
    private String email;
}
