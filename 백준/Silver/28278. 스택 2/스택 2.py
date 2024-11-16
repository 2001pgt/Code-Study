import sys
input = sys.stdin.readline
stack = []
N = int(input().strip())

def add_stack(stack,x):
    stack.append(x)
    
def pop(stack):
    if len(stack) == 0:
        return print(-1)
    else:
        print(stack[-1])
        stack.pop()

def getStack(stack):
    return len(stack)

def clean_check_stack(stack):
    if len(stack) == 0:
        return 1
    else:
        return 0
def checkstack(stack):
    if len(stack) == 0:
        return -1
    else:
        return stack[-1]

for _ in range(N):
    # 숫자 입력
    c = input().strip()
    if len(c) == 1:
        a = int(c)
        b = None
    else:
        a = int(c[0])
        b = int("".join(c[-(len(c)-1):]))
    
    # 1 : 정수 X를 스택에 넣는다.
    if a == 1:
        add_stack(stack,b)
    # 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    elif a == 2:
        pop(stack)
    # 3: 스택에 들어있는 정수의 개수를 출력한다.
    elif a == 3:
        print(getStack(stack))
    # 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
    elif a == 4:
        print(clean_check_stack(stack))
    # 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
    elif a == 5:
        print(checkstack(stack))
    