# -----------------------------------------------------------------------------
# "THE BEER-WARE LICENSE" (Revision 42):
# <nlehmann@dcc.uchile.cl> wrote this file. As long as you retain this notice
# you can do whatever you want with this stuff. If we meet some day, and you
# think this stuff is worth it, you can buy me a beer in return Nicolás Lehmann
# -----------------------------------------------------------------------------
import sys, random

MAX = 1000000000

def random_pair(max):
    a = random.randint(1, max)
    b = random.randint(1, max)
    return (a, b) if a < b else (b, a)

def random_input(N, fn):
    with open(fn, 'w') as f:
        s = set()
        f.write(str(N)+"\n")
        for i in range(N):
            (a, b) = random_pair(MAX)
            while (a,b) in s:
                (a, b) = random_pair(MAX)
            s.add((a,b))
            f.write(str(a)+" "+str(b)+"\n")

def random_small_intervals(N, fn):
    with open(fn, 'w') as f:
        s = set()
        f.write(str(N)+"\n")
        for i in range(N):
            a = random.randint(1, MAX)
            l = random.randint(1, 100)
            b = min(a+l, MAX)
            while (a,b) in s:
                a = random.randint(1, MAX)
                l = random.randint(1, 100)
                b = min(a+l, N)
            s.add((a,b))
            f.write(str(a)+" "+str(b)+"\n")

def all_included(N, fn):
    with open(fn, 'w') as f:
        f.write(str(N)+"\n")
        s = set()
        s.add((1, MAX))
        for i in range(N):
            (a, b) = random_pair(MAX)
            while (a,b) in s:
                (a, b) = random_pair(MAX)
            s.add((a,b))
        for (a,b) in s:
            f.write(str(a)+" "+str(b)+"\n")

def zero_included(N, fn):
    with open(fn, 'w') as f:
        f.write(str(N)+"\n")
        s = set()
        while len(s) < N + 1:
            s.add(random.randint(1, MAX))
        s = sorted(s)
        for i in range(N-1):
            a = s[i]
            b = s[i+1] + random.randint(0, s[i+2]-s[i+1]-1)
            f.write(str(a)+" "+str(b)+"\n")
        f.write(str(s[N-1])+" "+str(s[N])+"\n")



if __name__ == '__main__':
    random.seed()
    #########################################
    ############### Subtask 1 ###############
    #########################################
    print('Generating st1...')
    with open('st1/one-1.in', 'w') as f:
        f.write("1\n")
        f.write("1 10\n")
    with open('st1/one-2.in', 'w') as f:
        f.write("1\n")
        f.write("100 1000\n")
    with open('st1/two-no-1.in', 'w') as f:
        f.write("2\n")
        f.write("1 2\n")
        f.write("3 4\n")
    with open('st1/two-no-2.in', 'w') as f:
        f.write("2\n")
        f.write("1 5\n")
        f.write("4 6\n")
    with open('st1/two-yes-1.in', 'w') as f:
        f.write("2\n")
        f.write("1 10\n")
        f.write("1 5\n")
    with open('st1/two-yes-2.in', 'w') as f:
        f.write("2\n")
        f.write("1 5\n")
        f.write("1 10\n")
    with open('st1/two-yes-3.in', 'w') as f:
        f.write("2\n")
        f.write("1 1\n")
        f.write("1 10\n")
    with open('st1/two-yes-4.in', 'w') as f:
        f.write("2\n")
        f.write("1 10\n")
        f.write("1 1\n")
    #########################################
    ############### Subtask 2 ###############
    #########################################
    print('Generating st2...')
    with open('st2/two-yes-2.in', 'w') as f:
        f.write("2\n")
        f.write("1 5\n")
        f.write("1 10\n")
    for i in range(10):
        N = random.randint(80, 100)
        random_input(N, 'st2/random-%02d.in' % i)
    for i in range(5):
        N = random.randint(80, 100)
        all_included(N, 'st2/all-included-%02d.in' % i)
    for i in range(5):
        N = random.randint(80, 100)
        zero_included(N, 'st2/zero-included-%02d.in' % i)
    #########################################
    ############### Subtask 3 ###############
    #########################################
    print('Generating st3...')
    with open('st3/two-yes-2.in', 'w') as f:
        f.write("2\n")
        f.write("1 5\n")
        f.write("1 10\n")
    print('  [Generating random]')
    for i in range(10):
        N = random.randint(80000, 100000)
        random_input(N, 'st3/random-%02d.in' % i)
    print('  [Generating all-included]')
    for i in range(5):
        N = random.randint(80000, 100000)
        all_included(N, 'st3/all-included-%02d.in' % i)
    print('  [Generating zero-included]')
    for i in range(5):
        N = random.randint(80000, 100000)
        zero_included(N, 'st3/zero-included-%02d.in' % i)
    print('  [Generating random-small-intervals]')
    for i in range(5):
        N = random.randint(80000, 100000)
        random_small_intervals(N, 'st3/random-small-intervals-%02d.in' % i)

