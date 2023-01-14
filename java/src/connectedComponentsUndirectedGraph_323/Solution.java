package connectedComponentsUndirectedGraph_323;

class Solution {
	public int countComponents(int n, int[][] edges) {
		UnionFind uf = new UnionFind(n);
		
		for(int[] pair : edges) {
			uf.unify(pair[0], pair[1]);
		}
		return uf.components;
    }
}
