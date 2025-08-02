#15분 소요

# 2로 나눠질시 -> 2로 나눔, # 2로 나눠지지 않으면 -> 끝자리에서 1뺌
# 162 -> 81 -> 8 -> 4 -> 2
# 40021 -> 4002 -> 2001 -> 200 -> 100
# 42 -> 21 -> 2
A, B = map(int, input().split())
count = 1
flag = 0

while A<B: # 4 42->21(count=2) -> 2(count=3)
    if B % 2 == 0 : # 2로 나눠질 때
        B /= 2
        count += 1
        if B < A:
            flag = 1
            break
    else: # 2로 나눠지지 않을 때 -> 끝자리에서 1 뺀다
        B = (B-1) / 10
        count += 1
        if B < A:
            flag = 1
            break

if flag == 1:
    count = -1
print(count)

