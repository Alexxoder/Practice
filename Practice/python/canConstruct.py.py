def beginsWith(list,word):
    if(len(word) > len(list)):
        return False
    rem = list[:len(word)]
    return word == rem

def canConstruct(target, tuple, memo):
    if(target in memo):
        return memo[target]
    if (len(target) == 0):
        return True
    
    for w in tuple:
        if (beginsWith(target,w)):
            remainder = target[len(w):]
            if(canConstruct(remainder,tuple,memo) == True):
                memo[remainder] = True
                return True
    memo[target] = False
    return False

words1 = ("ab","abc","cd","def","abcd")
target1 = "abcdef"
target2 = "skateboard"
words2 = ("bo","rd","ate","t","ska","sk","boar")
a = ""
memo = {}
memo1 = {}
memo2 = {}
print(canConstruct(a,words1,memo))
print(canConstruct(target1,words1,memo1))
print(canConstruct(target2,words2,memo2))