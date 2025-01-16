T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    tmp_a = a
    tmp_b = b
    while tmp_a%tmp_b!=0:
        r = tmp_a%tmp_b
        tmp_a = tmp_b
        tmp_b = r
    #최대공약수는 b값
    print(int(a*b / tmp_b))