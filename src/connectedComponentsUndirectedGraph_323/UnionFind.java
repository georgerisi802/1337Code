package connectedComponentsUndirectedGraph_323;

class UnionFind {
	int[] roots;
	int[] size;
	int components;
	
	UnionFind(int size){
		this.roots = new int[size];
		this.size = new int[size];
		this.components = size;
		
		for(int i=0; i<size; i++) {
			this.size[i] = 1;
			this.roots[i] = i;
		}	
	}
	
	public int find(int ob1) {
		int root = ob1;
		while(root != roots[root]) root = roots[root];
		
		roots[ob1] = root;
		return root;
	}
	
	public boolean connected(int ob1, int ob2) {
		return (find(ob1) == find(ob2));
	}
	
	public void unify(int ob1, int ob2) {
		if(connected(ob1, ob2)) return;
		
		int r1 = find(ob1);
		int r2 = find(ob2);
		
		components--;
		
		if(size[r1] > size[r2]) {
			size[r1] += size[r2];
			roots[r2] = r1;
			size[r2] = 0;
		}
		else {
			size[r2] += size[r1];
			roots[r1] = r2;
			size[r1] = 0;
		}
	}
}
