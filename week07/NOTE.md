<u>学习笔记</u>

<u>Trie树</u>

-build a tree that can quickly lookup words

<u>Disjoint Set</u>

To determine the data belongs to how many distinct set

**<u>双向 BFS 代码模版</u>**

public void doubeBFS(String start, String end, Set<String> searchSet){
 HashSet<String> beginSet = new HashSet<>();
        HashSet<String> endSet = new HashSet<>();
        HashSet<String> visitedSet = new HashSet<>();
        if (!searchSet.contains(end)) return 0;

        beginSet.add(begin);
        endSet.add(end);

  while (!beginSet.isEmpty() && !endSet.isEmpty()) {

 if (beginSet.size() > endSet.size()) {
                HashSet<String> tempSet = beginSet;
                beginSet = endSet;
                endSet = tempSet;
            }

//hold the BFS results
            HashSet<String> temp = new HashSet<>();
            for (String string : beginSet) {
 		//process logic 
	       if (endSet.contains(newWord)) return;
		
		if (visitedSet.add(newWord)) temp.add(newWord); 
	    }
	beginSet = temp;
}
}



**<u>AVL , Red black Tree</u>**

AVL - well defined balance tree-> good for case whereby searching > insert , e.g Database

RBT - near balance tree -> good for insert 