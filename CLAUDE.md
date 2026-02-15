# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 프로젝트 개요

백준 온라인 저지 문제 풀이를 위한 Java 알고리즘 연습 저장소. IntelliJ IDEA + JDK 21 기반이며 별도의 빌드 도구 없이 `out/` 폴더에 컴파일된다.

## 실행 방법

빌드 도구 없는 순수 Java 프로젝트다. 커맨드라인에서 직접 실행하려면:

```bash
# 컴파일 (프로젝트 루트에서)
javac -d out src/backjoon/sliver2/Problem1654.java

# 실행
java -cp out backjoon.sliver2.Problem1654
```

IntelliJ IDEA에서는 `Problem*.java` 파일의 `main` 메서드를 직접 실행하면 된다.

## 저장소 구조

```
src/
  backjoon/
    bronze1-3/     # 백준 브론즈 티어 문제
    sliver1-5/     # 백준 실버 티어 문제 (주요 작업 대상)
  inflearn/
    basic/         # 인프런 강의 기초 문제
  datastructure/
    linkedList/    # LinkedList 직접 구현
    queue/         # Queue 직접 구현
  Main.java        # 임시 테스트용 파일
```

## 코드 컨벤션

- 문제 하나당 `public class Problem{번호}` 클래스 하나, `main` 메서드 하나
- 패키지는 디렉토리 구조와 일치: `package backjoon.sliver2;`
- 입출력: 성능이 중요한 문제는 `Scanner` 대신 `BufferedReader` / `BufferedWriter` 사용
- 격자 탐색은 `dx[]` / `dy[]` 배열로 4방향 이동
- DFS/BFS 공유 상태(그래프, visited 배열)는 `static` 필드로 선언
- 파일명과 클래스명이 반드시 일치해야 함 (Java 규칙)
- Main.java는 연습을 하는 데에 사용되는 클래스

## 새 문제 추가 방법

1. `src/backjoon/{티어}/Problem{번호}.java` 파일 생성
2. 올바른 패키지 선언 작성
3. 모든 로직은 `public static void main(String[] args)` 안에 작성

## 학습 계획

섹션 1-11의 104문제 커리큘럼(String, Array, Two Pointers, HashMap, Stack/Queue, 정렬, DFS/BFS, Greedy, DP 알고리즘 템플릿 포함)은 `STUDY_PLAN.md` 참고.
