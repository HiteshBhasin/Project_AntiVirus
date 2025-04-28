# def addRungs(self, rungs: List[int], dist: int) -> int:
#     count =0
#     if rungs[0]>dist:
#         m=rungs[0]
#         m=(m-1)
#         count+=m        
#     for i in range(len(rungs)-1):
#         k = (rungs[i+1] - rungs[i])
#         if k>dist:
            

def maximumNumber(self, num: str, change: List[int]) -> str:           
            flag = False
            res = " "
            
            for digit in num:
                d = int(digit)
                if change[d]>d:
            
        