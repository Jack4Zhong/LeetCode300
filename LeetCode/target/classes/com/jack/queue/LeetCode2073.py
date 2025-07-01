class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        
        queue = deque(range(len(tickets)))
        time = 0
        
        while queue:
            current = queue.popleft()
            tickets[current] -= 1
            time += 1
            
            if tickets[current] == 0 and current == k:
                return time
            
            if tickets[current] > 0:
                queue.append(current)
                
        return time


if __name__=="__main__":
    pass
