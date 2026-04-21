class Solution:
    def minimumHammingDistance(self, src: List[int], trg: List[int], swaps: List[List[int]]) -> int:
        # Simplified DSU implementation
        def dsu_find(dsu,x):
            dsu[x] = x if x==dsu[x]  else dsu_find(dsu,dsu[x])
            return   dsu[x]
        def dsu_join(dsu,x,y):
            if  x%2: dsu[dsu_find(dsu,x)] = dsu_find(dsu,y)
            else:    dsu[dsu_find(dsu,y)] = dsu_find(dsu,x)

        # Build freely swapped indices groups
        dsu,idxs = [*range(len(src))], defaultdict(set)
        for (a,b) in swaps:       dsu_join(dsu, a, b)
        for i in range(len(src)): idxs[dsu_find(dsu,i)].add(i)

        # Calc sum of frequency diffs for each indices group
        return  sum(
            sum( (Counter(trg[i] for i in iset) - Counter(src[i] for i in iset)).values() )
            for iset in idxs.values()
        )
