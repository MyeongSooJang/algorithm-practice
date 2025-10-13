# 자바 알고리즘 문제풀이 학습 계획표

> **전체**: 104개 문제 / 22시간 27분  
> **목표**: 하루 1-2시간씩 꾸준히 학습  
> **기간**: 약 6-8주 완성 목표

## 📋 학습 방법
1. ✅ 문제를 먼저 20-30분 고민해보기
2. ✅ 막히면 문법만 검색해서 구현 시도
3. ✅ 안 되면 강의 힌트만 보고 다시 시도
4. ✅ 다음날 복습 필수!

---

## 📚 주차별 학습 계획

### Week 1: 기초 다지기 (String, Array)

#### 섹션 1. 체점사이트 연결과 강의자료 (5분)
- [ ] 1-1. 체점사이트 소개
- [ ] 1-2. 강의자료 다운로드
- [ ] 1-3. 학습 환경 설정

**학습 목표**: 기본 세팅 완료

---

#### 섹션 2. String(문자열) - 12개 문제 (2시간 12분)
- [ ] 2-1. 문자 찾기
- [ ] 2-2. 대소문자 변환
- [ ] 2-3. 문장 속 단어
- [ ] 2-4. 단어 뒤집기
- [ ] 2-5. 특정 문자 뒤집기
- [ ] 2-6. 중복문자제거
- [ ] 2-7. 회문 문자열
- [ ] 2-8. 팰린드롬
- [ ] 2-9. 숫자만 추출
- [ ] 2-10. 가장 짧은 문자거리
- [ ] 2-11. 문자열 압축
- [ ] 2-12. 암호

**학습 목표**: String 메서드 완벽 숙지 (charAt, substring, indexOf 등)

**자주 쓰는 String 메서드**:
```java
String str = "Hello";
str.charAt(0);           // 'H'
str.length();            // 5
str.toUpperCase();       // "HELLO"
str.toLowerCase();       // "hello"
str.substring(1, 3);     // "el"
str.indexOf('l');        // 2
str.replace('l', 'x');   // "Hexxo"
str.split(" ");          // 문자열 배열
str.toCharArray();       // char 배열
Character.isUpperCase('A');  // true
Character.isLowerCase('a');  // true
```

---

### Week 2: 배열 마스터

#### 섹션 3. Array(1, 2차원 배열) - 12개 문제 (1시간 57분)
- [ ] 3-1. 큰 수 출력하기
- [ ] 3-2. 보이는 학생
- [ ] 3-3. 가위바위보
- [ ] 3-4. 피보나치 수열
- [ ] 3-5. 소수(에라토스테네스 체)
- [ ] 3-6. 뒤집은 소수
- [ ] 3-7. 점수계산
- [ ] 3-8. 등수구하기
- [ ] 3-9. 격자판 최대합
- [ ] 3-10. 봉우리
- [ ] 3-11. 임시반장 정하기
- [ ] 3-12. 멘토링

**학습 목표**: 1차원/2차원 배열 순회 패턴 익히기

**자주 쓰는 배열 패턴**:
```java
// 1차원 배열
int[] arr = new int[5];
for (int i = 0; i < arr.length; i++) { }

// 2차원 배열
int[][] grid = new int[3][3];
for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[i].length; j++) { }
}

// 상하좌우 탐색 (dx, dy)
int[] dx = {-1, 0, 1, 0};
int[] dy = {0, 1, 0, -1};
```

---

### Week 3: 효율성 알고리즘

#### 섹션 4. Two pointers, Sliding window - 7개 문제 (1시간 27분)
- [ ] 4-1. 두 배열 합치기
- [ ] 4-2. 공통원소구하기
- [ ] 4-3. 최대 매출
- [ ] 4-4. 연속부분수열
- [ ] 4-5. 연속된 자연수의 합
- [ ] 4-6. 최대 길이 연속부분수열
- [ ] 4-7. 학급 회장

**학습 목표**: O(n²) → O(n) 효율성 개선 이해하기

**Two Pointers 기본 패턴**:
```java
int left = 0, right = 0;
while (right < n) {
    // 윈도우 확장
    sum += arr[right];
    
    // 조건 만족할 때까지 축소
    while (sum > target) {
        sum -= arr[left];
        left++;
    }
    right++;
}
```

---

### Week 4: 자료구조 기초

#### 섹션 5. HashMap, TreeSet - 5개 문제 (1시간 25분)
- [ ] 5-1. 학급 회장 (HashMap)
- [ ] 5-2. 아나그램
- [ ] 5-3. 매출액의 종류
- [ ] 5-4. 모든 아나그램 찾기
- [ ] 5-5. K번째 큰 수

**학습 목표**: HashMap, TreeSet 활용법 익히기

**자주 쓰는 컬렉션**:
```java
// HashMap - 빈도수, 개수 세기
HashMap<Character, Integer> map = new HashMap<>();
map.put('A', 1);
map.get('A');  // 1
map.getOrDefault('B', 0);  // 0
map.containsKey('A');  // true
map.remove('A');

// TreeSet - 자동 정렬
TreeSet<Integer> set = new TreeSet<>();
set.add(5);
set.first();  // 최솟값
set.last();   // 최댓값
```

---

#### 섹션 6. Stack, Queue - 8개 문제 (1시간 45분)
- [ ] 6-1. 올바른 괄호
- [ ] 6-2. 괄호문자제거
- [ ] 6-3. 크레인 인형뽑기
- [ ] 6-4. 후위식 연산
- [ ] 6-5. 쇠막대기
- [ ] 6-6. 공주 구하기
- [ ] 6-7. 교육과정 설계
- [ ] 6-8. 응급실

**학습 목표**: Stack/Queue 사용 시나리오 완벽 이해

**Stack & Queue 기본**:
```java
// Stack
Stack<Integer> stack = new Stack<>();
stack.push(1);
stack.pop();
stack.peek();
stack.isEmpty();

// Queue
Queue<Integer> queue = new LinkedList<>();
queue.offer(1);
queue.poll();
queue.peek();
queue.isEmpty();
```

---

### Week 5: 정렬과 탐색

#### 섹션 7. Sorting and Searching - 10개 문제 (2시간 14분)
- [ ] 7-1. 선택정렬
- [ ] 7-2. 버블정렬
- [ ] 7-3. 삽입정렬
- [ ] 7-4. Least Recently Used
- [ ] 7-5. 중복확인
- [ ] 7-6. 장난꾸러기
- [ ] 7-7. 좌표 정렬
- [ ] 7-8. 이분검색
- [ ] 7-9. 뮤직비디오
- [ ] 7-10. 마굿간 정하기

**학습 목표**: 정렬 알고리즘 원리 이해, 이분탐색 마스터

**정렬 & 이분탐색**:
```java
// 배열 정렬
Arrays.sort(arr);

// Comparator 정렬
Arrays.sort(arr, (a, b) -> a - b);  // 오름차순
Arrays.sort(arr, (a, b) -> b - a);  // 내림차순

// 이분탐색 템플릿
int left = 0, right = n - 1;
while (left <= right) {
    int mid = (left + right) / 2;
    if (arr[mid] == target) return mid;
    else if (arr[mid] < target) left = mid + 1;
    else right = mid - 1;
}
```

---

### Week 6-7: 그래프 탐색 (핵심!)

#### 섹션 8. Recursive, Tree, Graph(DFS, BFS 기초) - 14개 문제 (3시간 46분)
- [ ] 8-1. 재귀함수
- [ ] 8-2. 재귀함수 연습
- [ ] 8-3. 팩토리얼
- [ ] 8-4. 피보나치(재귀)
- [ ] 8-5. 이진트리순회(DFS)
- [ ] 8-6. 부분집합 구하기(DFS)
- [ ] 8-7. 이진트리 레벨탐색(BFS)
- [ ] 8-8. 송아지 찾기(BFS)
- [ ] 8-9. Tree 말단노드까지의 가장 짧은 경로(DFS)
- [ ] 8-10. Tree 말단노드까지의 가장 짧은 경로(BFS)
- [ ] 8-11. 그래프와 인접행렬
- [ ] 8-12. 경로탐색(DFS)
- [ ] 8-13. 경로탐색(인접리스트)
- [ ] 8-14. 그래프 최단거리(BFS)

**학습 목표**: DFS/BFS 기초 개념 완벽 이해

**DFS 템플릿 (반드시 암기!)**:
```java
static boolean[] visited;

void DFS(int v) {
    visited[v] = true;
    // 처리 로직
    
    for (int next : graph[v]) {
        if (!visited[next]) {
            DFS(next);
        }
    }
}
```

**BFS 템플릿 (반드시 암기!)**:
```java
void BFS(int start) {
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[n];
    
    queue.offer(start);
    visited[start] = true;
    
    while (!queue.isEmpty()) {
        int v = queue.poll();
        // 처리 로직
        
        for (int next : graph[v]) {
            if (!visited[next]) {
                queue.offer(next);
                visited[next] = true;
            }
        }
    }
}
```

---

#### 섹션 9. DFS, BFS 활용 - 16개 문제 (3시간 21분)
- [ ] 9-1. 합이 같은 부분집합(DFS)
- [ ] 9-2. 바둑이 승차(DFS)
- [ ] 9-3. 최대점수 구하기(DFS)
- [ ] 9-4. 중복순열 구하기
- [ ] 9-5. 동전교환
- [ ] 9-6. 순열 구하기
- [ ] 9-7. 수열 추측하기
- [ ] 9-8. 조합의 경우수
- [ ] 9-9. 조합 구하기
- [ ] 9-10. 미로탐색(DFS)
- [ ] 9-11. 미로의 최단거리 통로(BFS)
- [ ] 9-12. 토마토(BFS)
- [ ] 9-13. 섬나라 아일랜드(DFS)
- [ ] 9-14. 섬나라 아일랜드(BFS)
- [ ] 9-15. 피자배달거리(DFS)
- [ ] 9-16. 안전영역(DFS)

**학습 목표**: 실전 문제에 DFS/BFS 적용하기

**조합/순열 DFS 패턴**:
```java
// 조합 (nCr)
void DFS(int L, int s) {
    if (L == r) {
        // 조합 완성
        return;
    }
    for (int i = s; i < n; i++) {
        combi[L] = arr[i];
        DFS(L + 1, i + 1);
    }
}

// 순열 (nPr)
void DFS(int L) {
    if (L == r) {
        // 순열 완성
        return;
    }
    for (int i = 0; i < n; i++) {
        if (!visited[i]) {
            visited[i] = true;
            pm[L] = arr[i];
            DFS(L + 1);
            visited[i] = false;
        }
    }
}
```

---

### Week 8: 고급 알고리즘

#### 섹션 10. Greedy Algorithm - 9개 문제 (2시간 52분)
- [ ] 10-1. 씨름 선수
- [ ] 10-2. 회의실 배정
- [ ] 10-3. 결혼식
- [ ] 10-4. 최대 수입 스케쥴
- [ ] 10-5. 다익스트라 알고리즘
- [ ] 10-6. 친구인가?(Union&Find)
- [ ] 10-7. 원더랜드(크루스칼: Union&Find)
- [ ] 10-8. 원더랜드(프림: PriorityQueue)
- [ ] 10-9. 원더랜드(프림: ArrayList)

**학습 목표**: 그리디, 최단경로, MST 이해

**PriorityQueue (우선순위 큐)**:
```java
// 최소힙 (기본)
PriorityQueue<Integer> pq = new PriorityQueue<>();

// 최대힙
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

// 커스텀 정렬
PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
```

---

#### 섹션 11. Dynamic Programming - 8개 문제 (1시간 18분)
- [ ] 11-1. 계단오르기
- [ ] 11-2. 돌다리 건너기
- [ ] 11-3. 최대 부분 증가수열(LIS)
- [ ] 11-4. 동전교환(냅색)
- [ ] 11-5. 최대점수 구하기(냅색)
- [ ] 11-6. 가장 높은 탑 쌓기(LIS 응용)
- [ ] 11-7. 알리바바와 40인의 도적(Bottom-Up)
- [ ] 11-8. 알리바바와 40인의 도적(Top-Down)

**학습 목표**: DP의 핵심 패턴(메모이제이션, 점화식) 익히기

**DP 기본 패턴**:
```java
// Bottom-Up
int[] dp = new int[n + 1];
dp[0] = 0;
dp[1] = 1;
for (int i = 2; i <= n; i++) {
    dp[i] = dp[i-1] + dp[i-2];  // 점화식
}

// Top-Down (메모이제이션)
static int[] memo;
int DFS(int n) {
    if (memo[n] != 0) return memo[n];
    if (n == 0) return 0;
    if (n == 1) return 1;
    return memo[n] = DFS(n-1) + DFS(n-2);
}
```

---

## 📊 진행률 추적

### 전체 진행률
- 섹션 1: ⬜⬜⬜ (0/3)
- 섹션 2: ⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜ (0/12)
- 섹션 3: ⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜ (0/12)
- 섹션 4: ⬜⬜⬜⬜⬜⬜⬜ (0/7)
- 섹션 5: ⬜⬜⬜⬜⬜ (0/5)
- 섹션 6: ⬜⬜⬜⬜⬜⬜⬜⬜ (0/8)
- 섹션 7: ⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜ (0/10)
- 섹션 8: ⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜ (0/14)
- 섹션 9: ⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜ (0/16)
- 섹션 10: ⬜⬜⬜⬜⬜⬜⬜⬜⬜ (0/9)
- 섹션 11: ⬜⬜⬜⬜⬜⬜⬜⬜ (0/8)

**총 완료: 0/104 문제 (0%)**

---

## 💡 학습 팁

### 문제 풀이 루틴
```
1. 문제 읽기 (2분)
2. 손코딩/슈도코드 작성 (5분)
3. 구현 시도 (20분)
4. 막히면 문법만 검색
5. 그래도 안 되면 강의 힌트만 보기
6. 구현 완료 후 다른 풀이 확인
7. 다음날 반드시 복습!
```

### 중요 체크포인트
- ✅ Week 3: Two Pointers 효율성 이해했는가?
- ✅ Week 4: HashMap 활용이 자유로운가?
- ✅ Week 6-7: DFS/BFS 구현을 외웠는가? (가장 중요!)
- ✅ Week 8: DP 점화식을 스스로 세울 수 있는가?

### 막힐 때 대처법
1. 5분 이상 아무 생각 안 나면 → 문제 다시 읽기
2. 로직은 떠오르는데 구현 안 되면 → 문법만 검색
3. 30분 이상 막히면 → 강의 일부만 보고 다시 시도
4. 완전히 모르겠으면 → 강의 보고 이해 후 다음날 다시 풀기

### 자주 쓰는 입출력
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 한 줄 입력
        int n = sc.nextInt();
        String str = sc.next();
        String line = sc.nextLine();
        
        // 배열 입력
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
    }
}
```

---

## 🎯 최종 목표

- [ ] 104개 문제 모두 완료
- [ ] String/Array 문제는 눈감고 풀 수 있는 수준
- [ ] DFS/BFS 템플릿 암기
- [ ] 코딩테스트 기본기 완성

---

## 📝 일일 학습 기록

### 2025년 10월
- [ ] 10/03 (금):
- [ ] 10/04 (토):
- [ ] 10/05 (일):
- [ ] 10/06 (월):
- [ ] 10/07 (화):

*(매일 완료한 문제 번호와 간단한 소감을 적어보세요)*

---

**화이팅! 하루하루 체크하면서 성취감을 느껴보세요! 💪**