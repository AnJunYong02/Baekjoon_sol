t = int(input())

for i in range(t):
    arr = list(map(str,input().split()))
    arr[0] = float(arr[0])
    sta_num = arr[0]
    for k in arr:
        if k=='@': sta_num *= 3
        elif k=='%': sta_num += 5
        elif k=='#': sta_num -= 7
    print(format(sta_num, ".2f"))
        
        