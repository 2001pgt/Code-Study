N = int(input())
nums = list(map(int,input().split()))

# 입력받은 수들 중에서 소수 찾기
# 소수의 조건 1보다 크고, 약수가 본인과 1만 있어야 한다.
# 확인 방법 2~(n-1) 까지 수들 전부 나눴때 나머지가 0이 되는 수가 없는지 확인
# 입력받은 숫자들을 하나씩 확인
cnt = N
for i in nums:
    # 1은 소수가 아니기 때문에 제외
    if i == 1:
        cnt -= 1
    # 2는 소수이므로 넘기고 3이상 일때부터 확인시작
    elif i > 2:
        # 2 ~ 본인 제외 숫자 까지중에
        for i2 in range(2,i-1):
            # 소수가 아남이 증명되면
            if i % i2 == 0:
                #카운트 제거
                cnt -= 1
                break # 중복제거 방지를 위함
print(cnt)
