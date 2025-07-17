import sys
input = sys.stdin.readline

M,N = map(int,input().split())


def Check_sosu(x):
    if x < 2:  # 0과 1은 소수가 아님
        return False
    for i in range(2,int(x**0.5)+1):
        if x%i==0:
            return False
    return True

for i in range(M,N+1):
    if Check_sosu(i) == True:
        print(i)
    else:
        pass