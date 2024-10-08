# 1주차

소유자: Andy Lee
최종 편집 일시: 2024년 3월 12일 오전 10:02

# Java의 탄생

제임스 고슬링 - 가전 제품에 들어갈 언어를 개발

### 목적

플랫폼 호환성 문제 해결

플랫폼 독립적인 언어 개발

메모리 사용량이 적고 다양한 플랫폼을 가지는 가전 제품에 적용

## 플랫폼 독립성

CPU 아키텍쳐, OS같은 플랫폼의 종속적이지 않다.

## 객체 지향성 언어

처음 설계될 때 부터 객체 지향 언어로 만들어졌다.

### 특성: WORA (Write Once Run Anywhere)

한 번 작성된 코드는 모든 플랫폼에서 바로 실행됨

## HOW?

### **바이트 코드 형태로 번역**

자바 소스를 컴파일한 코드

cpu에 종속적이지 않은 중립 코드

### **자바 가상 기계 JVM**

바이트 코드를 가져와 플랫폼에 맞게 실행하는 가상 소프트웨어

## 자바 응용프로그램 실행 환경

소스코드(.java) →(컴파일)→ 바이트 코드(.class) → 자바 가상 기계

클래스 안의 클래스는
(상위 클래스)$(현 클래스).class 형

## 저급언어와 고급언어

고급언어는 절차 지향 언어와 객체 지향 언어로 구분

Java는 객체 지향 언어

.java →(컴파일)→ .class 실행 환경인 JRE에서 구동

.c →(컴파일)→ .obj →(linker)→ .exe