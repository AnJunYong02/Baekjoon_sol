a1, a0 = map(int, input().split())
c = int(input())
n0 = int(input())

flag = 1
for n in range (n0, 100):
    if a1 * n + a0 > c * n: # 해당 부등식이 만족하지 못하는 경우가 하나라도 있다면, -> 0 출력
        flag = 0
        break

if flag == 1: # 모든 n에 대해 만족한다면
    print(1)
else: # 하나라도 만족하지 못한다면
    print(0)