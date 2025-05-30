# [Bronze III] 균형 잡힌 소떡소떡 - 25641 

[문제 링크](https://www.acmicpc.net/problem/25641) 

### 성능 요약

메모리: 14280 KB, 시간: 104 ms

### 분류

구현, 문자열

### 제출 일자

2025년 4월 20일 17:38:51

### 문제 설명

<p>소떡소떡은 기다란 꼬치에 소세지와 떡을 끼운 음식이다. 편의상 소떡소떡을 알파벳 <code>s</code>와 <code>t</code>로만 구성된 길이 $N$의 문자열로 생각하자. 알파벳 <code>s</code>는 소세지를, <code>t</code>는 떡을 의미한다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/884b11a1-23ca-4099-b3c7-70076eaa4cad/-/preview/"></p>

<p>위 그림은 길이가 $7$인 소떡소떡의 예시이다. 유진이는 소떡소떡을 먹기 전에 소떡소떡을 <em>균형 잡힌 소떡소떡</em>으로 만들려고 한다. 꼬치에 꽂힌 소세지와 떡의 개수가 같을 때 이를 <em>균형 잡힌 소떡소떡</em>이라고 한다. 단, 소세지와 떡이 한 개도 꽂혀있지 않다면 <em>균형잡힌 소떡소떡</em>이 아니다. 위 그림은 소세지가 $3$개, 떡이 $4$개 꽂혀 있기 때문에 <em>균형 잡힌 소떡소떡</em>이 아니다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/31eaac4b-36d4-4d92-90e7-6390ba3dd464/-/preview/"></p>

<p>유진이는 소떡소떡의 맨 왼쪽에 있는 소세지나 떡을 떼어낼 수 있다. 오른쪽은 손잡이 부분이기 때문에 오른쪽에서 떼어내는 것은 불가능하다. 위 그림은 소떡소떡의 맨 왼쪽에 있던 소세지를 떼어낸 그림이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1fb6f39e-75c8-4a6b-bf85-e09b9b2d6563/-/preview/"></p>

<p>위 그림은 떡 두 개를 더 떼어낸 그림이다. 소세지가 $2$개, 떡이 $2$개 꽂혀 있기 때문에 <em>균형 잡힌 소떡소떡</em>이 되었다.</p>

<p>유진이가 먹으려고 하는 소떡소떡이 주어질 때, 이러한 과정을 통해 만들 수 있는 길이가 최대인 <em>균형 잡힌 소떡소떡</em>은 어떤 모양일까?</p>

### 입력 

 <p>첫째 줄에 소떡소떡의 길이 $N(2 \le N \le 100)$이 주어진다.</p>

<p>둘째 줄에 소떡소떡을 의미하는 길이 $N$의 문자열이 주어진다. 이 문자열은 알파벳 <code>s</code>와 <code>t</code>로만 구성되어 있다.</p>

<p>위 과정을 통해 <em>균형 잡힌 소떡소떡</em>으로 만들 수 없는 입력은 주어지지 않는다.</p>

### 출력 

 <p>이러한 과정을 통해 만들 수 있는 길이가 최대인 <em>균형 잡힌 소떡소떡</em>의 모양을 출력한다.</p>

