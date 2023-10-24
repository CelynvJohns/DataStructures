package tree;

/**
 * Celyn Johns
 */

class Node {
	String sData;
	int iData;
	Node left;
	Node right;

	/**
	 * @param sData
	 * @param iData
	 */
	public Node(String sData, int iData) {
		this.sData = sData;
		this.iData = iData;
		left = null;
		right = null;
	}
}
