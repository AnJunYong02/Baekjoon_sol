N = input()

if "0" not in N or sum(map(int, N)) % 3 != 0:
    print(-1)
else:
    tmp_sort = sorted(N, reverse=True)
    print("".join(tmp_sort))


