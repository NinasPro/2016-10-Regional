import sys
import random


def generate(stream, nsongs=random.randint(0, 300000), capsongs=5999, time=random.randint(0, 5999), exact=False):
    stream.write("{} {}\n".format(time // 60, time % 60))
    stream.write("{}\n".format(nsongs))
    for _ in range(nsongs):
        stream.write("{} {}\n".format(random.randint(0, capsongs // 60), 0 if exact else random.randint(0, 60)))


def main():
    #3-6
    #generate(sys.stdout, nsongs=random.randint(5, 20), capsongs=60 * 10, time=random.randint(0, 45), exact=True)
    #7-10
    #generate(sys.stdout, capsongs=60 * 10, exact=True)
    #15-18
    #generate(sys.stdout, capsongs=60 * 10)
    #19-22
    #generate(sys.stdout)
    #23
    #generate(sys.stdout, nsongs=300000, time=5999)
    #24
    #generate(sys.stdout, nsongs=300000, time=5999, capsongs=2)


if __name__ == "__main__":
    main()
