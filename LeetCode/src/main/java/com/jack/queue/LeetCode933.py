from collections import deque


class RecentCounter(object):

    def __init__(self):
        self.q = deque()
   
    def ping(self, t):
        self.q.append(t)
        while self.q[0]< t-3000:
            self.q.popleft()
            
        return len(self.q)




if __name__ == "__main__":
    pass