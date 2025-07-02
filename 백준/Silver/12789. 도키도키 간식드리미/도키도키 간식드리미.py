import sys
input = sys.stdin.readline
# 스택 구현
def add_stack(stack,x):
    stack.append(x)
def pop(stack):
    if len(stack) == 0:
        return print(-1)
    else:
        stack.pop()
def checkstack(stack):
    if len(stack) == 0:
        return 100000
    else:
        return stack[-1]
# 대기열 숫자
N = int(input().rstrip())

# 대기열 상태
waiting_line = list(map(int,input().rstrip().split()))
# print(waiting_line)
 # 가장 작은 수 앞의 모든 수들은 스택에 넣기
    # 여기서 스택에 들어가 있는 숫자들이 크기순으로 되어있지 않다면 sad
    # 크기순으로 들어가 있다면 
    # 가장 작은수를 리스트에서 삭제 
    # 그다음 작은 수는 스택의 맨위의 수와 리스트의 숫자들에서 추출

    # 스택에 있을경우 바로 팝 
    # 리스트에 있을경우 위와 같이 앞에 숫자들을 스택에 넣고 순서 확인
stack = []
cnt = 0
while(True):

    # print(f'시작 대기열{waiting_line}')
    # print(f'시작 스택{stack}')
    if len(waiting_line) <= 1:
        print("Nice")
        break
    
    # 가장 작은 수 찾기
    min_num = 1001
    for i in range(len(waiting_line)):
        if waiting_line[i] < min_num:
            min_num = waiting_line[i]
            # print(f'가장작은수{min_num}')
            min_index = i
            # print(f'가장 작은 수의 인덱스{min_index}')
    # 대기열의 가장 작은수와 스택의 맨위의 수 비교 후 더 스택이 더 작으면 스택 한개 팝 후 컨티뉴
    if cnt > 0:
        if min_num > checkstack(stack):
            pop(stack)
            # print("================스택이 더 큼으로 삭제후 다시시작 ================== ")
            continue
    # 가장 작은 수 앞의 숫자들 스택에 넣기
    check = False
    for i2 in range(min_index):
        add_stack(stack,waiting_line[i2]) # 스택에 추가
        # print(f'현재 스택 {stack}')
    # 스택의 순서를 확인
    for x in range(len(stack)):
        if x > 0:
            if stack[x] > stack[x-1]:
                check = True
                break


    # print(check)
    for _ in range(min_index):
        waiting_line.pop(0) # 대기열에서 삭제
        # print(f'현재 대기열 {waiting_line}')
    # 스택에 순서대로 들어가지 않으면 종료
    if check == True:
        print("Sad")
        break
    # 스택에 넣은 후 대기열 맨앞 삭제
    waiting_line.pop(0)
    cnt += 1
    # print("================루프 완료================== ")