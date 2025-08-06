X = int(input())

sum = 0
group_num = 0 # 그룹 번호
group_index = 0 # 그룹 안에서 몇번째인지
for i in range(1, X+1):
    sum += i
    group_num += 1
    if X <= sum:
        group_index = X - (sum - group_num) - 1
        break

group_sum = group_num + 1 # 그룹 안 총합
if group_num % 2 == 0: # 그룹번호가 짝수라면
    top = 1
    bottom = group_sum - 1
    for _ in range(group_index):
        top += 1
        bottom -= 1
else: # 그룹번호가 홀수라면
    top = group_sum - 1
    bottom = 1
    for _ in range(group_index):
        top -= 1
        bottom += 1

print(f"{top}/{bottom}")
